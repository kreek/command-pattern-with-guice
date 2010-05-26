package com.opensoftdev.commandpattern;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import junit.framework.TestCase;

public class CommandMapTestCase extends TestCase {

    @Inject
    private CommandMap commandMap;

    @Override
    public void setUp() throws Exception {
        Injector injector = Guice.createInjector(new CommandModule());
        injector.injectMembers(this);
    }

    public void test_createOne() {
        this.commandMap.dispatchEvent(new Event(Event.ONE, 1));
    }

    public void test_createTwo() {
        this.commandMap.dispatchEvent(new Event(Event.TWO, 2));
    }
}
