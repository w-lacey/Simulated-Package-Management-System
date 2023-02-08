package servlets;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DatabaseConnection;
import dao.EmployeeTableDao;


@WebServlet("/CreateAccountServlet")
public class CreateAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    EmployeeTableDao DB = new EmployeeTableDao();
    ServletContext sc;
    public CreateAccountServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		String path = "/CreateAccount.jsp";
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String hub = request.getParameter("hubList");
		sc = getServletContext();
		boolean verifyEmail = DB.checkEmail(email);
		
		if(verifyEmail) {
			request.setAttribute("response", "Username already exists!! Login in or try another email!!");
		}else {
			DB.insertEmployee(firstName, lastName, email, password, hub);			
			request.setAttribute("response", "Account Created Successfully!!");
		}
		RequestDispatcher RD = sc.getRequestDispatcher(path);
		RD.forward(request, response);
	}

}
