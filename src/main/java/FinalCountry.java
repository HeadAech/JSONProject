public class FinalCountry {
    private int recovered;
    private int deaths;
    private int active;
    private int confirmed;
    private Double recoveredToDeathRatio;
    private String country;
    private String date;

    public FinalCountry(int recovered, int deaths, int active, int confirmed, Double recoveredToDeathRatio, String country, String date){
        this.recovered = recovered;
        this.deaths = deaths;
        this.active = active;
        this.confirmed = confirmed;
        this.recoveredToDeathRatio = recoveredToDeathRatio;
        this.country = country;
        this.date = date;
    }
}
