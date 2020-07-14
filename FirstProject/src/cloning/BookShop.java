package cloning;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{
	
	private String shopName;
	private List<Book> bookList = new ArrayList<>();
	
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public List<Book> getBookList() {
		return bookList;
	}
	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}

	
	
	@Override
	protected BookShop clone() throws CloneNotSupportedException {
		
		BookShop shop = new BookShop();
		for(Book b:this.getBookList())
		{
				shop.getBookList().add(b);
		}
		return shop;
	}
	@Override
	public String toString() {
		return "BookShop [shopName=" + shopName + ", bookList=" + bookList + "]";
	}
	public static void main(String[] args) throws CloneNotSupportedException {

		
		BookShop bs = new BookShop();
		bs.setShopName("HareKrishan");
		List<Book> bookList= Book.loadData();
		bs.setBookList(bookList);
		
		BookShop bs1 = bs.clone();
		bs1.setShopName("HareKrishanHari");
		
		
		bs.getBookList().remove(2);
		System.out.println("originalobj "+bs);
		System.out.println("clonedobjec "+bs1);
		
		bs.getBookList().get(0).setBname("HareKrishan's Bhagvad Geeta");
		
		System.out.println("originalo"+bs);
		System.out.println("cloned ob"+bs1);
	}

}
