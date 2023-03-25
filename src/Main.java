public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int amountOffCredit = 1_000_000; // Сумма кредита
        int creditTerm = 12; // Срок кредита
        double interestRate = 9.99; // Процентная ставка годовых в процентах

        int monthlyPayment = service.calculate(amountOffCredit, creditTerm, interestRate);


        System.out.println(monthlyPayment);
    }
}