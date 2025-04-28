package map_collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
public static void main(String[] args) {
	TreeMap tm = new TreeMap((o1,o2)->(Integer)o2 - (Integer)o1);//lamda expressions
	tm.put(1,"hello");
	tm.put(9,89);
	tm.put(2,78);
//	System.out.println(tm);
//	System.out.println(tm.containsKey(2));
//	System.out.println(tm.containsValue("hello"));
//	System.out.println(tm.replace(9,"world"));
//	System.out.println(tm.replace(9,"world",100));
//	System.out.println(tm);
	Set<Integer> set = tm.keySet();
	Iterator<Integer> itr1 =set.iterator();
	while(itr1.hasNext()) {
		System.out.println(itr1.next()); //prints keys
		
	}
	
	Collection<String> c = tm.values();
	Iterator itr2 =c.iterator();
	while(itr2.hasNext()) {
		System.out.println(itr2.next()); //print values
	}
	
	Set s = tm.entrySet();
	Iterator itr3=s.iterator();
	while(itr3.hasNext()) {
		System.out.println(itr3.next()); //prints key value pair
	}
	
	for(Object o:s) {
		System.out.println(o); // prints key value pair
	}
	TreeMap <String ,List<String>> map= new TreeMap();

	List<String> l1 = Arrays.asList("HYD","BLR","CCU");
	List<String> l2 = Arrays.asList("HJ&K","NCR","KOL");
	
	map.put("SBI", l1);
	map.put("ICICI", l2);
	
	Set<Map.Entry<String, List<String>>> s1 = map.entrySet();
	Iterator<Map.Entry<String, List<String>>> i = s1.iterator();

	while (i.hasNext()) {
	    Map.Entry<String, List<String>> entry = i.next();
	    String key = entry.getKey();
	    List<String> value = entry.getValue();

	    System.out.println("Bank: " + key);
	    for (String branch : value) {
	        System.out.println("  Branch: " + branch);
	    }
	
	}
}
}
