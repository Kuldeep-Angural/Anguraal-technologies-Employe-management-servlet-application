package com.navv.servlet_Employe_Management_Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.navv.servlet_Employe_Management_Service.ProjectService;

@WebServlet(value = "/deleteinside")

public class DisplayDeleteController extends HttpServlet {
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
		int id=Integer.parseInt(req.getParameter("id"));
		
		
		PrintWriter pw=resp.getWriter();
		ProjectService projectService=new ProjectService();
		
		pw.write("<body><qhtml>");
				if(id==projectService.findid(id)){
					
					projectService.deleteEmploye(id);
					
					RequestDispatcher dispatcher = req.getRequestDispatcher("Display.jsp");
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
							+ "<h1>Data Deleted SuccessFully");
					pw.write("</body></html>");
					
				}
				else {
					
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
							+ "<h1>Data Not Available ");
					pw.write("</body></html>");
					
				}


}
	
	

}
