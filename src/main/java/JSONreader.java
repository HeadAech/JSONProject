
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JSONreader {
    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }

    public static JSONArray getJsonFromUrl(String urlString) throws IOException, ParseException {
        URL url = new URL(urlString);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.connect();
        int responsecode = conn.getResponseCode();
        if (responsecode != 200) {
            throw new RuntimeException("HttpResponseCode: " + responsecode);
        } else {

            String inline = "";
            Scanner scanner = new Scanner(url.openStream());

            //Write all the JSON data into a string using a scanner
            while (scanner.hasNext()) {
                inline += scanner.nextLine();
            }

            //Close the scanner
            scanner.close();

            //Using the JSON simple library parse the string into a json object
            JSONParser parse = new JSONParser();
            JSONArray data_obj = (JSONArray) parse.parse(inline);

           return data_obj;
        }
    }

    public static List<Country> createJsonList(String country, String dateFrom, String dateTo) throws IOException, ParseException {
        List<Country> data = new ArrayList<>();
        JSONArray jsonArray = getJsonFromUrl("https://api.covid19api.com/country/"+country+"?from="+dateFrom+"&to"+dateTo);

        for(int i = 0; i < jsonArray.size(); i++){
            JSONObject json = (JSONObject) jsonArray.get(i);
            Country countryObj = new Country(Integer.parseInt(json.get("Recovered").toString()), Integer.parseInt(json.get("Deaths").toString()), Integer.parseInt(json.get("Active").toString()), Integer.parseInt(json.get("Confirmed").toString()), json.get("Country").toString(), json.get("Date").toString());
            data.add(countryObj);
        }

        return data;
    }

}
