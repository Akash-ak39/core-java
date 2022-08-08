package services;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbpack.DBconn;
import dbpack.UserDTO;

public class LoginAction extends Action {
	private UserDTO userDTO;
	private DBconn dbcon;
	public LoginAction() {
		// TODO Auto-generated constructor stub
	}

	public UserDTO getUserDTO() {
		return userDTO;
	}

	public void setUserDTO(UserDTO userDTO) {
		this.userDTO = userDTO;
	}

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		userDTO =new UserDTO();
		dbcon=new DBconn();
		userDTO.setUname(request.getParameter("uname"));
		userDTO.setUpass(request.getParameter("upass"));
		boolean user = dbcon.checkUser(userDTO.getUname(), userDTO.getUpass());
		if (user) {
			boolean valid = dbcon.checkFlag(userDTO.getUname());
			if (valid) {
				dbcon.updateFlag(userDTO.getUname(), 1);
				request.getSession().setAttribute("uname", userDTO.getUname());
				return "login.welcome";
			} else {
				return "login.alreadyloggedin";
			}
		} else {
			return "login.invaliduser";
		}

	}
}
