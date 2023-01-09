package com.navv.servlet_Employe_Management_Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.navv.servlet_Employe_Management_Dto.SignupEmploye;
import com.navv.servlet_Employe_Management_Service.ProjectService;

@WebServlet(value = "/LoginEmploye")
public class LoginController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				String email=req.getParameter("email");
				String password=req.getParameter("password");
					
				ProjectService  service=new ProjectService();
				PrintWriter pw=resp.getWriter();
				SignupEmploye signUp=service.findIdAndPassword(email);
				
				if (signUp.getEmail().equalsIgnoreCase(email) && signUp.getPassword().equals(password)) {
					
					pw.write("<html><body>");
				
					RequestDispatcher dispatcher = req.getRequestDispatcher("service.html");
					dispatcher.include(req, resp);

					pw.write("</body></html>  <style>h1{\r\n"
							+ "        box-sizing: border-box;\r\n"
							+ "    top: -588px;\r\n"
							+ "    position: relative;\r\n"
							+ "    text-align: center;\r\n"
							+ "    \r\n"
							+ "    height: 50px;\r\n"
							+ "    width: 430px;\r\n"
							+ "    right: -438px;\r\n"
							+ "}\r\n"
							+ "        \r\n"
							+ "        </style>\r\n"
							+ "<h1>Login  SuccessFully");
						
					pw.write("</html></body>");
				} else if (!signUp.getEmail().equalsIgnoreCase(email)) {
					pw.write("</body></html>  <style>h1{\r\n"
							+ "        box-sizing: border-box;\r\n"
							+ "    top: -588px;\r\n"
							+ "    position: relative;\r\n"
							+ "    text-align: center;\r\n"
							+ "    \r\n"
							+ "    height: 50px;\r\n"
							+ "    width: 430px;\r\n"
							+ "    right: -438px;\r\n"
							+ "}\r\n"
							+ "        \r\n"
							+ "        </style>\r\n"
							+ "<h1>Account not found");
					RequestDispatcher dispatcher = req.getRequestDispatcher("Login-SignUp.html");
					dispatcher.include(req, resp);
					pw.write("</html></body>");

				}
				}

			}
	


