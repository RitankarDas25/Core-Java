package abstracttion;

public class PaymentDriver {
public static void main(String[] args) {
Payment p1 = new CreditCard(600.0,"TXN12345")	;
Payment p2 = new PayPal(300.0,"TXN67890")	;
	p1.processPayment(600.0,"TXN12345");
	p2.processPayment(300.0,"TXN67890");
}
}
