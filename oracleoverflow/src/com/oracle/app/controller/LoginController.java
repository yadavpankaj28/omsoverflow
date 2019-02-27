package com.oracle.app.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.app.dao.HelperDAO;
import com.oracle.app.dto.UserDTO;

/**
 * @author Nagesha C
 * @version jdk 1.8
 * @category Login
 */

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	RequestDispatcher rd;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("uname");
		String password = request.getParameter("pwd");

		UserDTO pojo = new UserDTO();
		pojo.setName(name);
		pojo.setPassword(password);

		HelperDAO dao = new HelperDAO();
		boolean check = dao.validate(name, password);
		if (check) {
			rd = request.getRequestDispatcher("home.jsp");
			rd.forward(request, response);
		} else {
			rd = request.getRequestDispatcher("index.jsp");
			request.setAttribute("status", "User name or  Password is Wrong");
			rd.forward(request, response);
		}

	}

}
