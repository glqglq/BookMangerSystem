package Controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;

import po.User;

public class Login{
	private String NAME;
	private String PASSWD;
	public String execute() throws Exception{
		System.out.println(NAME+PASSWD);
		User u = new User();
		u =  DAO.UserDao.QueryByName(NAME);
		if(u !=null && u.getNAME().equals(NAME) && u.getPASSWD().equals(PASSWD)){
			Map  map=ActionContext.getContext().getSession();
			map.put("NAME", u.getNAME());
			return "success";
		}			
		else return "fail";
	}
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
	
}
