/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.opensoftdev.commandpattern;

/**
 *
 * @author alastair
 */
public class CommandOne implements ICommand {
    public void execute() {
        System.out.println("execute one");
    }
}