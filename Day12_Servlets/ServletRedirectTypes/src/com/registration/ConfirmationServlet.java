package com.registration;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class ConfirmationServlet extends HttpServlet 
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		String name="";
		PrintWriter pw = res.getWriter();
		String mobile="";
		
		//getting value from session
		HttpSession session = req.getSession();
		String mail = (String) session.getAttribute("mail");
		
		//getting value from cookies
		
		 
		Cookie cookie[] = req.getCookies();
		
		for(Cookie c : cookie)
		{
			if(c.equals("name"))
				name += c.getValue();
		}
		
		pw.println("hi"+name+"! your email is "+mail+"and"+"contact number is"+mobile);
		
		
	}
}
