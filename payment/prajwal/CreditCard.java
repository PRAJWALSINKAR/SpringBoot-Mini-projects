package payment.prajwal;

public class CreditCard implements ipayment {
    public boolean payment(int amt){
        System.out.println("CreditCard processing");
        return true;
    }
}
