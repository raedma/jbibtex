
package org.jbibtex.splitter;

import java.util.Map;
import org.jbibtex.BibTeXDatabase;
import org.jbibtex.BibTeXEntry;
import org.jbibtex.Key;

/**
 *
 * @author Martin Raedel {@literal <martin.raedel@dlr.de>}
 * @param <M> {@link AbstractBibTeXSplitterMemory} type
 */
public abstract class AbstractBibTeXSplitter<
            M extends AbstractBibTeXSplitterMemory
        > {
    
    // --------------------------------------------------------------------
    // Class variables
    // --------------------------------------------------------------------
    
    // --------------------------------------------------------------------
    // Variables
    // --------------------------------------------------------------------

    // Input
    //protected final BibTeXDatabase db;
    protected final Map<Key,BibTeXEntry> entries;
    
    // Output
    protected final M mem;
    
    // --------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------
    
    public AbstractBibTeXSplitter(
            Map<Key,BibTeXEntry> entries
           ,M mem
    ){
        this.entries = entries;
        this.mem = mem;
    }
    
    public AbstractBibTeXSplitter(
            BibTeXDatabase db
           ,M mem
    ){
        this(
                db.getEntries()
               ,mem
        );
    }
    
    // --------------------------------------------------------------------
    // set-get-add-is-has-Methods
    // --------------------------------------------------------------------
    
    public M get(){return mem;}
    
    // --------------------------------------------------------------------
    // Methods
    // --------------------------------------------------------------------
    
    // --------------------------------
    // General
    // --------------------------------
    
    public abstract void split();
    
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
