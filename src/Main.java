public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        long s=1000000;
        int t=12;
        double p=0.0999;
        int paymentOneYear = (int) service.calculate(s, t, p);
        System.out.println(paymentOneYear);
        s = 1_000_000;
        t = 24;
        p = 0.0999;
        int paymentTwoYears = (int) service.calculate(s, t, p);
        System.out.println(paymentTwoYears);
        s = 1000000;
        t = 36;
        p = 0.0999;
        int paymentThreeYears = (int) service.calculate(s, t, p);
        System.out.println(paymentThreeYears);
    }
}
