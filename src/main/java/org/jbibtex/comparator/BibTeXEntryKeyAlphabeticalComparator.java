/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jbibtex.comparator;

import java.util.Comparator;
import org.jbibtex.BibTeXEntry;

/**
 *
 * @author Martin Raedel {@literal <martin.raedel@dlr.de>}
 */
public class BibTeXEntryKeyAlphabeticalComparator implements Comparator<
            BibTeXEntry
        >{
    
    // --------------------------------------------------------------------
    // Class variables
    // --------------------------------------------------------------------
    
    // --------------------------------------------------------------------
    // Variables
    // --------------------------------------------------------------------
    
    // --------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------
    
    // --------------------------------------------------------------------
    // set-get-add-is-has-Methods
    // --------------------------------------------------------------------
    
    // --------------------------------------------------------------------
    // Methods
    // --------------------------------------------------------------------
    
    // --------------------------------
    // General
    // --------------------------------

    @Override
    public int compare(BibTeXEntry t1, BibTeXEntry t2) {
        return (new KeyComparator().compare(t1.getKey(), t2.getKey()));
    }
    
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
