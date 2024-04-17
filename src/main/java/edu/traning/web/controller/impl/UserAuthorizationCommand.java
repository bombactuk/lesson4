package edu.traning.web.controller.impl;

import java.io.IOException;

import edu.traning.web.controller.Command;
import edu.traning.web.logic.LogicException;
import edu.traning.web.logic.LogicProvider;
import edu.traning.web.logic.TicketHospitalLogic;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UserAuthorizationCommand implements Command{
	
    private final LogicProvider logicProvider = LogicProvider.getInstance();
    
    private final TicketHospitalLogic logic = logicProvider.getHospitallogic();

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 try {
				String login = request.getParameter("login");
				String password = request.getParameter("password");
				
				if(logic.authorisationUser(login, password)) {
					
					request.setAttribute("invitationMessage", "Hello, user!");
					
					RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/main.jsp");
					dispatcher.forward(request, response);
				}else {
					request.setAttribute("authError", "Неправильный логин или пароль!");
					
					RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
					dispatcher.forward(request, response);
				} 

	        } catch (LogicException e) {
	            response.getWriter().print("Authorisation Error");
	        }
		
	}

}
