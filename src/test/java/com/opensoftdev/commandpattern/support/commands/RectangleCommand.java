/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.opensoftdev.commandpattern.support.commands;

import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;
import com.opensoftdev.commandpattern.ICommand;
import com.opensoftdev.commandpattern.IEvent;
import com.opensoftdev.commandpattern.support.events.RectangleEvent;
import com.opensoftdev.commandpattern.support.events.MessageEvent;

/**
 *
 * @author alastair
 */
public class RectangleCommand implements ICommand {

    private final RectangleEvent _event;

    @Inject
    public RectangleCommand(@Assisted IEvent event) {
        this._event = (RectangleEvent)event;
    }

    @Override
    public void execute() {
        System.out.println("IntegerCommand has the payload: " + _event.getRectangle().toString());
    }

}