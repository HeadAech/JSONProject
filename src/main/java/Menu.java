import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public void menu() throws IOException, ParseException {
        System.out.println("Wybierz opcję z listy:");
        System.out.println("1. Informacje o jednym kraju.");
        System.out.println("2. Porównanie dwóch krajów.");
        System.out.println("//////////");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                infoOneCountry();
                break;
            case 2:
                twoCountriesComparison();
                break;
        }
    }

    public void infoOneCountry() throws IOException, ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę kraju:");
        String countryName = scanner.nextLine();
        System.out.println("Podaj datę początkową (format: ROK-MIESIAC-DZIEN, yyyy-mm-dd):");
        String dateFrom = scanner.nextLine();
        System.out.println("Podaj datę końcową (format: ROK-MIESIAC-DZIEN, yyyy-mm-dd):");
        String dateTo = scanner.nextLine();

        List<Country> list = JSONreader.createJsonList(countryName, dateFrom, dateTo);
        List<FinalCountry> finalList = JSONservice.prepareData(list);
        JSONsaver.saveToJsonFile(finalList, countryName);

    }

    public void twoCountriesComparison(){

    }
}
