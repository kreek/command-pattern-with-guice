package com.opensoftdev.commandpattern.support.commands;

import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;
import com.opensoftdev.commandpattern.ICommand;
import com.opensoftdev.commandpattern.ICommand;
import com.opensoftdev.commandpattern.IEvent;
import com.opensoftdev.commandpattern.support.events.MessageEvent;

public class MessageCommandTwo implements ICommand {

    protected MessageEvent event;

//    @Override
//    public void setEvent(IEvent e) {
//        this.event = (Event) e;
//    }

    @Inject
    public MessageCommandTwo(MessageEvent event) {
        this.event = event;
    }

    @Override
    public void execute() {
        System.out.println("MessageCommandTwo has the payload: " + event.getMessage());
    }
}
