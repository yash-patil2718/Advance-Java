package com.products.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.product.service.EmpService;
import com.product.service.EmpServiceImpl;
import com.products.model.Product;

/**
 * Servlet implementation class displayServlet
 */
@WebServlet("/allProducts")
public class displayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public displayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmpService eservice = new EmpServiceImpl();
		List<Product> plist = eservice.findallProducts();
		System.out.println(plist);
		request.setAttribute("list", plist);
		RequestDispatcher rd = request.getRequestDispatcher("displayProduct.jsp");
		rd.forward(request, response);
	}

}
