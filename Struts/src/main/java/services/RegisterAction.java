package services;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbpack.DBconn;
import dbpack.UserDTO;

public class RegisterAction extends Action {

	private UserDTO user;

	private DBconn con;

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}

	public DBconn getCon() {
		return con;
	}

	public void setCon(DBconn con) {
		this.con = con;
	}

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		user = new UserDTO();

		con = new DBconn();

		user.setUname(request.getParameter("uname"));

		user.setUpass(request.getParameter("upass"));

		boolean a = con.registerUser(user);

		if (a) {
			return "logout.success";
		} else {
			return "logout.failure";
		}

	}
}
