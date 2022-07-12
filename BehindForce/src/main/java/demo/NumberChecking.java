package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class NumberChecking extends TagSupport {
	@Override
	public int doEndTag() throws JspException {
		JspWriter out=pageContext.getOut();
		int a=Integer.parseInt(number);
		if(a%2==0) {
			try {
				out.println("Even Number....");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			try {
				out.println("<h1>Odd Number....");
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		return super.doEndTag();
		
	}
	String number;
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
}
