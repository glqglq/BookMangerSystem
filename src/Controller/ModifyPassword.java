package Controller;

public class ModifyPassword {
	private String NAME;
	private String OLDPASSWD;
	private String NEWPASSWD;
	public String execute(){
		if(DAO.UserDao.Update(NAME,OLDPASSWD,NEWPASSWD))
			return "success";
		return "fail";
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getOLDPASSWD() {
		return OLDPASSWD;
	}
	public void setOLDPASSWD(String oLDPASSWD) {
		OLDPASSWD = oLDPASSWD;
	}
	public String getNEWPASSWD() {
		return NEWPASSWD;
	}
	public void setNEWPASSWD(String nEWPASSWD) {
		NEWPASSWD = nEWPASSWD;
	}
}
