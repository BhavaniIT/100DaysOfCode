package com.reqdispatchdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet 
{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int k = (int)req.getAttribute("add");
		
		k = k*k;
		
		PrintWriter pw = res.getWriter();
		pw.println("Output:"+k);
	}
}
