package services;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbpack.DBconn;

public class LogoutAction extends Action{
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String uname=request.getSession().getAttribute("uname").toString();
		
		DBconn dbcon=new DBconn();
		boolean done=dbcon.updateFlag(uname, 0);
		if(done) {
			return "logout.success";
		}else {
			return "logout.failure";
		}
	}
}
