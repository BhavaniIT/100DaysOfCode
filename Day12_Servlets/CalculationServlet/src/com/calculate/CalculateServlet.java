package com.calculate;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculateServlet extends HttpServlet 
{

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int a = Integer.parseInt(req.getParameter("par1"));
		int b = Integer.parseInt(req.getParameter("par2")); 
		
		String c = req.getParameter("calculate");
		
		PrintWriter out = res.getWriter();
		
		out.println(c + " value is:");
		switch(c)
		{
		case "add": out.print(a+b); break;
		case "sub": out.print(a-b); break;
		case "mul": out.print(a*b); break;
		case "div": out.print(a/b);	break;
		}	
	}
	
}
