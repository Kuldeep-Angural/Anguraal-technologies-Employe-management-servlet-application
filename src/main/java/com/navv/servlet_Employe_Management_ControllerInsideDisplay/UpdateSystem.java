package com.navv.servlet_Employe_Management_ControllerInsideDisplay;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.navv.servlet_Employe_Management_Dto.Employe;
import com.navv.servlet_Employe_Management_Service.ProjectService;


@WebServlet(value = "/updateinsidedisplaylink")
public class UpdateSystem extends HttpServlet{
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
		
		ProjectService employeservice=new ProjectService();
		Employe employe=employeservice.getbyIdEmploye(Integer.parseInt(req.getParameter("id")));
				
		
		if(employe!=null)
		{
			req.setAttribute("employe", employe);
			RequestDispatcher dispatcher=req.getRequestDispatcher("updateinsidedisplay.jsp");
			dispatcher.forward(req, resp);
		}

}
}