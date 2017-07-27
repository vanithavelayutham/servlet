package com.test;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
@WebServlet("/HelloWorld")
public class HelloWorld extends HttpServlet
{
	public void doPost(HttpServletRequest request,HttpServletResponse response) 
			throws ServletException, IOException
			{
				response.setContentType("text/html;charset=UTF-8");
				PrintWriter out = response.getWriter();
				String userName=(String)request.getParameter("user");	
				out.println("Hello "+userName);

			}
}