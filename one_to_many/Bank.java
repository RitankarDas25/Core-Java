package one_to_many;

public class Bank {
Customer[] customers;
String bankName;
static int index=0;
public Bank(int size,String bankName) {
	this.customers = new Customer[size];
	this.bankName=bankName;
}
public void addCustomer(Customer customer) {
	if(index<customers.length) {
		customers[index++] = customer;
		System.out.println("Customer Added");
	}
	else
	{
		System.out.println("Cannot add customer, array is full");
	}
}
public void displayCustomer()
{
	for(int i=0;i<index;i++)
		System.out.println(customers[i].customerName);
}
public void removeCustomer(int id)
{
	for(int i=0;i<index;i++) {
		if(this.customers[i].id==id)
		{	for(int j=i;j<index-1;j++)
				this.customers[j]=this.customers[j+1];
		index--;
		
		System.out.println("customer deleted");
		return;
		}
		else 
		System.out.println("id not found");
}
}
public void updateCustomer(String customerName,int id)
{
	for(int i=0;i<index;i++) {
		if(this.customers[i].id==id)
			this.customers[i].customerName=customerName;
}
System.out.println("customer updated");
}
public String fetch(int id)
{
	for(int i=0;i<index;i++) {
		if(this.customers[i].id==id)
			return this.customers[i].customerName;
	
}
	return "customer not found";
}
}
