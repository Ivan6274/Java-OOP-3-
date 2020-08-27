public class CreditPaymentService {
    public double calculate (double sumCredit, double annualRate, double creditPeriod) {
        double monthRate = annualRate/100/12;
        double monthlyPayment = sumCredit*(monthRate+monthRate/((Math.pow(1+monthRate,creditPeriod)-1 )));
        return  (int)monthlyPayment;
    }
}
