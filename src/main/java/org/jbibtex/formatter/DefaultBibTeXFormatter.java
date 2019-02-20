/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jbibtex.formatter;

import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jbibtex.BibTeXComment;
import org.jbibtex.BibTeXDatabase;
import org.jbibtex.BibTeXEntry;
import org.jbibtex.BibTeXFieldType;
import org.jbibtex.BibTeXInclude;
import org.jbibtex.BibTeXObject;
import org.jbibtex.BibTeXPreamble;
import org.jbibtex.BibTeXString;
import org.jbibtex.StringUtil;
import org.jbibtex.Value;

/**
 *
 * @author Martin Raedel {@literal <martin.raedel@dlr.de>}
 */
public class DefaultBibTeXFormatter extends AbstractBibTeXFormatter<
            DefaultBibTeXFormatterTemplate
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
    
    public DefaultBibTeXFormatter(
            BibTeXDatabase database
           ,Writer writer
           ,DefaultBibTeXFormatterTemplate template
    ){
        super(
                database
               ,writer
               ,template
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
    public void perform() throws IOException {
        
        List<BibTeXObject> objects = database.getObjects();

        String separator = template.getSeparator();
        
        Iterator<BibTeXObject> it = objects.iterator();

        while(it.hasNext()){
            
            BibTeXObject object = it.next();

            if(object instanceof BibTeXComment){
                format((BibTeXComment)object, writer);
            } else

            if(object instanceof BibTeXEntry){
                format((BibTeXEntry)object, writer);
            } else

            if(object instanceof BibTeXInclude){
                format((BibTeXInclude)object, writer);
            } else

            if(object instanceof BibTeXPreamble){
                format((BibTeXPreamble)object, writer);
            } else

            if(object instanceof BibTeXString){
                format((BibTeXString)object, writer);
            } else{
                throw new IllegalArgumentException();
            }
            
            if (it.hasNext()){
                writer.write(separator);
            }
        }
    }

    @Override
    protected void format(BibTeXComment comment, Writer writer) throws IOException {
        writer.write(SYMBOL_ENTRY + this.toFirstLetterUppercase(ENTRYTYPE_COMMENT));

        format(comment.getValue(), 1, writer);
    }

    @Override
    protected void format(BibTeXEntry entry, Writer writer) throws IOException {
        writer.write(SYMBOL_ENTRY);
        writer.write(entry.getType().get());

        writer.write('{');
        format(entry.getKey(), writer);
        writer.write(',');
        writer.write('\n');

        Collection<Map.Entry<BibTeXFieldType, Value>> fields = (entry.getFields()).entrySet();
        for(Iterator<Map.Entry<BibTeXFieldType, Value>> it = fields.iterator(); it.hasNext(); ){
            Map.Entry<BibTeXFieldType, Value> field = it.next();

            writer.write(getIndent());

            writer.write(field.getKey().get());
            writer.write(" = ");
            format(field.getValue(), 2, writer);

            if(it.hasNext()){
                writer.write(',');
            }

            writer.write('\n');
        }

        writer.write('}');
    }

    @Override
    protected void format(BibTeXInclude include, Writer writer) throws IOException {
        writer.write(SYMBOL_ENTRY + this.toFirstLetterUppercase(ENTRYTYPE_INCLUDE));

        format(include.getValue(), 1, writer);
    }

    @Override
    protected void format(BibTeXPreamble preamble, Writer writer) throws IOException {
        writer.write(SYMBOL_ENTRY + this.toFirstLetterUppercase(ENTRYTYPE_PREAMBLE));

        writer.write('{');
        format(preamble.getValue(), 1, writer);
        writer.write('}');
    }

    @Override
    protected void format(BibTeXString string, Writer writer) throws IOException {
        writer.write(SYMBOL_ENTRY + this.toFirstLetterUppercase(ENTRYTYPE_STRING));

        writer.write('{');
        format(string.getKey(), writer);
        writer.write(" = ");
        format(string.getValue(), 1, writer);
        writer.write('}');
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
