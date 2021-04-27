public class FinalCountry {
    private Country country;
    private Country leftCountry;
    private Country rightCountry;
    private Double recoveredToDeathRatio;
    private Double recoveredToConfirmedCasesRatio;
    private Double leftDeathstoRight;
    private Double leftRecoveredToRight;
    private Double leftConfirmedToRight;

    public FinalCountry(Country country, Double recoveredToDeathRatio, Double recoveredToConfirmedCasesRatio){
        this.country = country;
        this.recoveredToDeathRatio = recoveredToDeathRatio;
        this.recoveredToConfirmedCasesRatio = recoveredToConfirmedCasesRatio;
    }

    public FinalCountry(Country leftCountry, Country rightCountry, Double leftDeathstoRight, Double leftConfirmedToRight, Double leftRecoveredToRight){
        this.leftCountry = leftCountry;
        this.rightCountry = rightCountry;
        this.leftDeathstoRight = leftDeathstoRight;
        this.leftConfirmedToRight = leftConfirmedToRight;
        this.leftRecoveredToRight = leftRecoveredToRight;
    }
}
