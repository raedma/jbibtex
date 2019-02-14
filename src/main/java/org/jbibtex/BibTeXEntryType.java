
package org.jbibtex;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Martin Raedel {@literal <martin.raedel@dlr.de>}
 */
public enum BibTeXEntryType implements Serializable {
    
    // --------------------------------------------------------------------
    // Values
    // --------------------------------------------------------------------
    
    ARTICLE(BibTeXLanguageInterface.TYPE_ARTICLE),
    BOOK(BibTeXLanguageInterface.TYPE_BOOK),
    BOOKLET(BibTeXLanguageInterface.TYPE_BOOKLET),
    CONFERENCE(BibTeXLanguageInterface.TYPE_CONFERENCE),
    INBOOK(BibTeXLanguageInterface.TYPE_INBOOK),
    INCOLLECTION(BibTeXLanguageInterface.TYPE_INCOLLECTION),
    INPROCEEDINGS(BibTeXLanguageInterface.TYPE_INPROCEEDINGS),
    MANUAL(BibTeXLanguageInterface.TYPE_MANUAL),
    MASTERSTHESIS(BibTeXLanguageInterface.TYPE_MASTERSTHESIS),
    MISC(BibTeXLanguageInterface.TYPE_MISC),
    PERIODICAL(BibTeXLanguageInterface.TYPE_PERIODICAL),
    PHDTHESIS(BibTeXLanguageInterface.TYPE_PHDTHESIS),
    PROCEEDINGS(BibTeXLanguageInterface.TYPE_PROCEEDINGS),
    TECHREPORT(BibTeXLanguageInterface.TYPE_TECHREPORT),
    UNPUBLISHED(BibTeXLanguageInterface.TYPE_UNPUBLISHED),
    ;
    
    // --------------------------------------------------------------------
    // Class variables
    // --------------------------------------------------------------------
    
    private static final Map<String, BibTeXEntryType> nameMap = new HashMap<>(values().length, 1);
    
    // --------------------------------------------------------------------
    // Variables
    // --------------------------------------------------------------------
    
    private final String name;
    
    // --------------------------------------------------------------------
    // Static
    // --------------------------------------------------------------------
    
    static {
        for (BibTeXEntryType t : values()){nameMap.put(t.get(), t);}
    }
    
    // --------------------------------------------------------------------
    // Private constructor
    // --------------------------------------------------------------------
    
    private BibTeXEntryType(String v){
        this.name = v;
    }
    
    // --------------------------------------------------------------------
    // set-get-add-is-has-Methods
    // --------------------------------------------------------------------
    
    /**
     * Get the name
     * @return name
     */
    public String get(){return name;}
    
    // --------------------------------------------------------------------
    // Methods
    // --------------------------------------------------------------------
    
    // --------------------------------------------------------------------
    // Static Methods
    // --------------------------------------------------------------------
    
    /**
     * Get the {@link BibTeXEntryType} dependent of name. The comparison is
     * performed for the lowercase of the given argument.
     * @param typename name
     * @return {@link BibTeXEntryType}
     */
    public static BibTeXEntryType getTypeOf (String typename) {
        BibTeXEntryType result = nameMap.get(typename.toLowerCase());
        if (result == null) {throw new IllegalArgumentException("Invalid " + BibTeXEntryType.class.getSimpleName() + " type: " + typename);}
        return result;
    }
    
}
