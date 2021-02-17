package com.registration;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RegistrationServlet extends HttpServlet 
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		String name = req.getParameter("name");
		String mobile = req.getParameter("mobile");
		String email = req.getParameter("mail");
		
	
		
		//Using cookie to send the value 
		Cookie cookie = new Cookie("name", name);
		res.addCookie(cookie);
		
		//Using session to send the value
		HttpSession session = req.getSession();
		session.setAttribute("mail", email);
		
		res.sendRedirect("confirmation?mobile="+mobile);
		
		
	
	}

}
