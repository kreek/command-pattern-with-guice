/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.opensoftdev.commandpattern;

import com.google.inject.Inject;
import java.util.Map;

/**
 *
 * @author alastair
 */
public class CommandMap {
    private final Map<String, ICommand> commands;

    @Inject
    public CommandMap(Map<String, ICommand> commands) {
        this.commands = commands;
    }

    public void routeEventToCommand(String type) {
        ICommand command = commands.get(type);
        command.execute();
    }
}
