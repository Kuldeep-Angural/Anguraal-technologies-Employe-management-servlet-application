package com.navv.servlet_Employe_Management_ControllerInsideDisplay;

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

@WebServlet(value = "/updatemain2")
public class UpdateMain extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
		
		Employe employe=new Employe();
		
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String mobile = req.getParameter("mobile");

		employe.setName(name);
		employe.setEmail(email);
		employe.setMobile(mobile);
		PrintWriter pw=resp.getWriter();

		ProjectService service=new ProjectService();
		service.update(Integer.parseInt(req.getParameter("id")), employe);
		pw.write("<html><body>");
		
		
		pw.write(" <h1 style='color:blue;text-align:center;background-color: transparent;position:sticky;'>Data Inserted Successfully</h1>");
		

		RequestDispatcher dispatcher = req.getRequestDispatcher("Display.jsp");
		
		dispatcher.forward(req, resp);

		pw.write("</body></html>");

	
	}

}
