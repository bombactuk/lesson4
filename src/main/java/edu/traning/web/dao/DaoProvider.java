package edu.traning.web.dao;

import edu.traning.web.dao.impl.TicketHospitalDaoBase;

public final class DaoProvider {

    private static final DaoProvider INSTANCE;

    static {
        INSTANCE = new DaoProvider();
    }

    private DaoProvider() {
    }

    private TicketHospitalDao hospitalDao = new TicketHospitalDaoBase();

    public TicketHospitalDao getTicketHospitalDao() {
        return hospitalDao;
    }

    public static DaoProvider getInstance() {
        return INSTANCE;
    }

}