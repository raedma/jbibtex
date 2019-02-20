/*
 * Copyright (c) 2012 University of Tartu
 */
package org.jbibtex;

import java.io.IOException;
import java.io.Writer;
import org.jbibtex.formatter.AbstractBibTeXFormatter;
import org.jbibtex.formatter.AbstractBibTeXFormatterTemplate;
import org.jbibtex.formatter.DefaultBibTeXFormatter;
import org.jbibtex.formatter.DefaultBibTeXFormatterTemplate;
import org.jbibtex.formatter.PeriDoXFormatter;
import org.jbibtex.formatter.PeriDoXFormatterTemplate;

public class BibTeXFormatter {
    
    private final AbstractBibTeXFormatterTemplate template;
    
    public BibTeXFormatter(){
        template = new DefaultBibTeXFormatterTemplate();
    }
    
    public BibTeXFormatter(
            AbstractBibTeXFormatterTemplate template
    ){
        this. template = template;
    }

    public void format(BibTeXDatabase database, Writer writer) throws IOException {
        
        AbstractBibTeXFormatter f;
        
        if (template instanceof DefaultBibTeXFormatterTemplate){
            f = new DefaultBibTeXFormatter(
                    database
                   ,writer
                   ,(DefaultBibTeXFormatterTemplate)template
            );
        } 
        
        else if (template instanceof PeriDoXFormatterTemplate){
            f = new PeriDoXFormatter(
                    database
                   ,writer
                   ,(PeriDoXFormatterTemplate)template
            );
        } 
        
        else {
            throw new UnsupportedOperationException(template.getClass().getSimpleName() + " not supported yet.");
        }
        
        f.perform();

        writer.flush();
    }
}