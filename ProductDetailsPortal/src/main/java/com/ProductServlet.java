package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		int Pid = Integer.parseInt(request.getParameter("Pid"));
		String Pname = request.getParameter("Pname");
		int Price = Integer.parseInt(request.getParameter("Price"));
		PrintWriter out = response.getWriter();
		 HttpSession session = request.getSession();
		 session.setAttribute("Pid", Pid);
		 session.setAttribute("Pname", Pname);
		 session.setAttribute("Price", Price);
		  out.print("<a href='Display.jsp'>Display Record</a>");
	}

	

}
