package abstracttion;

public abstract class Payment {
	private double amount;
	private String transactionId;
	public Payment(double amount,String transactionId) {
		this.amount=amount;
		this.transactionId=transactionId;
	}
	public abstract void processPayment(double amount,String transactionId) ;

}
