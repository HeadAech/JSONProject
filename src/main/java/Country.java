public class Country {
    private int recovered;
    private int deaths;
    private int active;
    private int confirmed;
    private String country;
    private String date;

    public Country(int recovered, int deaths, int active, int confirmed, String country, String date){
        this.recovered = recovered;
        this.deaths = deaths;
        this.active = active;
        this.confirmed = confirmed;
        this.country = country;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Country{" +
                "recovered=" + recovered +
                ", deaths=" + deaths +
                ", active=" + active +
                ", confirmed=" + confirmed +
                ", country='" + country + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
