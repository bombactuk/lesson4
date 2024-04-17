package edu.traning.web.dao;

public interface TicketHospitalDao {

    boolean authorisationUser(String login, String password) throws DaoException;

    void registrUser() throws DaoException;
	
}