package com.servletconfig;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet 
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		PrintWriter pw = res.getWriter();
		pw.print("Hi");
		
		ServletConfig cg = getServletConfig();  //Context will be same for all servlets
		ServletContext cxt = getServletContext(); //Config depends upon the servlets
		
		String name = cxt.getInitParameter("name");  
		String phone = cg.getInitParameter("Mobile");
		
		pw.println("Hi "+name+" and "+phone);
		
	}
}
