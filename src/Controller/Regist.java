package Controller;

import po.User;

public class Regist {
	private String NAME;
	private String PASSWD;
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getPASSWD() {
		return PASSWD;
	}
	public void setPASSWD(String pASSWD) {
		PASSWD = pASSWD;
	}
	public String execute(){
		if(NAME.equals("") || PASSWD.equals("")) return "fail";
		User u = new User();
		u.setNAME(NAME);
		u.setPASSWD(PASSWD);
		DAO.UserDao.Insert(u);
		return "success";
	}
}
