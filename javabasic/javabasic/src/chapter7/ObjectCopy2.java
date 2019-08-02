package chapter7;

public class ObjectCopy2 {

	public static void main(String[] args) {
	Book[] bookArray1 = new Book[3];
	Book[] bookArray2 = new Book[3];
	
	bookArray1[0] = new Book("태백산맥", "조정래");
	bookArray1[1] = new Book("데미안", "헤르만 헤세");
	bookArray1[2] = new Book("어떻게 살 것인가", "유시민");
	
	//배열복사 
	System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
	
	for(int i=0; i < bookArray2.length; i++ ) {
		bookArray2[i].showBookInfo();
	} // 복사하고 난 다음에 결과값을 출력해보는 것
	
	
	//원본 값을 변경
	System.out.println("=== bookArray1 ===");
	bookArray1[0].setBookName("나목");
	bookArray1[0].setAuthor("박완서");
	//원본값확인
	System.out.println("원본배열1");
	bookArray1[0].showBookInfo();
	
	// 사본 값을 확인
	System.out.println("사본배열1");
	bookArray2[0].showBookInfo();	
	


	} // main

} // class
