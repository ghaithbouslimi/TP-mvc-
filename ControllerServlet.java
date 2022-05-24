package CONTROLLERS;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import BEANS.ControllerBean;

/**
 * Servlet implementation class ControllerServlet
 */
@WebServlet("/ControllerServlet")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 ControllerBean Cb = new  ControllerBean();
		String nom = request.getParameter("name");
		String prenom = request.getParameter("Uname");
		String adresse = request.getParameter("adresse");
		String teleph = request.getParameter("tele");
		String email = request.getParameter("mail");
		Cb.setNom(nom);
		Cb.setPrénom(prenom);
		Cb.setAdresse(adresse);
		Cb.setTelephone(teleph);
		Cb.setEmail(email);
		
		HttpSession session = request.getSession();
		session.setAttribute("Cb", Cb);
		String adress = "controller.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(adress);
		dispatcher.forward(request, response);
	}

}
