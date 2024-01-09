package com.employee.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.emploee.beans.Employee;
import com.employee.services.*;

/**
 * Servlet implementation class DisplayEmployeeServlet
 */
@WebServlet("/displayEmployee")
public class DisplayEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DisplayEmployeeServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeService eservice=new EmployeeServiceImpl();
		List<Employee> elist=eservice.findAllEmployees();
		request.setAttribute("list", elist);
		RequestDispatcher rd=request.getRequestDispatcher("displayemp.jsp");
		rd.forward(request, response);
	}
			
		

}
