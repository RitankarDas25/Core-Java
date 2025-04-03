package university_management;

import one_to_many.Customer;

public class University {
private Person[] people = new Person[5];
static int index=0;
public void addPerson(Person person){
	
		if(index<people.length) {
			people[index++]= person;
			System.out.println("person added");
		}
		else
			System.out.println("array is full");
}
public void showPeople()
{
	for(int i=0;i<index;i++)
		people[i].displayInfo();
}
	
	
}


