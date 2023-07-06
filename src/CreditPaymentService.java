public class CreditPaymentService {
    public int calculate(double percent, int credit, int month) {
        double onemonpercent = percent / 12 / 100;
        double a = 1 + onemonpercent;
        double payment = credit * onemonpercent * (Math.pow(a, month)) / ((Math.pow(a, month)) - 1);
        int creditpayment = (int) payment;
        return creditpayment;
    }

}
