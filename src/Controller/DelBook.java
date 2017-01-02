package Controller;

public class DelBook {
	private int NO;
	public String execute(){
		if(DAO.BookDao.DeleteByNO(NO))
			return "success";
		else return "fail";
	}
	public int getNO() {
		return NO;
	}
	public void setNO(int nO) {
		NO = nO;
	}
	
}
