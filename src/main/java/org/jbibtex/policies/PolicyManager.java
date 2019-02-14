

package org.jbibtex.policies;

import java.io.Serializable;
import org.jbibtex.policies.keyconflict.BibTeXEntryKeyConflictResolutionPolicyType;

/**
 * This is a manager for policies how to deal with problematic situations.
 * @author Martin Raedel {@literal <martin.raedel@dlr.de>}
 */
public class PolicyManager implements Serializable {
    
    // --------------------------------------------------------------------
    // Class variables
    // --------------------------------------------------------------------
    
    public static final BibTeXEntryKeyConflictResolutionPolicyType DEFAULT_BIBTEXENTRYKEYCONFLICTRESOLUTION = BibTeXEntryKeyConflictResolutionPolicyType.THROW_ON_DUPLICATE;//new ThrowOnDuplicate();
    
    // --------------------------------------------------------------------
    // Variables
    // --------------------------------------------------------------------
    
    private BibTeXEntryKeyConflictResolutionPolicyType bibTeXEntryKeyConflictPolicy = DEFAULT_BIBTEXENTRYKEYCONFLICTRESOLUTION;
    
    // --------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------
    
    // --------------------------------------------------------------------
    // set-get-add-is-has-Methods
    // --------------------------------------------------------------------
    
    public void setBibTeXEntryKeyConflictResolutionPolicy(BibTeXEntryKeyConflictResolutionPolicyType v){this.bibTeXEntryKeyConflictPolicy = v;}
    public BibTeXEntryKeyConflictResolutionPolicyType getBibTeXEntryKeyConflictResolutionPolicy(){return bibTeXEntryKeyConflictPolicy;}
    
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
