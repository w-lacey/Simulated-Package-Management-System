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
import dao.PackageTableDao;


@WebServlet("/PackageTrackerServlet")
public class PackageTrackerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    PackageTableDao db = new PackageTableDao();
    ServletContext sc;
    public PackageTrackerServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		String path = "/index.jsp";
		int trackingID = Integer.parseInt(request.getParameter("trackingID"));
		sc = getServletContext();
		models.Package pack = db.getPackage(trackingID);
		if(pack == null) {
			request.setAttribute("error", "Package not found! Please try again with a  valid tracking ID");
		}
		request.setAttribute("returnedPackage", pack);
		RequestDispatcher rd = sc.getRequestDispatcher(path);
		rd.forward(request, response);
	}

}
