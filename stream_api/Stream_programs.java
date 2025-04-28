package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Stream_programs {
public static void main(String[] args) {
	List<Integer> list=Arrays.asList(2,3,1,2,5,8,7,4,3,1);
	OptionalDouble average = list.stream()
		      .mapToDouble(Integer::doubleValue)
		      .average();
	System.out.println(average);
	
	List < String > colors = Arrays.asList("RED", "grEEn", "white", "Orange", "pink");
    System.out.println("List of strings: " + colors);
    // Convert strings to uppercase using streams
    List < String > uppercaseStrings = colors.stream()
      .map(String::toUpperCase)
      .collect(Collectors.toList());

    System.out.println("\nUppercase Strings: " + uppercaseStrings);

    // Convert strings to lowercase using streams
    List < String > lowercaseStrings = colors.stream()
      .map(String::toLowerCase)
      .collect(Collectors.toList());

    System.out.println("Lowercase Strings: " + lowercaseStrings);
    List < Integer > numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    // Sum of even numbers
    int sumOfEvens = numbers.stream()
      .filter(num -> num % 2 == 0)
      .mapToInt(Integer::intValue)
      .sum();

    System.out.println("Sum of even numbers: " + sumOfEvens);
    int sumOfOdds = numbers.stream()
    	      .filter(num -> num % 2 != 0)
    	      .mapToInt(Integer::intValue)
    	      .sum();

    	    System.out.println("Sum of odd numbers: " + sumOfOdds);
    	    List < Integer > nums = Arrays.asList(10, 23, 22, 23, 24, 24, 33, 15, 26, 15);
    	    System.out.println("Original List of numbers: " + nums);
    	    // Remove duplicates
    	    List < Integer > distinctNumbers = nums.stream()
    	      .distinct()
    	      .collect(Collectors.toList());
    	    System.out.println("After removing duplicates from the said list: " + distinctNumbers);
}
}

