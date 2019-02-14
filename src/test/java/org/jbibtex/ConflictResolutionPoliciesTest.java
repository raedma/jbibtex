
package org.jbibtex;

import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import org.jbibtex.policies.PolicyManager;
import org.jbibtex.policies.keyconflict.BibTeXEntryKeyConflictResolutionPolicyType;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Martin Raedel {@literal <martin.raedel@dlr.de>}
 * @see "https://github.com/ratelware/jbibtex/blob/55ef56df0ed8432ca9758d9133579719e0d65b63/src/test/java/org/jbibtex/ConflictResolutionPoliciesTest.java"
 */
public class ConflictResolutionPoliciesTest {
    
    // --------------------------------------------------------------------
    // Class variables
    // --------------------------------------------------------------------
    
    // --------------------------------------------------------------------
    // Variables
    // --------------------------------------------------------------------
    
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
    
    @Test
    public void parsingWithIgnoreSubsequentPolicyYieldsFirstEntry() throws ParseException, UnsupportedEncodingException {
        
        PolicyManager pm = new PolicyManager();
        pm.setBibTeXEntryKeyConflictResolutionPolicy(BibTeXEntryKeyConflictResolutionPolicyType.IGNORE_SUBSEQUENT);
        
        BibTeXParser parser = new BibTeXParser(pm);
        BibTeXDatabase db = parser.parse(
                new InputStreamReader(getClass().getResourceAsStream("/duplicateKey.bib"), "US-ASCII")
        );

        assertEquals(1, db.getEntries().size());
        assertEquals(
                "EnTagRec++: An enhanced tag recommendation system for software information sites",
                //db.getEntries().get(new Key("Wang20171")).getField(new Key("title")).toUserString()
                db.getEntries().get(new Key("Wang20171")).getField(BibTeXFieldType.TITLE).toUserString()
        );
    }
    /*
    @Test
    public void parsingWithDefaultPolicyBehavesAsIgnoreSubsequent() throws ParseException, UnsupportedEncodingException {
        BibTeXParser parser = new BibTeXParser();
        BibTeXDatabase db = parser.parse(
                new InputStreamReader(getClass().getResourceAsStream("/duplicateKey.bib"), "US-ASCII")
        );

        assertEquals(1, db.getEntries().size());
        assertEquals(
                "EnTagRec++: An enhanced tag recommendation system for software information sites",
                db.getEntries().get(new Key("Wang20171")).getField(new Key("title")).toUserString()
        );
    }
    */

    @Test
    public void parsingWithOverrideWithSubsequentPolicyYieldsLastEntry() throws ParseException, UnsupportedEncodingException {
        
        PolicyManager pm = new PolicyManager();
        pm.setBibTeXEntryKeyConflictResolutionPolicy(BibTeXEntryKeyConflictResolutionPolicyType.OVERRIDE_WITH_SUBSEQUENT);
        
        BibTeXParser parser = new BibTeXParser(pm);
        BibTeXDatabase db = parser.parse(
                new InputStreamReader(getClass().getResourceAsStream("/duplicateKey.bib"), "US-ASCII")
        );

        assertEquals(1, db.getEntries().size());
        assertEquals(
                "Understanding the factors for fast answers in technical Q&A websites: An empirical study of four stack exchange websites",
                //db.getEntries().get(new Key("Wang20171")).getField(new Key("title")).toUserString()
                db.getEntries().get(new Key("Wang20171")).getField(BibTeXFieldType.TITLE).toUserString()
        );
    }

    @Test(expected = DuplicateKeyException.class)
    public void parsingWithThrowOnDuplicateThrowsWhenDuplicateIsEncountered() throws ParseException, UnsupportedEncodingException {
        PolicyManager pm = new PolicyManager();
        pm.setBibTeXEntryKeyConflictResolutionPolicy(BibTeXEntryKeyConflictResolutionPolicyType.THROW_ON_DUPLICATE);
        
        BibTeXParser parser = new BibTeXParser(pm);
        BibTeXDatabase db = parser.parse(
                new InputStreamReader(getClass().getResourceAsStream("/duplicateKey.bib"), "US-ASCII")
        );
    }

    @Test
    public void parsingWithThrowOnDuplicateParsesValidFileWithoutIssues() throws ParseException, UnsupportedEncodingException {
        PolicyManager pm = new PolicyManager();
        pm.setBibTeXEntryKeyConflictResolutionPolicy(BibTeXEntryKeyConflictResolutionPolicyType.THROW_ON_DUPLICATE);
        
        BibTeXParser parser = new BibTeXParser(pm);
        BibTeXDatabase db = parser.parse(
                new InputStreamReader(getClass().getResourceAsStream("/zotero.bib"), "US-ASCII")
        );
        assertEquals(1, db.getEntries().size());
    }

    @Test
    public void parsingWithRekeySubsequentPolicyYieldsBothEntries() throws ParseException, UnsupportedEncodingException {
        PolicyManager pm = new PolicyManager();
        pm.setBibTeXEntryKeyConflictResolutionPolicy(BibTeXEntryKeyConflictResolutionPolicyType.REKEY_SUBSEQUENT);
        
        BibTeXParser parser = new BibTeXParser(pm);
        BibTeXDatabase db = parser.parse(
                new InputStreamReader(getClass().getResourceAsStream("/duplicateKey.bib"), "US-ASCII")
        );

        assertEquals(2, db.getEntries().size());
        assertEquals(
                "EnTagRec++: An enhanced tag recommendation system for software information sites",
                //db.getEntries().get(new Key("Wang20171")).getField(new Key("title")).toUserString()
                db.getEntries().get(new Key("Wang20171")).getField(BibTeXFieldType.TITLE).toUserString()
        );
        assertEquals(
                "Understanding the factors for fast answers in technical Q&A websites: An empirical study of four stack exchange websites",
                //db.getEntries().get(new Key("Wang20171-1")).getField(new Key("title")).toUserString()
                db.getEntries().get(new Key("Wang20171-1")).getField(BibTeXFieldType.TITLE).toUserString()
        );
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
