public class CreditPaymentService {
    public int calculate(int summa, int year, double percent) {
        double monthlyPercentage = percent / 100 / 12;
        double index = summa * ((monthlyPercentage * Math.pow((1 + monthlyPercentage), 12 * year)) / (Math.pow((1 + monthlyPercentage), 12 * year) - 1));
        int result = (int) index;
        return result;
    }

}
