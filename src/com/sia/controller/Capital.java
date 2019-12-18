package com.sia.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ws.axis2.WebserviceStub;
import org.apache.ws.axis2.WebserviceStub.CalculCapital;
import org.apache.ws.axis2.WebserviceStub.CalculCapitalResponse;


@WebServlet("/capital")
public class Capital extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	public Capital() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		if(request.getParameter("calculer")!=null) {
		Double taux=Double.parseDouble(request.getParameter("taux"));
		Double annuite=Double.parseDouble(request.getParameter("annuite"));
		int duree= Integer.parseInt(request.getParameter("duree"));
		
		WebserviceStub stub= new WebserviceStub();
		CalculCapital cal=new CalculCapital();
		 cal.setC(annuite);
		 cal.setN(duree);
		 cal.setTaux(taux);
		 CalculCapitalResponse res= stub.calculCapital(cal);
		 request.getSession().setAttribute("capital",res.get_return());
		 HttpSession httpse=request.getSession();
	     httpse.setAttribute("cap",res.get_return());
	     httpse.setAttribute("taux", taux);
	     httpse.setAttribute("duree",duree);
	     httpse.setAttribute("annuite",annuite);
	     Date actuelle = new Date();
	     DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	     String dat = dateFormat.format(actuelle);
	     httpse.setAttribute("date",dat);
		 response.sendRedirect("capital.jsp");}
		 
		 if(request.getParameter("sauvegarder")!=null) {
			 Double taux=Double.parseDouble(request.getParameter("taux"));
				Double annuite=Double.parseDouble(request.getParameter("annuite"));
				int duree= Integer.parseInt(request.getParameter("duree"));
				
				WebserviceStub stub= new WebserviceStub();
				CalculCapital cal=new CalculCapital();
				 cal.setC(annuite);
				 cal.setN(duree);
				 cal.setTaux(taux);
				 CalculCapitalResponse res= stub.calculCapital(cal);
				 request.getSession().setAttribute("capital",res.get_return());
				 HttpSession httpse=request.getSession();
			     httpse.setAttribute("cap",res.get_return());
			     httpse.setAttribute("taux", taux);
			     httpse.setAttribute("duree",duree);
			     httpse.setAttribute("annuite",annuite);
			     Date actuelle = new Date();
			     DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			     String dat = dateFormat.format(actuelle);
			     httpse.setAttribute("date",dat);
		 	 response.sendRedirect("formulaire.jsp");

		}
	 	 
	}

}
