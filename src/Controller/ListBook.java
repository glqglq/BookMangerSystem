package Controller;

import java.util.List;
import po.Book;

public class ListBook {
	private List<Book> Books;
	public String execute(){
		System.out.println("1");
		Books = null;
		Books = DAO.BookDao.QueryAll();
		if(Books == null) return "fail";
		else return "success";
	}
	public List<Book> getBooks() {
		return Books;
	}
	public void setBooks(List<Book> books) {
		Books = books;
	}
	
}
