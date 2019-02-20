/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jbibtex.splitter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeMap;
import org.jbibtex.BibTeXEntry;

/**
 *
 * @author Martin Raedel {@literal <martin.raedel@dlr.de>}
 */
public class YearSplitterMemory extends AbstractBibTeXSplitterMemory <
            YearSplitterMemoryPreferences
        > {
    
    // --------------------------------------------------------------------
    // Class variables
    // --------------------------------------------------------------------
    
    // --------------------------------------------------------------------
    // Variables
    // --------------------------------------------------------------------
    
    private Map<Integer,Collection<BibTeXEntry>> entries;
    
    private Collection<BibTeXEntry> undated;
    
    // --------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------
    
    public YearSplitterMemory(){
        super(new YearSplitterMemoryPreferences());
    }
    
    public YearSplitterMemory(
            YearSplitterMemoryPreferences p
    ){
        super(p);
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
    
    public void addEntry(Integer k, BibTeXEntry v){
        if (this.entries == null){this.entries = new TreeMap<>();}
        if (!this.entries.containsKey(k)){this.entries.put(k, new LinkedHashSet<BibTeXEntry>());}
        this.entries.get(k).add(v);
    }
    public boolean hasEntries(){return entries != null && !entries.isEmpty();}
    public Map<Integer,Collection<BibTeXEntry>> getEntries(){return entries;}
    public void clearEntries(){entries = null;}
    
    public void addUndatedEntry(BibTeXEntry v){
        if (this.undated == null){this.undated = new ArrayList<>();}
        this.undated.add(v);
    }
    public boolean hasUndatedEntries(){return undated != null && !undated.isEmpty();}
    public Collection<BibTeXEntry> getUndatedEntries(){return undated;}
    public void clearUndatedEntries(){undated = null;}
    
    // --------------------------------
    // Utility
    // --------------------------------

    @Override
    public void clear() {
        this.clearEntries();
        this.clearUndatedEntries();
    }

    @Override
    public boolean isEmpty() {
        return
                !this.hasEntries()
             && !this.hasUndatedEntries()
                ;
    }

    @Override
    public void printSummary() {
        System.out.println("Entries:" + (this.hasEntries() ? "" : 0));
        
        if (this.hasEntries()){
            for (Map.Entry<Integer,Collection<BibTeXEntry>> entry : entries.entrySet()){

                Integer year = entry.getKey();
                Integer num = entry.getValue().size();

                System.out.println("  " + year + ": " + num);

            }
        }
        
        System.out.println("Undated: " + (this.hasUndatedEntries() ? this.getUndatedEntries().size() : 0));
    }
    
    // --------------------------------------------------------------------
    // Static methods
    // --------------------------------------------------------------------
    
    // --------------------------------------------------------------------
    // Inner classes
    // --------------------------------------------------------------------

}
