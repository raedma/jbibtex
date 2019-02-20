/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jbibtex.splitter;

/**
 *
 * @author Martin Raedel {@literal <martin.raedel@dlr.de>}
 */
public class AbstractBibTeXSplitterMemoryPreferences {
    
    // --------------------------------------------------------------------
    // Class variables
    // --------------------------------------------------------------------
    
    public static final int DEFAULT_INITIALCAPACITY = 100;
    
    // --------------------------------------------------------------------
    // Variables
    // --------------------------------------------------------------------
    
    private int initialCapacity = DEFAULT_INITIALCAPACITY;
    
    // --------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------
    
    // --------------------------------------------------------------------
    // set-get-add-is-has-Methods
    // --------------------------------------------------------------------
    
    public void setInitialCapacity(int v){this.initialCapacity = v;}
    public void resetInitialCapacity(){initialCapacity = DEFAULT_INITIALCAPACITY;}
    public int getInitialCapacity(){return initialCapacity;}
    
    // --------------------------------------------------------------------
    // Methods
    // --------------------------------------------------------------------
    
    // --------------------------------
    // General
    // --------------------------------
    
    // --------------------------------
    // Utility
    // --------------------------------
    
    // --------------------------------------------------------------------
    // Static methods
    // --------------------------------------------------------------------
    
    // --------------------------------------------------------------------
    // Inner classes
    // --------------------------------------------------------------------

}
