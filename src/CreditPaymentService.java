public class CreditPaymentService {
    public double calculate(long s, int t, double p) {
        double i = Math.pow(1 + (p / 12), t);
        double k = ((p / 12) * i) / (i - 1);
        double payment = s * k;
        return payment;
    }
}

