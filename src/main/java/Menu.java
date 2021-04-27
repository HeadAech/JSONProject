import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public static void menu() throws IOException, ParseException {
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

    public static void infoOneCountry() throws IOException, ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę kraju (angielska, małymi literami np. poland):");
        String countryName = scanner.nextLine();
        System.out.println("Podaj datę początkową (format: ROK-MIESIAC-DZIEN, yyyy-mm-dd):");
        String dateFrom = scanner.nextLine();
        System.out.println("Podaj datę końcową (format: ROK-MIESIAC-DZIEN, yyyy-mm-dd):");
        String dateTo = scanner.nextLine();

        List<Country> list = JSONreader.createJsonList(countryName, dateFrom, dateTo);
        List<FinalCountry> finalList = JSONservice.prepareData(list);
        JSONsaver.saveToJsonFile(finalList, countryName);

    }

    public static void twoCountriesComparison() throws IOException, ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PIERWSZY KRAJ");
        System.out.println("Podaj nazwę kraju (angielska, małymi literami np. poland):");
        String countryName1 = scanner.nextLine();
        System.out.println("DRUGI KRAJ");
        System.out.println("Podaj nazwę kraju (angielska, małymi literami np. poland):");
        String countryName2 = scanner.nextLine();

        System.out.println("Podaj datę początkową (format: ROK-MIESIAC-DZIEN, yyyy-mm-dd):");
        String dateFrom = scanner.nextLine();
        System.out.println("Podaj datę końcową (format: ROK-MIESIAC-DZIEN, yyyy-mm-dd):");
        String dateTo = scanner.nextLine();


        List<Country> list1 = JSONreader.createJsonList(countryName1, dateFrom, dateTo);
        List<Country> list2 = JSONreader.createJsonList(countryName2, dateFrom, dateTo);
        System.out.println(list1);
        System.out.println(list2);
        List<FinalCountry> finalCountryList = JSONservice.prepareDataTwoCountries(list1, list2);
        JSONsaver.saveToJsonFile(finalCountryList, "comparison-" + countryName1 + "-" + countryName2);

    }
}
