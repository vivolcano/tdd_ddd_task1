import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CreditCalculator {

    public double MonthlyPayment(double amountOfCredit, double interestRate, int term) {
        return amountOfCredit * annuityPaymentRatio(interestRate, term);
    };

    public double totalAmountToBeReturned(double amountOfCredit, double interestRate, int term) {
        return MonthlyPayment(amountOfCredit, interestRate, term) * term;
    }

    public double overpaymentCalculationFoTheEntirePeriod(double amountOfCredit, double interestRate, int term) {
        return totalAmountToBeReturned(amountOfCredit, interestRate, term) - amountOfCredit;
    }

    private double annuityPaymentRatio(double interestRate, int term) {
        double mouthRatio = interestRate / 12 / 100;
        return mouthRatio * Math.pow((1 + mouthRatio), term) / (Math.pow((1 + mouthRatio), term) - 1);
    }
}
