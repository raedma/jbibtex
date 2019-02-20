/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jbibtex.formatter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.jbibtex.BibTeXEntryType;
import org.jbibtex.BibTeXFieldType;
import org.jbibtex.StringValue.Style;

/**
 *
 * @author Martin Raedel {@literal <martin.raedel@dlr.de>}
 */
public class PeriDoXFormatterTemplate extends AbstractBibTeXFormatterTemplate {
    
    // --------------------------------------------------------------------
    // Class variables
    // --------------------------------------------------------------------
    
    public static final Style DEFAULT_STYLE = Style.BRACED;
    public static final int DEFAULT_PAD = 27;
    
    // --------------------------------------------------------------------
    // Variables
    // --------------------------------------------------------------------
    
    private Style style = DEFAULT_STYLE;
    private int pad = DEFAULT_PAD;
    
    private HashMap<BibTeXEntryType,ArrayList<BibTeXFieldType>> typeorders;
    
    
    // --------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------
    
    public PeriDoXFormatterTemplate(){
        super();
    }
    
    // --------------------------------------------------------------------
    // set-get-add-is-has-Methods
    // --------------------------------------------------------------------
    
    public void setStyle(Style v){this.style = v;}
    public void resetStyle(){style = DEFAULT_STYLE;}
    public Style getStyle(){return style;}
    
    public void setPad(int v){this.pad = v;}
    public void resetPad(){pad = DEFAULT_PAD;}
    public int getPad(){return pad;}
    
    public HashMap<BibTeXEntryType,ArrayList<BibTeXFieldType>> getTypeOrders(){return typeorders;}
    public ArrayList<BibTeXFieldType> getTypeOrder(BibTeXEntryType type){return typeorders.get(type);}
    
    // --------------------------------------------------------------------
    // Methods
    // --------------------------------------------------------------------
    
    // --------------------------------
    // General
    // --------------------------------

    @Override
    protected void init() {
        indent = "  ";
        separator = "\n\n";
        
        initOrder();
    }

    private void initOrder() {
            
        ArrayList<BibTeXFieldType> order = new ArrayList<>();

        order.add(BibTeXFieldType.AUTHOR);
        order.add(BibTeXFieldType.TITLE);
        order.add(BibTeXFieldType.BOOKTITLE);
        order.add(BibTeXFieldType.CHAPTER);
        order.add(BibTeXFieldType.EDITION);
        order.add(BibTeXFieldType.EDITOR);
        order.add(BibTeXFieldType.JOURNAL);
        order.add(BibTeXFieldType.SERIES);
        order.add(BibTeXFieldType.PUBLISHER);
        order.add(BibTeXFieldType.SCHOOL);
        order.add(BibTeXFieldType.INSTITUTION);
        order.add(BibTeXFieldType.ORGANIZATION);
        order.add(BibTeXFieldType.ADDRESS);
        order.add(BibTeXFieldType.TYPE);
        order.add(BibTeXFieldType.YEAR);
        order.add(BibTeXFieldType.MONTH);
        order.add(BibTeXFieldType.DAY);
        order.add(BibTeXFieldType.VOLUME);
        order.add(BibTeXFieldType.NUMBER);
        order.add(BibTeXFieldType.PAGES);
        order.add(BibTeXFieldType.DOI);
        order.add(BibTeXFieldType.ISBN);
        order.add(BibTeXFieldType.ISBN13);
        order.add(BibTeXFieldType.ISSN);
        order.add(BibTeXFieldType.ISSNL);
        order.add(BibTeXFieldType.PMID);
        order.add(BibTeXFieldType.URL);
        order.add(BibTeXFieldType.HOWPUBLISHED);
        order.add(BibTeXFieldType.KEYWORDS);
        order.add(BibTeXFieldType.NOTE);
        
        typeorders = new LinkedHashMap<>(BibTeXEntryType.values().length);
        for (BibTeXEntryType type : BibTeXEntryType.values()){
            typeorders.put(type, order);
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
