package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionDemo
 */
@WebServlet("/SessionDemo")
public class SessionDemo extends HttpServlet {
	@Override
		public void init() throws ServletException {
			System.out.println("Init Method Called");
		}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String name=request.getParameter("uname");
//		request.setAttribute(name, name);
//		System.out.println(request.getAttribute(name));
//		
//		HttpSession session= request.getSession(false);
//		System.out.println(session);
//		
//		HttpSession session2= request.getSession();
//		System.out.println(session2);
		
		int count=1;
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		Object obj=session.getAttribute("counter");
		if(obj==null) {
			out.println("Welcome you for the First time...");
			session.setAttribute("counter", ++count);
		}else {
			int c=Integer.parseInt(obj.toString());
			out.println("Coming for "+c+"times");
			session.setAttribute("counter", ++c);
		}
	}
	@Override
		public void destroy() {
			System.out.println("Reloaded...");
		}

}
