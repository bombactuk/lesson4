package edu.traning.web.logic.impl;

import edu.traning.web.dao.DaoException;
import edu.traning.web.dao.DaoProvider;
import edu.traning.web.dao.TicketHospitalDao;
import edu.traning.web.logic.LogicException;
import edu.traning.web.logic.TicketHospitalLogic;

public class TicketHospitalLogicImpl implements TicketHospitalLogic{
	
    private final DaoProvider provider = DaoProvider.getInstance();
    private final TicketHospitalDao dao = provider.getTicketHospitalDao();
    
	@Override
	public boolean authorisationUser(String login, String password) throws LogicException {
		
        try {
            return dao.authorisationUser(login,password);
         } catch (DaoException e) {
             throw new LogicException(e);
         }
        
	}
	@Override
	public void registrUser() throws LogicException {
	
        try {
            dao.registrUser();
        } catch (DaoException e) {
            throw new LogicException(e);
        }
		
	}
    
    
}
