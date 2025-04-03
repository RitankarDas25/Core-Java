package stringbuffer;

public class Ritankar {
public static void main(String[] args) {
	StringBuffer str = new StringBuffer();
	str.append("Ritz");
	str.append(false);
	System.out.println(str);
	str.insert(2, "lol");
	
	str.reverse();
	System.out.println(str);
	str.setCharAt(0,'a');
}
}
