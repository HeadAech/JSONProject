import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class JSONsaver {
    public static void saveToJsonFile(List<FinalCountry> data, String fileName) throws IOException {
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.serializeSpecialFloatingPointValues().setPrettyPrinting().create();
        String filePath = fileName + ".json";
        gson.toJson(data, new FileWriter(filePath));
    }

}
