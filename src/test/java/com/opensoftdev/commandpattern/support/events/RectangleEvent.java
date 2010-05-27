/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.opensoftdev.commandpattern.support.events;

import com.google.inject.Inject;
import com.opensoftdev.commandpattern.IEvent;
import java.awt.Rectangle;

/**
 *
 * @author alastair
 */
public class RectangleEvent implements IEvent {

    public static final String RECTANGLE_EVENT = "rectangle Event";

    private final String _type;
    private final Rectangle _rectangle;

    @Override
    public String getType() {
        return _type;
    }

    public Rectangle getRectangle() {
        return _rectangle;
    }

    @Inject
    public RectangleEvent(String type, Rectangle rectangle) {
        this._type = type;
        this._rectangle = rectangle;
    }

}
