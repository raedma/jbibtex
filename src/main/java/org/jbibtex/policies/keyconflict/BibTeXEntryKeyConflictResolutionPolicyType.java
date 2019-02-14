
package org.jbibtex.policies.keyconflict;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Martin Raedel {@literal <martin.raedel@dlr.de>}
 */
public enum BibTeXEntryKeyConflictResolutionPolicyType {
    
    // --------------------------------------------------------------------
    // Values
    // --------------------------------------------------------------------
    
    IGNORE_SUBSEQUENT(new IgnoreSubsequent()),
    OVERRIDE_WITH_SUBSEQUENT(new OverrideWithSubsequent()),
    REKEY_SUBSEQUENT(new RekeySubsequent()),
    THROW_ON_DUPLICATE(new ThrowOnDuplicate()),
    ;
    
    // --------------------------------------------------------------------
    // Class variables
    // --------------------------------------------------------------------
    
    private static final Map<BibTeXEntryKeyConflictResolutionPolicy, BibTeXEntryKeyConflictResolutionPolicyType> nameMap = new HashMap<>(values().length, 1);
    
    // --------------------------------------------------------------------
    // Variables
    // --------------------------------------------------------------------
    
    private final BibTeXEntryKeyConflictResolutionPolicy name;
    
    // --------------------------------------------------------------------
    // Static
    // --------------------------------------------------------------------
    
    static {
        for (BibTeXEntryKeyConflictResolutionPolicyType t : values()){nameMap.put(t.get(), t);}
    }
    
    // --------------------------------------------------------------------
    // Private constructor
    // --------------------------------------------------------------------
    
    private BibTeXEntryKeyConflictResolutionPolicyType(BibTeXEntryKeyConflictResolutionPolicy v){
        this.name = v;
    }
    
    // --------------------------------------------------------------------
    // set-get-add-is-has-Methods
    // --------------------------------------------------------------------
    
    /**
     * Get the {@link BibTeXEntryKeyConflictResolutionPolicy}
     * @return {@link BibTeXEntryKeyConflictResolutionPolicy}
     */
    public BibTeXEntryKeyConflictResolutionPolicy get(){return name;}
    
    // --------------------------------------------------------------------
    // Methods
    // --------------------------------------------------------------------
    
    // --------------------------------------------------------------------
    // Static Methods
    // --------------------------------------------------------------------
    
}
