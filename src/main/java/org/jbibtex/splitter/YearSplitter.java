/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jbibtex.splitter;

import java.util.Map;
import org.jbibtex.BibTeXDatabase;
import org.jbibtex.BibTeXEntry;
import org.jbibtex.BibTeXFieldType;
import org.jbibtex.Key;
import org.jbibtex.Value;

/**
 *
 * @author Martin Raedel {@literal <martin.raedel@dlr.de>}
 */
public class YearSplitter extends AbstractBibTeXSplitter<
            YearSplitterMemory
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
    
    public YearSplitter(
            BibTeXDatabase db
    ){
        super(
                db
               ,new YearSplitterMemory()
        );
    }
    
    public YearSplitter(
            Map<Key,BibTeXEntry> entries
    ){
        super(
                entries
               ,new YearSplitterMemory()
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
            
            if (entry.hasField(BibTeXFieldType.YEAR)){
                
                Value yearValue = entry.getField(BibTeXFieldType.YEAR);
                String yearString = yearValue.toUserString();
                
                Integer year = Integer.parseInt(yearString);
                
                mem.addEntry(year, entry);
                
            } else {
                mem.addUndatedEntry(entry);
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
