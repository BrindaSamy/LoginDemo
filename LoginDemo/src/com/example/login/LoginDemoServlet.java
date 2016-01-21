package com.example.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import model.User;

@SuppressWarnings("serial")
public class LoginDemoServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		
			RequestDispatcher rd;
			
			
			String userName=req.getParameter("uName");
			String userPass=req.getParameter("pWord");
			
			User u_obj=new User(userName,userPass);
			
			u_obj.setUserName(userName);
			u_obj.setUserPass(userPass);
			
			
			req.setAttribute("details", u_obj);
			
			if(u_obj.isValid())
			{
				rd=req.getRequestDispatcher("Welcome.jsp");
				rd.forward(req, resp);
			}
			
			else
				
			{
				rd=req.getRequestDispatcher("Error.jsp");
				rd.forward(req, resp);
			}
			
			
			
			
			
			
				
		
	}
}
