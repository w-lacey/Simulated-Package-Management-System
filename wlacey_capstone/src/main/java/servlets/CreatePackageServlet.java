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

import dao.PackageTableDao;


@WebServlet("/CreatePackageServlet")
public class CreatePackageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    PackageTableDao db = new PackageTableDao();  
    Connection con;
    ServletContext sc;
    public CreatePackageServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		String path = "/CreateNewPackage.jsp";
		sc = getServletContext();
		String hazardCheck = request.getParameter("hazard");
		String originHub = request.getParameter("originHub");
		String destinationAddress = request.getParameter("destinationAddress");		
		String recipientName = request.getParameter("recipientName");
		double packageWidth = Double.parseDouble(request.getParameter("width"));
		double packageHeight = Double.parseDouble(request.getParameter("height"));
		double packageLength = Double.parseDouble(request.getParameter("length"));
		double packageWeight = Double.parseDouble(request.getParameter("weight"));	
		
		int result = db.insertPackage(originHub, destinationAddress, recipientName, packageWidth, packageHeight, packageLength, packageWeight);
		
		if(result > 0) {
			request.setAttribute("response", "Package created succesfully!");
		}else {
			request.setAttribute("response", "Package could not be created! Please try again!");
		}
		RequestDispatcher RD = sc.getRequestDispatcher(path);
		RD.forward(request, response);
	}

}
