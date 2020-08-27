public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();


        double monthlyPayment = service.calculate(1000000, 9.99, 12);
        System.out.println("Ваш ежемесячный платеж равен = " + monthlyPayment);

        double monthlyPayment1 = service.calculate(1000000, 9.99, 24);
        System.out.println("Ваш ежемесячный платеж равен = " + monthlyPayment1);

        double monthlyPayment2 = service.calculate(1000000, 9.99, 36);
        System.out.println("Ваш ежемесячный платеж равен = " + monthlyPayment2);
    }
}