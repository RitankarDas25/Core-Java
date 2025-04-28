package file_handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadingData {
public static void main(String[] args) throws IOException {
	String path ="C:\\Users\\User\\Desktop\\filehandling\\test.txt";
	File file = new File(path);
	FileInputStream fis = new FileInputStream(file);
	int x;
	while((x=fis.read())!=-1) {
		System.out.println((char)x);
	}
}
}

