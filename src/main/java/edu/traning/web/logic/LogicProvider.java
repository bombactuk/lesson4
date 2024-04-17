package edu.traning.web.logic;

import edu.traning.web.logic.impl.TicketHospitalLogicImpl;

public final class LogicProvider {
	
    private static final LogicProvider instance = new LogicProvider();
    private TicketHospitalLogic logic = new TicketHospitalLogicImpl();

    private LogicProvider() {
    }

    public TicketHospitalLogic getHospitallogic() {
        return this.logic;
    }

    public static LogicProvider getInstance() {
        return instance;
    }
    
}
