
package org.jbibtex;

/**
 *
 * @author Martin Raedel {@literal <martin.raedel@dlr.de>}
 * @see "https://github.com/ratelware/jbibtex/commit/55ef56df0ed8432ca9758d9133579719e0d65b63#diff-b9106310fb7903e1039d83d8b4ae7d76"
 */
public class DuplicateKeyException extends IllegalArgumentException {
    
    // --------------------------------------------------------------------
    // Class variables
    // --------------------------------------------------------------------
    
    // --------------------------------------------------------------------
    // Variables
    // --------------------------------------------------------------------
    
    public DuplicateKeyException(Key key){
        super(key.getValue());
    }
    
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
