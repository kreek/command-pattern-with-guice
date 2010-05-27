/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.opensoftdev.commandpattern.support.modules;

import com.opensoftdev.commandpattern.support.commands.MessageCommandOne;
import com.opensoftdev.commandpattern.support.events.MessageEvent;
import com.opensoftdev.commandpattern.support.commands.MessageCommandTwo;
import com.google.inject.AbstractModule;
import com.google.inject.assistedinject.FactoryProvider;
import com.google.inject.multibindings.MapBinder;
import com.opensoftdev.commandpattern.ICommandFactory;
import com.opensoftdev.commandpattern.support.commands.RectangleCommand;
import com.opensoftdev.commandpattern.support.events.RectangleEvent;

/**
 *
 * @author alastair
 */
public class CommandModule extends AbstractModule {
    @Override
    protected void configure() {
        
        MapBinder<String, ICommandFactory> mapBinder =
                MapBinder.newMapBinder(binder(), String.class, ICommandFactory.class);

        mapBinder.addBinding(MessageEvent.MESSAGE_EVENT_ONE).toProvider(
                FactoryProvider.newFactory(ICommandFactory.class, MessageCommandOne.class));
        mapBinder.addBinding(MessageEvent.MESSAGE_EVENT_TWO).toProvider(
                FactoryProvider.newFactory(ICommandFactory.class, MessageCommandTwo.class));
        mapBinder.addBinding(RectangleEvent.RECTANGLE_EVENT).toProvider(
                FactoryProvider.newFactory(ICommandFactory.class, RectangleCommand.class));
    }
}
