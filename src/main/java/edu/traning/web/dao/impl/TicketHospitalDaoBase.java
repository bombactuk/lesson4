package edu.traning.web.dao.impl;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import edu.traning.web.dao.DaoException;
import edu.traning.web.dao.TicketHospitalDao;
import edu.traning.web.dao.impl.configuration.ConfigFilesDataBase;

public class TicketHospitalDaoBase implements TicketHospitalDao {
	
	private final ConfigFilesDataBase dataBase = ConfigFilesDataBase.getInstance();
	
    private static final String findAnAccount = "SELECT * FROM authorization WHERE login = ?" + " AND password = ?";

	@Override
	public boolean authorisationUser(String login, String password) throws DaoException {
		
		ResultSet resSet;
		
        boolean findingAnAccount = false;
        
        try (Connection dbConnection = dataBase.getConnection()) {
        	
            PreparedStatement prSt = dbConnection.prepareStatement(findAnAccount);

            prSt.setString(1, login);
            prSt.setString(2, password);

            resSet = prSt.executeQuery();
            
            while (resSet.next()) {

            	findingAnAccount = true;
            }
            
            return findingAnAccount;

        } catch (IOException | SQLException e) {
        	
            throw new DaoException(e);
            
        }
        
	}

	@Override
	public void registrUser() throws DaoException {
		// TODO Auto-generated method stub
		
	}

}