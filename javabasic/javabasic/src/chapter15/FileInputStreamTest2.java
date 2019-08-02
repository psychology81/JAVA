package chapter15;


import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamTest2 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("d:\\data\\input.txt");
			int i;
			while((i = fis.read()) != -1) {
				  System.out.printf("(char)i"); // 읽어온 바이트를 문자로 변환해 ㅜㅊㄹ력
			
	
			}
		} // try
		
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (I0Exception e) {
			e.printStackTrace();
			
		
	 	} // catch
		
		
		
		
	} // end of main 

} // end of class
