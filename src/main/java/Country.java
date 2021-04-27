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

    public int getRecovered() {
        return recovered;
    }

    public void setRecovered(int recovered) {
        this.recovered = recovered;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public int getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(int confirmed) {
        this.confirmed = confirmed;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
