public class Member {
	private String name;
	private Book book;
	
	public Member(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}
	public void status() {
		if(book==null)
			System.out.println("no book has issued to "+ name);
		else
			System.out.println(name+"has issued to"+book.getTitle());
		
	}
	
	public Book getbook() {
		return book;
	}
	public void setBook(Book book) {
		this.book=book;
	}
}
