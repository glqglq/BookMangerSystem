package DAO;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


import po.User;
import Util.DBUtil;
public class UserDao {
	public static boolean Update(String NAME,String OLDPASSWD,String NEWPASSWD){
		User c = new User();
		Session session = DBUtil.getSessionFactory().openSession();
		String hql="from User where NAME='"+NAME+"'";
		Query query = session.createQuery(hql);
		List list = query.list();
		for(int i = 0;i < list.size();i++)
			c = (User)list.get(i);
		if(list.isEmpty()) return false;
		if(c != null && c.getPASSWD().equals(OLDPASSWD)){
			try{
				c.setPASSWD(NEWPASSWD);
				session.beginTransaction();
				session.update(c);
				session.getTransaction().commit();
			}catch(Exception e){
				session.getTransaction().rollback();
				return false;
			}
			finally{
				DBUtil.shutdown();
			}
			return true;
		}
		return false;
	}
	public static User QueryByName(String name){
		Session session = DBUtil.getSessionFactory().openSession();
		String hql="from User where NAME='"+name+"'";
		Query query = session.createQuery(hql);
		List list = query.list();
		for(int i = 0;i < list.size();i++)
			return (User)list.get(i);
		return null;
	}

	public static boolean Insert(User b){
		Session session = DBUtil.getSessionFactory().openSession();
		Transaction tran=session.beginTransaction();
		session.save(b);
		tran.commit();
		DBUtil.shutdown();
		return true;
	}
	public static void main(String args[]){//测试函数
		User b = new User();
//		b.setNAME("admin");
//		b.setPASSWD("7758521");
//		Insert(b);
//		System.out.println("OK");
		b = QueryByName("admin");
		System.out.println(b.getNO()+"-"+b.getNAME()+"-"+b.getPASSWD());
		b = QueryByName("admi");
		if(b == null)
			System.out.println("meiyou");
	}
}
