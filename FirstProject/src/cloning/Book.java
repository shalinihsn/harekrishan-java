package cloning;

import java.util.ArrayList;
import java.util.List;

public class Book {
	
	private int bid;
	private String bname;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	
	public static List<Book> loadData()
	{
		
		List<Book> bookList= new ArrayList<Book>();
		for(int i=1;i<=10;i++)
		{
			Book b = new Book();
			b.setBid(i);
			b.setBname("book "+i);
			bookList.add(b);
		}
		return bookList;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + "]";
	}
	
	
	
	

}
