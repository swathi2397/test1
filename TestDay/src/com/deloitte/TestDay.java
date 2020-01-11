package com.deloitte;


import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class NameServlet
 */
@WebServlet("/login")
public class TestDay extends HttpServlet {
	//private static final long serialVersionUID = 1L;
    //private LoginService lService;   
    /**
     * @see HttpServlet#HttpServlet()
     */


	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init called");
		//lService = new LoginServiceImpl();
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("destroy called");
		//lService.closeConnection();//called when servlet is removed from memory
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("do get called");
		String path=request.getServletPath();
		System.out.println("path: "+ path);
		
			String name = request.getParameter("name");
			String desig = request.getParameter("desig");
			//System.out.println(login+","+password);
			//User user = new User(name,designation);
			//String type = lService.getUserType(user);
			System.out.println(name);
			request.setAttribute("name", name);
			request.setAttribute("desig", desig);
			//System.out.println(name);
			String displayPage = "Test.jsp";
			request.getRequestDispatcher(displayPage).forward(request, response);
			}
	
//	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("do post called");
		
		doGet(request, response);
	}

}
