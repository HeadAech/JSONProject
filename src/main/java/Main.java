import org.json.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        List<Country> list1 = JSONreader.createJsonList("poland", "2020-07-01", "2020-08-01");

        System.out.println(list1.toString());
    }
}
