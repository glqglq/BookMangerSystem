package DAO;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


import po.Book;
import Util.DBUtil;
public class BookDao {
	public static boolean Update(Book b){
		Session session = DBUtil.getSessionFactory().openSession();
		Book c = (Book)session.get(Book.class,b.getNO());
		if(c != null){
			c.setDISC(b.getDISC());
			c.setNAME(b.getNAME());
			c.setNUM(b.getNUM());
			c.setPRICE(b.getPRICE());
			Transaction tran=session.beginTransaction();
			session.save(c);
			tran.commit();
			return true;
		}
		DBUtil.shutdown();
		return false;
	}
	public static List<Book> QueryAll(){
		Session session = DBUtil.getSessionFactory().openSession();
		String hql="from Book";
		Query query = session.createQuery(hql);
		return query.list();
	}
	public static Book QueryByNO(int NO){
		Session session = DBUtil.getSessionFactory().openSession();
		Book b = (Book)session.get(Book.class,NO);
		DBUtil.shutdown();
		return b;
	}
	public static boolean DeleteByNO(int NO){
		Session session = DBUtil.getSessionFactory().openSession();
		Book b = (Book)session.get(Book.class,NO);
		if(b != null){	
			Transaction tran=session.beginTransaction();
			session.delete(b);
			tran.commit();
			return true;
		}
		DBUtil.shutdown();
		return false;
	}
	public static boolean Insert(Book b){
		Session session = DBUtil.getSessionFactory().openSession();
		Transaction tran=session.beginTransaction();
		session.save(b);
		tran.commit();
		DBUtil.shutdown();
		return true;
	}
	public static void main(String args[]){//测试函数
		Book b = new Book();
		b.setDISC("haoshu");
		b.setNAME("shu");
		b.setNO(1);
		b.setNUM(44);
		b.setPRICE(15.2);
		Insert(b);
		System.out.println("OK");
	}
}
