/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.opensoftdev.commandpattern;

/**
 *
 * @author alastair
 */
public interface ICommandFactory {
    ICommand create(IEvent event);
}
