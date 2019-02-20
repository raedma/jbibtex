
package org.jbibtex.splitter;

import java.util.Map;
import org.jbibtex.BibTeXDatabase;
import org.jbibtex.BibTeXEntry;
import org.jbibtex.BibTeXEntryType;
import org.jbibtex.Key;

/**
 *
 * @author Martin Raedel {@literal <martin.raedel@dlr.de>}
 */
public class TypeSplitter extends AbstractBibTeXSplitter<
            TypeSplitterMemory
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
    
    public TypeSplitter(
            BibTeXDatabase db
    ){
        super(
                db
               ,new TypeSplitterMemory()
        );
    }
    
    public TypeSplitter(
            Map<Key,BibTeXEntry> entries
    ){
        super(
                entries
               ,new TypeSplitterMemory()
        );
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

    @Override
    public void split() {
        
        for (BibTeXEntry entry : entries.values()){
            
            BibTeXEntryType type = entry.getType();
            
            switch (type){
                
                case ARTICLE:
                    mem.addArticle(entry);
                    break;
                
                case BOOK:
                    mem.addBook(entry);
                    break;
                
                case BOOKLET:
                    mem.addBooklet(entry);
                    break;
                
                case CONFERENCE:
                    mem.addConference(entry);
                    break;
                
                case INBOOK:
                    mem.addInbook(entry);
                    break;
                
                case INCOLLECTION:
                    mem.addInCollection(entry);
                    break;
                
                case INPROCEEDINGS:
                    mem.addInProceeding(entry);
                    break;
                
                case MANUAL:
                    mem.addManual(entry);
                    break;
                
                case MASTERSTHESIS:
                    mem.addMasterThesis(entry);
                    break;
                
                case MISC:
                    mem.addMisc(entry);
                    break;
                
                case PERIODICAL:
                    mem.addPeriodical(entry);
                    break;
                
                case PHDTHESIS:
                    mem.addPhDThesis(entry);
                    break;
                
                case PROCEEDINGS:
                    mem.addProceeding(entry);
                    break;
                
                case TECHREPORT:
                    mem.addTechReport(entry);
                    break;
                
                case UNPUBLISHED:
                    mem.addUnpublished(entry);
                    break;
                
            }
            
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
