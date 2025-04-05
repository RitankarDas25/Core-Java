package comparable_and_comparator;

public class Person implements Comparable {
String name;
int age;
public Person(String name,int age) {
	this.name=name;
	this.age=age;
}
@Override
public int compareTo(Object o) {
	Person p = (Person)o;
	int temp = this.name.compareToIgnoreCase(p.name);
	if(temp>=1)
		return 2;
	else if (temp<=-1)
		return -2;
	else
	{
		int x = this.age - p.age;
		if(x<=-1)
			return -1;
		else if(x>=1)
			return 1;
		else
			return 0;
	}
}
}
