package edu.traning.web.logic;

public interface TicketHospitalLogic {

    boolean authorisationUser(String login, String password) throws LogicException;

    void registrUser() throws LogicException;
    
}
