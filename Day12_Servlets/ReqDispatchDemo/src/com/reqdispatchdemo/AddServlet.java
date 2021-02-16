package com.reqdispatchdemo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet 
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		int a = Integer.parseInt(req.getParameter("var1"));
		int b = Integer.parseInt(req.getParameter("var2"));
		
		int c = a+b;
		
		req.setAttribute("add", c);
		
		RequestDispatcher rd = req.getRequestDispatcher("sq");
		rd.forward(req, res);	
		
	}
}
