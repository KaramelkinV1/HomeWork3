//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new  CreditPaymentService();
        int payment1 = service.calculate(1_000_000,9.99, 12);
        int payment2 = service.calculate(1_000_000,9.99, 24);
        int payment3 = service.calculate(1_000_000,9.99, 36);
        System.out.println(payment1);
        System.out.println(payment2);
        System.out.println(payment3);

    }
}