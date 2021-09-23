package bookmanipulate;

public class Book implements Comparable<Book>{
	private int isbnno;
	private String bookName;
	private String author;
	

	public int getisbnno() {
		return isbnno;
	}
	
	public void setisbnno(int isbnno) {
		this.isbnno = isbnno;
	}
	
	public String getbookName() {
		return bookName;
	}
	
	public void setbookName(String bookName) {
		this.bookName = bookName;
	}
	
	public String getauthor() {
		return author;
	}
	
	public void setauthor(String author) {
		this.author = author;
	}
	public int compareTo(Book compareBook) {
		 int compareBookNo=((Book)compareBook).getisbnno();
	        return this.isbnno-compareBookNo;
	}

}
