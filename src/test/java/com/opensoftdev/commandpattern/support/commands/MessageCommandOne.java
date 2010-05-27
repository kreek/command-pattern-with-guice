package com.opensoftdev.commandpattern.support.commands;

import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;
import com.opensoftdev.commandpattern.ICommand;
import com.opensoftdev.commandpattern.IEvent;
import com.opensoftdev.commandpattern.support.events.MessageEvent;

public class MessageCommandOne implements ICommand {

    private final MessageEvent _event;

    @Inject
    public MessageCommandOne(@Assisted IEvent event) {
        this._event = (MessageEvent)event;
    }

    @Override
    public void execute() {
        System.out.println("MessageCommandOne has the payload: " + _event.getMessage());
    }

}