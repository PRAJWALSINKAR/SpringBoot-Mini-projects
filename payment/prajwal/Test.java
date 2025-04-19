package payment.prajwal;

public class Test {
    public static void main(String[] args) {
    Service service = new Service(new CreditCard());
    service.pay(100);
} 
}
    

