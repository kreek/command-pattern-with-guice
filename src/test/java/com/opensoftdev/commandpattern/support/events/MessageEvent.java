/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.opensoftdev.commandpattern.support.events;

import com.google.inject.Inject;
import com.opensoftdev.commandpattern.IEvent;

/**
 *
 * @author alastair
 */
public class MessageEvent implements IEvent {

    public static final String MESSAGE_EVENT_ONE = "messageEventOne";
    public static final String MESSAGE_EVENT_TWO = "messageEventTwo";

    private final String _type;
    private final String _message;

    @Override
    public String getType() {
        return _type;
    }

    public String getMessage() {
        return _message;
    }

    @Inject
    public MessageEvent(String type, String message) {
        _type = type;
        _message = message;
    }

}
