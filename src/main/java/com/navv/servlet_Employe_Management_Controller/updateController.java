package com.navv.servlet_Employe_Management_Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import com.navv.servlet_Employe_Management_Dto.Employe;
import com.navv.servlet_Employe_Management_Service.ProjectService;

@WebServlet(value = "/UpdateData")
public class updateController extends HttpServlet {

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		int Id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String mobile = req.getParameter("mobile");
		String gender = req.getParameter("gender");
		String job = req.getParameter("job ");

		PrintWriter pw = res.getWriter();
		
		Employe employe1=new Employe();
		
		
		ProjectService service = new ProjectService();
	
	
		
		
		
			if(Id==service.findid(Id)) { 
				
				if(Id!=0 && name!=null )
				{
					pw.write("<html><body>");
					employe1.setName(name);
					
					service.updatedata(Id, employe1);
					pw.write(" <h1 style='color:blue;text-align:center;background-color: transparent;'>Name Update Successfully</h1>");
					

					RequestDispatcher dispatcher = req.getRequestDispatcher("upate.html.html");
					dispatcher.include(req, res);

					pw.write("</body></html>");
					System.out.println(name+""+Id);
				}
				else if(Id!=0 && email!=null)
				{
					pw.write("<html><body>");
					employe1.setEmail(email);
					service.updatedata(Id, employe1);
					
					pw.write(" <h1 style='color:blue;text-align:center;background-color: transparent;"
							+ "position:relative;top:30px;'>Email Update Successfully</h1>");
					

					RequestDispatcher dispatcher = req.getRequestDispatcher("upate.html");
					dispatcher.include(req, res);

					pw.write("</body></html>");
				}
				else if(Id!=0 && mobile!=null)
				{
					pw.write("<html><body>");
					employe1.setMobile(mobile);
					service.updatedata(Id, employe1);
					
					pw.write(" <h1 style='color:blue;text-align:center;background-color: transparent;'>Mobile Update Successfully</h1>");
					

					RequestDispatcher dispatcher = req.getRequestDispatcher("upate.html.html");
					dispatcher.include(req, res);

					pw.write("</body></html>");
				}else if(Id!=0 && gender!=null)
				{
					pw.write("<html><body>");
					employe1.setGender(gender);
					
					service.updatedata(Id, employe1);
					pw.write(" <h1 style='color:blue;text-align:center;background-color: transparent;'>Gender Update Successfully</h1>");
					

					RequestDispatcher dispatcher = req.getRequestDispatcher("upate.html.html");
					dispatcher.include(req, res);

					pw.write("</body></html>");
				}
				else {
					pw.write("<html><body>");
					System.out.println("Nothing be Update");
					service.updatedata(Id, employe1);
					pw.write(" <h1 style='color:blue;text-align:center;background-color: transparent;'>Nothing be Update</h1>");
					

					RequestDispatcher dispatcher = req.getRequestDispatcher("upate.html.html");
					dispatcher.include(req, res);

					pw.write("</body></html>");
				}
				
			}
			else {
				pw.write("<html><body>");
				System.out.println("Id Is not Present in Data-Base");
				service.updatedata(Id, employe1);
				pw.write(" <h1 style='color:blue;text-align:center;background-color: transparent;'>Id Is not Present in Data-Base</h1>");
				

				RequestDispatcher dispatcher = req.getRequestDispatcher("upate.html.html");
				dispatcher.include(req, res);

				pw.write("</body></html>");
			}
			
		}
			
			
		}

