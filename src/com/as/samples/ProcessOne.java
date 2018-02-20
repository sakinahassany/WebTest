package com.as.samples;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProcessOne
 */
@WebServlet("/ProcessOne")
public class ProcessOne extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
   public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	   String name = request.getParameter("name");
	   String add = request.getParameter("add");
	   //String male = request.getParameter("male");
	   //String female = request.getParameter("female");
	   String phone = request.getParameter("phone");
	   
	  // System.out.println("Name is " +name);
	  // System.out.println("Address is " +add);
	   //System.out.println("Phone is " +phone);
	   
	   request.getSession().setAttribute("name", name);
	   request.getSession().setAttribute("add", add);
	   request.getSession().setAttribute("phone", phone);
	   
	   response.sendRedirect("html/pagetwo.html");
	   
	}

}
