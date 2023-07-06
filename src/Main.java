public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double percent = 9.99;
        int credit = 1_000_000;
        int month = 36;
        int creditpayment = service.calculate(percent, credit, month);

        System.out.println(creditpayment);

    }
}