public class Main {
    public static void main(String[] args) {
        CreditCalculator creditCalculator = new CreditCalculator();

        System.out.println(creditCalculator.overpaymentCalculationFoTheEntirePeriod
                (300_000, 15, 18));
    }
}
