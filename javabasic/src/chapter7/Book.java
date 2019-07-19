package chapter7;

public class Book {
	private String bookName;
	private String author;
	
	public Book() {}; // 디폴트생성자
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
		
		// 마우스 오른쪽버튼 클릭 , 소스 , getter and setter
	}
	/**
	 * @return the bookName
	 */
	public String getBookName() {
		return bookName;
	}
	/**
	 * @param bookName the bookName to set
	 */
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	
	public void showBookInfo() {
		System.out.println(bookName + ", " + author);
	}
	
	
	
	
	
}
