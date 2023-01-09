package com.navv.servlet_Employe_Management_Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.navv.servlet_Employe_Management_Dao.ProjectDao;
import com.navv.servlet_Employe_Management_Dto.Message;
import com.navv.servlet_Employe_Management_Service.ProjectService;
@WebServlet(value = "/postmessage")
public class MessageController extends HttpServlet{
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String area=req.getParameter("area");
		
		
		ProjectDao  dao=new ProjectDao();
		Message message=new Message();
		ProjectService service=new ProjectService();
		
		
		message.setName(name);
		message.setEmail(email);
		message.setText(area);
		PrintWriter pw = resp.getWriter();
		
		if(message!=null)
		{pw.write("<html><body>");
		
			service.insertMessage(message);
		

		RequestDispatcher dispatcher = req.getRequestDispatcher("contactUs.html");
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
				+ "<h1>Thx For Your Query");
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

		RequestDispatcher dispatcher = req.getRequestDispatcher("ContactUs.html");
		dispatcher.include(req, resp);

		pw.write("</body></html>");
	
			
		}
}

}
