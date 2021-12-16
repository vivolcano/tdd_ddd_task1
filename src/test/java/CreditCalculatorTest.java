import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CreditCalculatorTest {

    public static CreditCalculator creditCalculator;
    public static double amountOfCredit;
    public double interestRate;
    public static int term;

    @BeforeEach
    void setUp() {
       creditCalculator = new CreditCalculator();
       amountOfCredit = 300_000;
       interestRate = 15;
       term = 18;
    }

    @Test
    @DisplayName("Проверка корректности расчета ежемесяного платежа при параметрах:" +
            " 300 000 у.е., 15%, 18 месяцев")
    void calculationOfMonthlyPayment() {
        double expected = 18715.436179550114;
        double actual = creditCalculator.MonthlyPayment
                (amountOfCredit, interestRate, term);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Проверка корректности расчета общей суммы к возврату в банк при параметрах:" +
            " 300 000 у.е., 15%, 18 месяцев")
    void calculationOfTheTotalAmountToBeReturned() {
        double expected = 336877.851231902;
        double actual = creditCalculator.totalAmountToBeReturned
                (amountOfCredit, interestRate, term);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Проверка корректности расчета переплаты за весь период при параметрах:" +
            " 300 000 у.е., 15%, 18 месяцев")
    void overpaymentCalculationFoTheEntirePeriod() {
        double expected = 36877.85123190202;
        double actual = creditCalculator.overpaymentCalculationFoTheEntirePeriod
                (amountOfCredit, interestRate, term);

        Assertions.assertEquals(expected, actual);
    }
}