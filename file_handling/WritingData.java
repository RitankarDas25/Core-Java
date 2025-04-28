package file_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingData {
public static void main(String[] args) throws IOException {
	String path ="C:\\Users\\User\\Desktop\\filehandling\\test.txt";
	
	File file = new File(path);
	//FileOutputStream fos = new FileOutputStream(file); to rewrite
	FileOutputStream fos = new FileOutputStream(file, true);  //to append with existing text
	String message = "hello";
//	byte[] arr= message.getBytes();
//	fos.write(arr);
	for(int i=0;i<message.length();i++) {
		fos.write(message.charAt(i));
	}
}
}
