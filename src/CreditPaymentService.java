public class CreditPaymentService {
    public int calculate(int n, int y, double p) {
        double r = p / 100 / 12;
        double index = n * ((r * Math.pow((1 + r), 12 * y)) / (Math.pow((1 + r), 12 * y) - 1));
        int result = (int) index;
        return result;
    }

}
