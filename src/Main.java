public class Main {
    public static void main(String[] args) {

        CapitalOfCountries [] capitalOfCountries=CapitalOfCountries.values();

        for (CapitalOfCountries c:capitalOfCountries
             ) {
            System.out.println(c.toString());

        }
    }
}