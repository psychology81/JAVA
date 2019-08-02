package chapter7;

public class DeepCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("태백산맥", "조정래");
		bookArray1[1] = new Book("데미안", "헤르만 헤세");
		bookArray1[2] = new Book("어떻게 살 것인가", "유시민");
		
		
		
		//북인스턴스를 새로 하나 만들어서 어레이 2의 0번째 요소에 대입해라
		bookArray2[0] = new Book(); 
		bookArray2[1] = new Book(); 
		bookArray2[2] = new Book(); 
		
		
		// 인스턴스 값을 (주소값 아니라 초기화값) 초기화
		for(int i=0; i < bookArray1.length; i++) {
			bookArray2[i].setBookName(bookArray1[i].getBookName());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());

		}
		
	//배열복사 
	//	System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		
		//원본 값을 변경
		System.out.println("=== bookArray1 ===");
		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuthor("박완서");
		//원본값확인
		System.out.println("원본배열1");
		bookArray1[0].showBookInfo();
		
		// 사본 값을 확인, 근데 얘는안바뀌었네?
		System.out.println("사본배열1");
		bookArray2[0].showBookInfo();	
		
		
	}

}
