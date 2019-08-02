package chapter15;

import java.io.FileReader;
import java.io.IOException;


public class FileReaderTest {
public static void main(String[] args) {
	try(FileReader fr= new FileReader("d:\\data\\input.txt")) {
	int i;
	while((i=fr.read()) != -1) {
		System.out.println((char)i);
	} // while
	} //main
	catch (IOException e) {
		e.printStackTrace();
	}//catch

	
}// end of class
}