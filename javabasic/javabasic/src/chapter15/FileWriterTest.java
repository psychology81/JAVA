package chapter15;

import java.io.FileWriter;
import java.io.IOException;



public class FileWriterTest {
	public static void main(String[] args) {
		try(FileWriter fw =new FileWriter("writer.txt")) {
			fw.write('A');
			char buf[]= {'B', 'C', 'D', 'E', 'F'};
			
			fw.write(buf);
			fw.write("안녕오늘은0726");
			fw.write(buf, 1, 2);
			fw.write("65");
		} catch(IOException e) {
			e.printStackTrace();
			
			
	
		}
	}

}
