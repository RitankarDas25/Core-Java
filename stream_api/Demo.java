package stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

//stream api is feature of java 8
// it is used to process collections with functional style operations without writing loops
//need of stream api :
// 1) avoid loops
// 2) avoid modification in input collections
// 3) doing bulk data transformation
// 4) to perform chain of collections in a concise way
// 5) to parallel processing 
public class Demo {
public static void main(String[] args) {
	List<Integer> list = Arrays.asList(2,3,1,2,5,8,7,4,3,1);
	System.out.println(list);
//	Stream s =list.stream();
//	Stream s2 =s.distinct();
//	s2.forEach(n -> System.out.println(n));
	list.stream().distinct().forEach(n-> System.out.println(n));
	Optional<Integer> optional = list.stream().distinct().min((o1,o2) -> o1 -o2); //gets the min element
	if(optional.isPresent()) {
		System.out.println(optional.get());
	}
Integer i =	list.stream().max((o1,o2) -> o1 -o2).get(); // gets the max element
System.out.println(i);

list.stream().sorted().forEach(n -> System.out.print(n+" ")); //sorts
System.out.println();
list.stream().sorted((o1,o2) ->o2-o1).forEach(n-> System.out.print(n+" ")); //sort decending
System.out.println();
list.stream().sorted((o1,o2) ->o2-o1).map(n-> n*n ).forEach(n-> System.out.print(n+" ")); // gives squares of elements
System.out.println();
list.stream().sorted((o1,o2) ->o2-o1).filter(n-> n%2 ==0).forEach(n-> System.out.print(n+" "));// gives only even elements
System.out.println();
List<Integer> li = list.stream().distinct().filter(n->n%2==0).toList();
System.out.println(li);
Stream s = Stream.of(1,4,7,"demo");
s.forEach(n->System.out.print(n+" "));
System.out.println();
Optional <Integer> op = list.stream().findFirst();
System.out.println(op.get() ); // gives the first element

System.out.println(list.stream().findAny().get());

System.out.println(list.stream().count() ); ///counts number of elements

List<String> strings = Arrays.asList("hello","demo");
List<Integer> num =Arrays.asList(1,2,3);

Stream s1 = strings.stream();
Stream s2 = num.stream();

Stream.concat(s1, s2).forEach(n -> System.out.print(n +" ")); // concats 2 streams
System.out.println();

System.out.println(list.stream().distinct().allMatch(n-> n%2==0)); // checks if all elements are divisible by 2

System.out.println(list.stream().distinct().anyMatch(n->n%2==0)); // checks if any element is divisible by 2
//System.out.println(list);
}
}
