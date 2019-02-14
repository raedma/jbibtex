
package org.jbibtex.policies.keyconflict;

import org.jbibtex.BibTeXEntry;
import org.jbibtex.Key;
import org.jbibtex.KeyMap;

/**
 *
 * @author Martin Raedel {@literal <martin.raedel@dlr.de>}
 * @see "https://github.com/ratelware/jbibtex/commit/55ef56df0ed8432ca9758d9133579719e0d65b63#diff-b9106310fb7903e1039d83d8b4ae7d76"
 */
public class RekeySubsequent implements BibTeXEntryKeyConflictResolutionPolicy {
    
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
        
        if(!currentEntries.containsKey(entryCandidate.getKey())) {
            return entryCandidate;
        }

        int i = 0;
        Key k = null;
        do {
            k = new Key(String.format("%s-%d", entryCandidate.getKey().getValue(), ++i));
        } while(currentEntries.containsKey(k));

        BibTeXEntry entryToAdd = new BibTeXEntry(entryCandidate.getType(), k);
        entryToAdd.addAllFields(entryCandidate.getFields());
        return entryToAdd;
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
