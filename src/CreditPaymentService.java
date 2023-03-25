public class CreditPaymentService {
    public int calculate(int amountOffCredit, int creditTerm, double interestRate) {

        double i = interestRate / 1200; // процентная ставки за 1 месяц
        double k = (i * Math.pow(1 + i, creditTerm)) / (Math.pow(1 + i, creditTerm) - 1);
        double a = amountOffCredit * k;

        return (int) a;

    }


}
