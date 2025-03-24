package aggregation;

public class Driver {
public static void main(String[] args) {
	Sim sim = new Sim(123456789);
	Phone phone = new Phone("samsung",sim);
	phone.display();
	phone=null;
	System.out.println(sim.phoneNo);
	Customer customer = new Customer("Ritz");
	Bank bank = new Bank("SBI",customer);
	bank.display();
	System.out.println(customer.customerName);
}
}
