import org.json.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        JSONArray jsonArray = JSONreader.getJsonFromUrl("https://api.covid19api.com/country/poland?from=2020-06-01T00:00:00Z&to=2020-07-01T00:00:00Z");

        for(int i = 0; i < jsonArray.size(); i++){
            System.out.println(jsonArray.get(i).toString());
        }
    }
}
