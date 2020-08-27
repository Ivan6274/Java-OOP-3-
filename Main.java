public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

         double monthlyPayment = service.calculate(1000000 , 9.99 ,36 );
        System.out.println("Ваш ежемесячный платеж равен = " + monthlyPayment);
    }
}