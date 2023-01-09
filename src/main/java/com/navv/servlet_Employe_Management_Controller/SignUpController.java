package com.navv.servlet_Employe_Management_Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.navv.servlet_Employe_Management_Dto.SignupEmploye;
import com.navv.servlet_Employe_Management_Service.ProjectService;
@WebServlet(value = "/signupEmploye")
public class SignUpController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				int cid=Integer.parseInt(req.getParameter("cid"));
				String name=req.getParameter("name");
				String email=req.getParameter("email");
				String mobile=req.getParameter("mobile");
				String password=req.getParameter("password");
				
				
				
				ProjectService service=new ProjectService();
				SignupEmploye employe=new SignupEmploye();
				
				
				employe.setEmail(email);
				employe.setMobile(mobile);
				employe.setName(name);
				employe.setPassword(password);
				
				PrintWriter pw = resp.getWriter();
				
				if(cid==1081)
				{
			pw.write("<html><body>");
					
				
					
			service.insertSignup(employe);
					RequestDispatcher dispatcher = req.getRequestDispatcher("Login.html");
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
							+ "<h1>SignUp SuccessFully");
				}
				else {
					
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
							+ "<h1>Please fill all Details");

					RequestDispatcher dispatcher = req.getRequestDispatcher("Login-SignUp.html");
					dispatcher.include(req, resp);

					pw.write("</body></html>");
				}
	}

}
