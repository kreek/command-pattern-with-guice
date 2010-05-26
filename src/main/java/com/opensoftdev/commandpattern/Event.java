/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.opensoftdev.commandpattern;

import com.google.inject.Inject;

/**
 *
 * @author alastair
 */
public class Event implements IEvent {

    public static final String ONE = "one";
    public static final String TWO = "two";

    private final String _type;
    private final Object _body;

    @Override
    public String getType() {
        return _type;
    }

    public Event(String type, Object body) {
        _type = type;
        _body = body;
    }

}
