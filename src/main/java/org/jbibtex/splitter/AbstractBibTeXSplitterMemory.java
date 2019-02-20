/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jbibtex.splitter;

/**
 *
 * @author Martin Raedel {@literal <martin.raedel@dlr.de>}
 * @param <P> {@link AbstractBibTeXSplitterMemoryPreferences} type
 */
public abstract class AbstractBibTeXSplitterMemory<
            P extends AbstractBibTeXSplitterMemoryPreferences
        >{
    
    // --------------------------------------------------------------------
    // Class variables
    // --------------------------------------------------------------------
    
    // --------------------------------------------------------------------
    // Variables
    // --------------------------------------------------------------------

    protected final P prefs;
    
    // --------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------
    
    public AbstractBibTeXSplitterMemory(
            P prefs
    ){
        this.prefs = prefs;
    }
    
    // --------------------------------------------------------------------
    // set-get-add-is-has-Methods
    // --------------------------------------------------------------------
    
    // --------------------------------------------------------------------
    // Methods
    // --------------------------------------------------------------------
    
    // --------------------------------
    // General
    // --------------------------------
    
    // --------------------------------
    // Utility
    // --------------------------------
    
    public abstract void clear();
    public abstract boolean isEmpty();
    public abstract void printSummary();
    
    // --------------------------------------------------------------------
    // Static methods
    // --------------------------------------------------------------------
    
    // --------------------------------------------------------------------
    // Inner classes
    // --------------------------------------------------------------------

}
