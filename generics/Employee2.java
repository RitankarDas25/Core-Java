package generics;

public class Employee2<T> {
	T data1;
	T data2;
	Employee2(T data1,T data2){
		this.data1=data1;
		this.data2=data2;
	}
	
	public String toString() {
		return data1 +"  "+data2;
	}
	public static <T> void print(T [] arr) {
		for(T i :arr)
			System.out.print(i+" ");
		System.out.println();
	}
	public static void main(String[] args) {
		Employee2<Integer> e1= new Employee2<Integer>(10,20);
		System.out.println(e1);
		System.out.println(e1.data1 instanceof Integer);
		Employee2<String> e2 = new Employee2<String>("hello","world");
		System.out.println(e2);
		Integer[] arr1= {1,2,3,4};
		String[] arr2= {"a","b","c"};
		print(arr1);
		print(arr2);
		
	}

}
