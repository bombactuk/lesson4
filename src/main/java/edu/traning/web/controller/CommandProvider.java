package edu.traning.web.controller;

import java.util.HashMap;
import java.util.Map;

import edu.traning.web.controller.impl.GoToTheRegistrationPage;
import edu.traning.web.controller.impl.NoSuchCommand;
import edu.traning.web.controller.impl.UserAuthorizationCommand;
import edu.traning.web.controller.impl.UserRegistrationCommand;

public class CommandProvider {

	private final Map<CommandName, Command> repository = new HashMap<>();

    CommandProvider() {
        this.repository.put(CommandName.DO_AUTH, new UserAuthorizationCommand());
        this.repository.put(CommandName.DO_REGISTRATION, new UserRegistrationCommand());
        this.repository.put(CommandName.GO_TO_REGISTRATION, new GoToTheRegistrationPage());
        this.repository.put(CommandName.WRONG_REQUEST, new NoSuchCommand());
    }

    Command getCommand(String name) {
        CommandName commandName = null;
        Command command = null;

        try {
            commandName = CommandName.valueOf(name.toUpperCase());
            command = (Command)this.repository.get(commandName);
        } catch (NullPointerException | IllegalArgumentException var5) {
            command = (Command)this.repository.get(CommandName.WRONG_REQUEST);
        }

        return command;
    }
    
}
