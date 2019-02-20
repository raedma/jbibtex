/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jbibtex.formatter;

/**
 *
 * @author Martin Raedel {@literal <martin.raedel@dlr.de>}
 */
public abstract class AbstractBibTeXFormatterTemplate {
    
    // --------------------------------------------------------------------
    // Class variables
    // --------------------------------------------------------------------
    
    public static final boolean DEFAULT_WRITEEMPTY = false;
    
    // --------------------------------------------------------------------
    // Variables
    // --------------------------------------------------------------------
    
    protected String indent = "";
    protected String separator = "";
    
    protected boolean writeEmpty = DEFAULT_WRITEEMPTY;
    
    // --------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------
    
    public AbstractBibTeXFormatterTemplate(){
        this.init();
    }
    
    // --------------------------------------------------------------------
    // set-get-add-is-has-Methods
    // --------------------------------------------------------------------
    
    public void setIndent(String v){this.indent = v;}
    public String getIndent() {return indent;}
    
    public void setSeparator(String v){this.separator = v;}
    public String getSeparator() {return separator;}
    
    public void setWriteEmpty(boolean v){this.writeEmpty = v;}
    public boolean isWriteEmpty(){return writeEmpty;}
    
    // --------------------------------------------------------------------
    // Methods
    // --------------------------------------------------------------------
    
    // --------------------------------
    // General
    // --------------------------------
    
    protected abstract void init();
    
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
