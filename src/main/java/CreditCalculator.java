import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CreditCalculator {

    public double MonthlyPayment(double amountOfCredit, double interestRate, int term) {
        return 0;
    };

    public double totalAmountToBeReturned(double amountOfCredit, double interestRate, int term) {
        return 0;
    }

    public double overpaymentCalculationFoTheEntirePeriod(double amountOfCredit, double interestRate, int term) {
        return 0;
    }

}
