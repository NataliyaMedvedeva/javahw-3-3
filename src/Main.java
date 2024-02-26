public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int summa = 1_000_000;
        int year = 3;
        double percent = 9.99;

        int payment = service.calculate(summa, year, percent);
        System.out.println(payment);
    }
}