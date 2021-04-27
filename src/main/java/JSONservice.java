import java.util.ArrayList;
import java.util.List;

public class JSONservice {
    public static List<FinalCountry> prepareData(List<Country> countryList){
        List<FinalCountry> finalCountryList = new ArrayList<>();
        for(int i = 0; i < countryList.size(); i++){
            int rec = countryList.get(i).getRecovered();
            int deaths = countryList.get(i).getDeaths();
            int conf = countryList.get(i).getConfirmed();
            double rtdr = (double) rec / (double) deaths;
            double rtcsr = (double) rec / (double) conf;
            if(deaths == 0){
                rtdr = 0;
            }
            if(conf == 0){
                rtcsr = 0;
            }
            finalCountryList.add(new FinalCountry(countryList.get(i), rtdr, rtcsr));
        }
        return finalCountryList;
    }

    public static List<FinalCountry> prepareDataTwoCountries(List<Country> countryList1, List<Country> countryList2){
        List<FinalCountry> finalCountryList = new ArrayList<>();
        System.out.println(countryList1.size());
        System.out.println(countryList2.size());
        for(int i = 0; i < countryList1.size(); i++){
            int leftD = countryList1.get(i).getDeaths();
            int leftR = countryList1.get(i).getRecovered();
            int leftC = countryList1.get(i).getConfirmed();

            int rightD = countryList2.get(i).getDeaths();
            int rightR = countryList2.get(i).getRecovered();
            int rightC = countryList2.get(i).getConfirmed();

            double leftDToRight = (double) leftD / (double) rightD;
            double leftRToRight = (double) leftR / (double) rightR;
            double leftCToRight = (double) leftC / (double) rightC;

            if(rightD == 0){
                leftDToRight = 0;
            }if(rightR == 0){
                leftRToRight = 0;
            }if(rightC == 0){
                leftCToRight = 0;
            }
            finalCountryList.add(new FinalCountry(countryList1.get(i), countryList2.get(i), leftDToRight, leftCToRight, leftRToRight));

        }
        return finalCountryList;
    }
}
