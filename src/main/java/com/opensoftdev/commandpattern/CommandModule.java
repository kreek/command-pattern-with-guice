/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.opensoftdev.commandpattern;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.MapBinder;

/**
 *
 * @author alastair
 */
public class CommandModule extends AbstractModule {
    @Override
    protected void configure() {
        MapBinder<String, ICommand> mapBinder =
                MapBinder.newMapBinder(binder(), String.class, ICommand.class);
        mapBinder.addBinding("1").to(CommandOne.class);
        mapBinder.addBinding("2").to(CommandTwo.class);
    }
}