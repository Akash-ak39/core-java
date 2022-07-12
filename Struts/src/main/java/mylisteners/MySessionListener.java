package mylisteners;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


@WebListener
public class MySessionListener implements HttpSessionListener {

    public void sessionCreated(HttpSessionEvent se)  { 
         System.out.println("Session Created..");
    }

	
    public void sessionDestroyed(HttpSessionEvent se)  { 
         System.out.println("Session Destroyed..");
    }
	
}
