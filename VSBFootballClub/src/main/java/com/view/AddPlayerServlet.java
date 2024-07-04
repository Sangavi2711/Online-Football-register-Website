package com.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddPlayerServlet
 */
@WebServlet("/AddPlayer")
public class AddPlayerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	PrintWriter out=response.getWriter();
	response.setContentType("text/html");
	out.println("<html> <body>");
	out.println("<center>");
	out.println("<form action='AddPlayerCont' method='post' enctype='multipart/form-data'>");
	out.println("Player Name<input type='text' name='name'/> <br>");
	out.println("Age<input type='text' name='age'/> <br>");
	out.println("Profile <input type='file' name='profile'>");
	out.println("<input type='submit'value='Submit'>");
	out.println("</form>");
	out.println("</center>");
	out.println("</body> </html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
