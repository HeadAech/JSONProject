public class FinalCountry {
    private Country country;
    private Country leftCountry;
    private Country rightCountry;
    private Double recoveredToDeathRatio;
    private Double recoveredToConfirmedCasesRatio;
    private Double leftDeathstoRightRatio;
    private Double leftRecoveredToRightRatio;
    private Double leftConfirmedToRightRatio;

    public FinalCountry(Country country, Double recoveredToDeathRatio, Double recoveredToConfirmedCasesRatio){
        this.country = country;
        this.recoveredToDeathRatio = recoveredToDeathRatio;
        this.recoveredToConfirmedCasesRatio = recoveredToConfirmedCasesRatio;
    }

    public FinalCountry(Country leftCountry, Country rightCountry, Double leftDeathstoRightRatio, Double leftConfirmedToRightRatio, Double leftRecoveredToRightRatio){
        this.leftCountry = leftCountry;
        this.rightCountry = rightCountry;
        this.leftDeathstoRightRatio = leftDeathstoRightRatio;
        this.leftConfirmedToRightRatio = leftConfirmedToRightRatio;
        this.leftRecoveredToRightRatio = leftRecoveredToRightRatio;
    }
}
