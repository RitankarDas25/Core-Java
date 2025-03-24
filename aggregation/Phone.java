package aggregation;

public class Phone {
	String name;
	Sim sim;
	public Phone(String name,Sim sim)
	{
		this.name=name;
		this.sim = sim;
	}
	public void display()
	{
		System.out.println(name +" "+ this.sim.phoneNo);
	}
}
