package servletsexamples;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Para
 */
@WebServlet("/Para")
public class Para extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		// get enumeration of parameter Names
		Enumeration e = req.getParameterNames();
		// display parameter names and values
		while (e.hasMoreElements()) {
			String pname = (String) e.nextElement();
			String pvalue = req.getParameter(pname);
			pw.println(pname + " : " + pvalue);
		}
		pw.close();
	}
}
