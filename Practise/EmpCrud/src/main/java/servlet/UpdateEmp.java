package servlet;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.EmployeService;
import service.EmployeServiceImpl;

import model.Employe;

/**
 * Servlet implementation class UpdateEmp
 */
@WebServlet("/updateEmp")
public class UpdateEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int eid = Integer.parseInt(request.getParameter("eid"));
		String ename = request.getParameter("ename");
		double esal = Double.parseDouble(request.getParameter("esal"));
		EmployeService eservice = new EmployeServiceImpl();
		Employe e = new Employe(eid,ename,esal);
		eservice.updateEmp(e);
		RequestDispatcher rd = request.getRequestDispatcher("DisplayEmploye");
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
