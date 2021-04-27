import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class JSONsaver {
    public static void saveToJsonFile(List<FinalCountry> data, String fileName) throws IOException {
        Gson gson = new Gson();
        String filePath = fileName + ".json";
        gson.toJson(data, new FileWriter(filePath));
    }

}
