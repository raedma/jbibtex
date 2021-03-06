package org.jbibtex.policies.keyconflict;

import org.jbibtex.BibTeXEntry;
import org.jbibtex.KeyMap;

/**
 *
 * @author Martin Raedel {@literal <martin.raedel@dlr.de>}
 * @see "https://github.com/ratelware/jbibtex/commit/55ef56df0ed8432ca9758d9133579719e0d65b63#diff-b9106310fb7903e1039d83d8b4ae7d76"
 */
public class IgnoreSubsequent implements BibTeXEntryKeyConflictResolutionPolicy {
    
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
    public BibTeXEntry entryToPut(BibTeXEntry entryCandidate, KeyMap<BibTeXEntry> currentEntries) {
        BibTeXEntry existing = currentEntries.get(entryCandidate.getKey());
        if(existing == null) {
            return entryCandidate;
        } else {
            return null;
        }
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
