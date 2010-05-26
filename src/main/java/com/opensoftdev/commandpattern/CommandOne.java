/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.opensoftdev.commandpattern;

import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 *
 * @author alastair
 */
public class CommandOne implements ICommand {

    @Override
    public void execute() {
        System.out.println("execute one");
    }

}
