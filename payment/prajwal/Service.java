package payment.prajwal;

public class Service {
    ipayment Ipayment;

    public Service(ipayment Ipayment) {
        //TODO Auto-generated constructor stub
        this.Ipayment = Ipayment;
    }
    public void pay(int amt){
        boolean status = Ipayment.payment(amt);

        if(status){
            System.out.println("payment succefull");
        }
        else
        System.out.println("not");
    }
}
