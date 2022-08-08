package mylisteners;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import dbpack.DBconn;

@WebListener
public class MySessionListener implements HttpSessionListener {

	public void sessionCreated(HttpSessionEvent se) {
		System.out.println("Session Created..");
	}

	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println("Session Destroyed..");

		DBconn dbcon = new DBconn();
		HttpSession session = se.getSession();
		Object obj = session.getAttribute("uname");
		if (obj != null) {
			String uname = obj.toString();
			dbcon.updateFlag(uname, 0);
		}

	}
}
