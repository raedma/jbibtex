/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jbibtex.formatter;

import java.io.IOException;
import java.io.Writer;
import org.jbibtex.BibTeXComment;
import org.jbibtex.BibTeXDatabase;
import org.jbibtex.BibTeXEntry;
import org.jbibtex.BibTeXInclude;
import org.jbibtex.BibTeXLanguageInterface;
import org.jbibtex.BibTeXPreamble;
import org.jbibtex.BibTeXString;
import org.jbibtex.Key;
import org.jbibtex.StringUtil;
import org.jbibtex.Value;

/**
 *
 * @author Martin Raedel {@literal <martin.raedel@dlr.de>}
 * @param <T> {@link AbstractBibTeXFormatterTemplate} type
 */
public abstract class AbstractBibTeXFormatter<
            T extends AbstractBibTeXFormatterTemplate
        > implements BibTeXLanguageInterface {
    
    // --------------------------------------------------------------------
    // Class variables
    // --------------------------------------------------------------------
    
    // --------------------------------------------------------------------
    // Variables
    // --------------------------------------------------------------------

    protected final BibTeXDatabase database;
    protected final Writer writer;
    protected final T template;
    
    // --------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------
    
    public AbstractBibTeXFormatter(
            BibTeXDatabase database
           ,Writer writer
           ,T template
    ){
        this.database = database;
        this.writer = writer;
        this.template = template;
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
    
    public abstract void perform() throws IOException;
    
    protected abstract void format(BibTeXComment comment, Writer writer) throws IOException;
    protected abstract void format(BibTeXEntry entry, Writer writer) throws IOException;
    protected abstract void format(BibTeXInclude include, Writer writer) throws IOException;
    protected abstract void format(BibTeXPreamble preamble, Writer writer) throws IOException;
    protected abstract void format(BibTeXString string, Writer writer) throws IOException;

    protected void format(Key key, Writer writer) throws IOException {
        String string = key.getValue();
        writer.write(string);
    }
    
    protected void format(Value value, int level, Writer writer) throws IOException {
        String string = StringUtil.addIndent(value.format(), level, getIndent());

        writer.write(string);
    }

    protected String getIndent(){
        return template.getIndent();
    }
    
    // --------------------------------
    // Utility
    // --------------------------------
    
    /**
     * Capitalizes the first letter in a string.
     * @param original String
     * @return String with first letter capitalized. The original string is
     * returned in case the input has length 0 or is null.
     * @see "https://stackoverflow.com/a/5726057"
     */
    public String toFirstLetterUppercase(String original) {
        if (original == null || original.length() == 0) {
            return original;
        }
        return original.substring(0, 1).toUpperCase() + original.substring(1);
    }
    
    // --------------------------------------------------------------------
    // Static methods
    // --------------------------------------------------------------------
    
    // --------------------------------------------------------------------
    // Inner classes
    // --------------------------------------------------------------------

}
