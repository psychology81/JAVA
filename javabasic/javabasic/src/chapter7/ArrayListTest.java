package chapter7;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
	
		
		ArrayList<Book> library = new ArrayList<Book>(); //book 어레이리스트를 만들고 라이브러리라고 부름
		
		library.add(new Book("태백산맥", "조정래"));
		library.add(new Book("데미안", "헤르만 헤세"));
		library.add(new Book("어떻게 살 것인가", "유시민"));
		library.add(new Book("토지", "박경리"));
		library.add(new Book("어린왕자", "생텍쥐베리"));
		
		for(int i = 0; i < library.size(); i++) {
		  Book book = library.get(i);
		  book.showBookInfo();
		}
		System.out.println();
		
		System.out.println("=== 향상된 for문 사용 ===");
		for (Book book : library) { // 하나하나 바꿔가지않아도 됨 한 번에 작성하는 방법이 이거.
			book.showBookInfo();
		}
	}


	}


