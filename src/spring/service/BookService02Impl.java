package june.spring.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import june.spring.dao.BookDAO;
import june.spring.vo.Book;

@Service("bksrv02")
public class BookService02Impl implements BookService {

	@Autowired
	private BookDAO bkdao02;
	
	
	@Override
	public void newBook() {
		Book b = new Book("100","스프링5기초","더조은","20000");
		int cnt = bkdao02.insertBook(b);
		if (cnt > 0) System.out.println("도서 등록 완료!!");
		
	}

	

	@Override
	public List<Book> readBook() {
		StringBuffer sb = new StringBuffer();
		List<Book> bs = bkdao02.selectBook();
		
		for (Book b : bs) sb.append(b);
		
		System.out.println(sb.toString());
		
		return null;
	}

	@Override
	public Book readOneBook() {
		Book b = bkdao02.selectOneBook("100");
		System.out.println(b);
	
		return null;
	}

	@Override
	public void modifyBook(Book b) {
		int cnt = bkdao02.updateBook(b);
		if(cnt>0) System.out.println("도서 수정완료!!");
		
	}
	@Override
	public void removeBook(String bookid) {
		int cnt = bkdao02.deleteBook(bookid);
		if(cnt>0) System.out.println("도서 삭제완료!!");

	}

	

}
