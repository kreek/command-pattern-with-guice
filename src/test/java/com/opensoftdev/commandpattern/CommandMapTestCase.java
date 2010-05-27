package com.opensoftdev.commandpattern;

import com.opensoftdev.commandpattern.support.modules.CommandModule;
import com.opensoftdev.commandpattern.support.events.MessageEvent;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.opensoftdev.commandpattern.support.events.RectangleEvent;
import java.awt.Rectangle;
import junit.framework.TestCase;

public class CommandMapTestCase extends TestCase {

    @Inject
    private CommandMap _commandMap;

    @Override
    public void setUp() throws Exception {
        Injector injector = Guice.createInjector(new CommandModule());
        injector.injectMembers(this);
    }

    public void test_messageEventOneExecutes() {
        this._commandMap.dispatchEvent(
                new MessageEvent(MessageEvent.MESSAGE_EVENT_ONE, "word up!"));
    }

    public void test_messageEventTwoExecutes() {
        this._commandMap.dispatchEvent(
                new MessageEvent(MessageEvent.MESSAGE_EVENT_TWO, "funk dat!"));
    }

    public void test_rectangleCommandExecutes() {
        this._commandMap.dispatchEvent(
                new RectangleEvent(RectangleEvent.RECTANGLE_EVENT, new Rectangle(50, 100)));
    }
}
