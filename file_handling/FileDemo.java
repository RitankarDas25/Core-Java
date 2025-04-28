package file_handling;

import java.io.File;

public class FileDemo {
public static void main(String[] args) {
	String path= "C:\\Users\\User\\Desktop\\filehandling\\test.txt";
	File file = new File(path);
	file.mkdirs();
//	File rename = new File("C:\\Users\\User\\Desktop\\filehandling\\wtf");
//	
//	file.renameTo(rename);
//	System.out.println(file.getAbsolutePath());
//	System.out.println(file.getName());
	String[]arr = file.list();
	for(String s : arr) {
		System.out.println(s);
	}
	System.out.println(file.canRead());
	System.out.println(file.canWrite());
}
}
