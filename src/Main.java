public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int paymentOneYear = (int) service.calculate(1_000_000, 12, 0.0999);
        System.out.println(paymentOneYear);

        int paymentTwoYears = (int) service.calculate(1_000_000, 24, 0.0999);
        System.out.println(paymentTwoYears);

        int paymentThreeYears = (int) service.calculate(1_000_000, 36, 0.0999);
        System.out.println(paymentThreeYears);
    }
}
