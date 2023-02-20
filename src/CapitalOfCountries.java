public enum CapitalOfCountries {

    BISHKEK("Very beatiful city ","Capital of Bishkek"),
    LONDON("Has a  Big Ben","Great Britain"),
    PARIS("Has a Eyfil tower","capital of France "),
    MADDRID("Has a Real Madrid ","capital of Spain"),
    ROME("has a colizei ","Capital of Italy");


   private  String special;
   private  String capital;

    CapitalOfCountries(String special, String capital) {
        this.special = special;
        this.capital = capital;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    @Override
    public String toString() {
        return "CapitalOfCountries{" +
                "special='" + special + '\'' +
                ", capital='" + capital + '\'' +
                '}';
    }
}
