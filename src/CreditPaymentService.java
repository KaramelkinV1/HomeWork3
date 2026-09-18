public class CreditPaymentService {
    public int calculate (int amount, double rate, int months) {
        double monthlyRate;
        monthlyRate = rate / 100 / 12;
        double coefficient;
        coefficient = Math.pow( 1 + monthlyRate, months );
        double payment;
        payment = (amount * monthlyRate * coefficient) / (coefficient - 1);
        return (int) payment;

    }

}

