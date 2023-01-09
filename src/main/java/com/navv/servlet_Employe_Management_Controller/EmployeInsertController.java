package com.navv.servlet_Employe_Management_Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.navv.servlet_Employe_Management_Dto.Employe;
import com.navv.servlet_Employe_Management_Service.ProjectService;

@WebServlet(value = "/insertData")
public class EmployeInsertController  extends HttpServlet{
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String mobile=req.getParameter("mobile");
		String job=req.getParameter("job");
		String gender=req.getParameter("gender");
		
		
		ProjectService  service=new ProjectService();
		Employe employe=new Employe();
		
		employe.setName(name);
		employe.setEmail(email);
		employe.setMobile(mobile);
		employe.setJob(job);
		employe.setGender(gender);
		
		
		PrintWriter pw = resp.getWriter();
		
		if(employe!=null)
		{
	pw.write("<html><body>");
			
			service.insertEmploye(employe);
			

			RequestDispatcher dispatcher = req.getRequestDispatcher("insert.html");
			dispatcher.include(req, resp);

			pw.write("  <style>h1{\r\n"
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
					+ "<h1>Data Inserted SuccessFully");
		}
		else {
			
			pw.write(" <style>h1{\r\n"
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

			RequestDispatcher dispatcher = req.getRequestDispatcher("insert.html");
			dispatcher.include(req, resp);

			pw.write("</body></html>");
		}
		
		
		
		
		
		
	}

}
