/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jbibtex;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Martin Raedel {@literal <martin.raedel@dlr.de>}
 */
public class BibTeXDatabaseTest {
    
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
    public void mergeTest1() throws Exception {
        
        BibTeXParser parser = new BibTeXParser();

        BibTeXDatabase database1 = BibTeXParserTest.parseFully(parser, "/S0263822316321079.bib");
        BibTeXDatabase database2 = BibTeXParserTest.parseFully(parser, "/S0263822399000240.bib");
        
        database1.mergeEntries(database2);
        
        assertEquals(2,database1.getEntries().size());
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
