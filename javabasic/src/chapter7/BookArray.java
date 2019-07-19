package chapter7;

public class BookArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book[] library = new Book[5];
		Book[] nlibrary = new Book[10];
		library[0] = new Book("태백산맥", "조정래");
		library[1] = new Book("자기만의방", "버지니아울프");
		library[2] = new Book("토지", "박경리");
		library[3] = new Book("어린왕자", "생택쥐페리");
		library[4] = new Book("지옥사원", "네온비");
		System.out.println("---------------------------");


		for(int i = 0; i < library.length; i++) {
			library[i].showBookInfo(); // 
		}
		
	/*	for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]); // 스택에서 i 에 대한 주소값이 나타남

		} */
	
			System.arraycopy(library, 0, nlibrary, 0, 5); // 5개 복사를 하라는 뜻
			for (int i = 0; i < nlibrary.length; i++) {
				if(nlibrary[i] != null)	nlibrary[i].showBookInfo();
			}

	} // end of main

} // end of the class
