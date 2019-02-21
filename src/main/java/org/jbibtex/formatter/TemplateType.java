/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jbibtex.formatter;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Martin Raedel {@literal <martin.raedel@dlr.de>}
 */
public enum TemplateType {
    
    // --------------------------------------------------------------------
    // Values
    // --------------------------------------------------------------------
    
    DEFAULT("default","d"),
    PERIDOX("peridox","p"),
    ;
    
    // --------------------------------------------------------------------
    // Class variables
    // --------------------------------------------------------------------
    
    private static final Map<String, TemplateType> nameMap = new HashMap<>(values().length, 1);
    private static final Map<String, TemplateType> abbrMap = new HashMap<>(values().length, 1);
    
    // --------------------------------------------------------------------
    // Variables
    // --------------------------------------------------------------------
    
    private final String name;
    private final String abbr;
    
    // --------------------------------------------------------------------
    // Static
    // --------------------------------------------------------------------
    
    static {
        for (TemplateType t : values()){
            nameMap.put(t.getName(), t);
            abbrMap.put(t.getAbbreviation(), t);
        }
    }
    
    // --------------------------------------------------------------------
    // Private constructor
    // --------------------------------------------------------------------
    
    private TemplateType(
            String name
           ,String abbreviation
    ){
        this.name = name;
        this.abbr = abbreviation;
    }
    
    // --------------------------------------------------------------------
    // set-get-add-is-has-Methods
    // --------------------------------------------------------------------
    
    /**
     * Get the name
     * @return name
     */
    public String getName(){return name;}
    
    /**
     * Get the abbreviation
     * @return abbreviation
     */
    public String getAbbreviation(){return abbr;}
    
    // --------------------------------------------------------------------
    // Methods
    // --------------------------------------------------------------------
    
    @Override
    public String toString() {return name;}
    
    // --------------------------------------------------------------------
    // Static Methods
    // --------------------------------------------------------------------
    
    /**
     * Get the {@link TemplateType} dependent of name
     * @param t {@link StringType
     * @param s name
     * @return {@link TemplateType}
     */
    public static TemplateType getTypeOf (StringType t, String s) {
        TemplateType result;
        
        switch (t){
            case NAME:
                result = nameMap.get(s);
                break;
            case ABBREVIATION:
                result = abbrMap.get(s);
                break;
            default:
                throw new UnsupportedOperationException(t + " not supported yet.");
        }
        
        if (result == null) {throw new IllegalArgumentException("Invalid " + TemplateType.class.getSimpleName() + " type: " + s);}
        return result;
    }
    
    public enum StringType{
        NAME
       ,ABBREVIATION
    }
    
}
