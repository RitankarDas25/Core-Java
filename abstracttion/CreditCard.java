package abstracttion;

public class CreditCard extends Payment{

	public CreditCard(double amount, String transactionId) {
		super(amount, transactionId);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processPayment(double amount, String transactionId) {
		// TODO Auto-generated method stub
		System.out.println("Processing Credit Card Payment...");
		System.out.println("Transaction ID: "+transactionId);
		System.out.println("Original Amount: $"+amount);
		if(amount>500)
		{
			System.out.println("Discount Applied: $"+(0.1*amount));
		}
		else
			System.out.println("Discount Applied: $0.0");
		System.out.println("Transaction Fee: $"+(0.02*amount));
		System.out.println("Final Payable Amount"+(amount-(0.1*amount)+(0.02*amount)));
		System.out.println("Credit Card Payment Successful!");
	}
	

}
