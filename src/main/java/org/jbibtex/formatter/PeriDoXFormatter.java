/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jbibtex.formatter;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import org.apache.commons.lang3.StringUtils;
import org.jbibtex.BibTeXComment;
import org.jbibtex.BibTeXDatabase;
import org.jbibtex.BibTeXEntry;
import org.jbibtex.BibTeXEntryType;
import org.jbibtex.BibTeXFieldType;
import org.jbibtex.BibTeXInclude;
import org.jbibtex.BibTeXLanguageInterface;
import org.jbibtex.BibTeXObject;
import org.jbibtex.BibTeXPreamble;
import org.jbibtex.BibTeXString;
import org.jbibtex.StringUtil;
import org.jbibtex.StringValue.Style;
import org.jbibtex.Value;
import org.jbibtex.comparator.comparator.BibTeXEntryKeyAlphabeticalComparator;
import org.jbibtex.splitter.TypeSplitter;
import org.jbibtex.splitter.TypeSplitterMemory;

/**
 *
 * @author Martin Raedel {@literal <martin.raedel@dlr.de>}
 */
public class PeriDoXFormatter extends AbstractBibTeXFormatter<
            PeriDoXFormatterTemplate
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
    
    public PeriDoXFormatter(
            BibTeXDatabase database
           ,Writer writer
           ,PeriDoXFormatterTemplate template
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
    // ----------------------------------------------------------------
    
    @Override
    public void perform() throws IOException {
        
        List<BibTeXObject> objects = database.getObjects();
        
        // Write
        Iterator<BibTeXObject> it = objects.iterator();

        while(it.hasNext()){
            
            BibTeXObject object = it.next();

            if(object instanceof BibTeXComment){
                format((BibTeXComment)object, writer);
            } else

            if(object instanceof BibTeXEntry){
                //format((BibTeXEntry)object, writer);
                continue;
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
                writer.write(template.getSeparator());
            }
        }
        
        // Sort {@link BibTeXEntry} types
        TypeSplitter s = new TypeSplitter(
                database.getEntries()
        );
        s.split();
        TypeSplitterMemory mem = s.get();
        
        if (mem.isEmpty()){return;}
        
        if (mem.hasArticles()){writeEntries(BibTeXEntryType.ARTICLE.get(),mem.getArticles(),writer);}
        if (mem.hasBooks()){writeEntries(BibTeXEntryType.BOOK.get(),mem.getBooks(),writer);}
        if (mem.hasBooklets()){writeEntries(BibTeXEntryType.BOOKLET.get(),mem.getBooklets(),writer);}
        if (mem.hasConferences()){writeEntries(BibTeXEntryType.CONFERENCE.get(),mem.getConferences(),writer);}
        if (mem.hasInBooks()){writeEntries(BibTeXEntryType.INBOOK.get(),mem.getInBooks(),writer);}        
        if (mem.hasInCollections()){writeEntries(BibTeXEntryType.INCOLLECTION.get(),mem.getInCollections(),writer);}
        if (mem.hasInProceedings()){writeEntries(BibTeXEntryType.INPROCEEDINGS.get(),mem.getInProceedings(),writer);}
        if (mem.hasManuals()){writeEntries(BibTeXEntryType.MANUAL.get(),mem.getManuals(),writer);}        
        if (mem.hasMiscs()){writeEntries(BibTeXEntryType.MISC.get(),mem.getMiscs(),writer);}
        if (mem.hasPeriodicals()){writeEntries(BibTeXEntryType.PERIODICAL.get(),mem.getPeriodicals(),writer);}
        if (mem.hasPhDThesis()){writeEntries(BibTeXEntryType.PHDTHESIS.get(),mem.getPhDThesis(),writer);}
        if (mem.hasProceedings()){writeEntries(BibTeXEntryType.PROCEEDINGS.get(),mem.getProceedings(),writer);}
        if (mem.hasTechReports()){writeEntries(BibTeXEntryType.TECHREPORT.get(),mem.getTechReports(),writer);}
        if (mem.hasUnpublished()){writeEntries(BibTeXEntryType.UNPUBLISHED.get(),mem.getUnpublished(),writer);}

    }
    
    private void writeEntries(String header, Collection<BibTeXEntry> entries, Writer writer) throws IOException{
        
        // Header
        writeHeader(header,writer);
        
        // Sort alphabetically for key
        /*
        Set<BibTeXEntry> set = new TreeSet<>(new Comparator<BibTeXEntry>(){
            @Override
            public int compare(BibTeXEntry t1, BibTeXEntry t2) {
                return t1.getKey().getValue().trim().compareTo(t2.getKey().getValue().trim());
            }
            
        });
        */
        Set<BibTeXEntry> set = new TreeSet<>(new BibTeXEntryKeyAlphabeticalComparator());
        set.addAll(entries);
        
        //
        //Iterator<BibTeXEntry> eit = entries.iterator();
        Iterator<BibTeXEntry> eit = set.iterator();
        while(eit.hasNext()){
            BibTeXEntry entry  = eit.next();
            this.format(entry, writer);
            //
            //if (eit.hasNext()){writer.write("\n\n");}
            writer.write("\n\n");
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

        writer.write(BibTeXLanguageInterface.SYMBOL_BRACKET_OPEN);
        format(entry.getKey(), writer);
        writer.write(BibTeXLanguageInterface.SYMBOL_NAMETOKENDELIMITER);
        writer.write('\n');

        ArrayList<BibTeXFieldType> order = template.getTypeOrder(entry.getType());
        //Collection<Map.Entry<BibTeXFieldType, Value>> fields = (entry.getFields()).entrySet();
        Map<BibTeXFieldType, Value> fields = (entry.getFields());
        
        String s;
        int l = (BibTeXEntryType.getMaxLength()+1 > template.getPad() ? BibTeXEntryType.getMaxLength()+1 : template.getPad());
        
        for (BibTeXFieldType type : order){
            
            if (fields.containsKey(type)){
                
                Value field = fields.get(type);
                String value = field.toUserString();
                
                if (value.isEmpty() && !template.isWriteEmpty()){continue;}
                
                // Remove leading and trailing spaces
                value = StringUtils.trim(value);
                value = StringUtils.strip(value);
                value = StringUtil.removeMultipleWhiteSpacesWithOne(value);
                
                // Field type
                s = "";
                s += getIndent();
                s += type.get();
                s = StringUtils.rightPad(s,l);
                writer.write(s);
                
                writer.write("= ");
                
                // Value
                switch(type){
                    case PAGES:
                        PagesFormatter f = new PagesFormatter(value);
                        f.perform();
                        format(f.get(), template.getStyle(), writer);
                        break;
                    case YEAR:
                    case VOLUME:
                    case NUMBER:
                    case DOI:
                    case ISBN:
                    case ISBN13:
                    case ISSN:
                    case ISSNL:
                    case URL:
                        value = value.replace(" ", "");
                        format(value, template.getStyle(), writer);
                        
                        break;
                    default:
                        format(value, template.getStyle(), writer);
                }
                
                
                // new line
                writer.write(",\n");
            }
        }
        
        
        
        /*
        for(Iterator<Map.Entry<BibTeXFieldType, Value>> it = fields.iterator(); it.hasNext(); ){
            Map.Entry<BibTeXFieldType, Value> field = it.next();

            writer.write(getIndent());

            writer.write(field.getKey().get());
            writer.write(" = ");
            format(field.getValue(), 2, writer);e(',');
            }

            if(it.hasNext()){
                writer.write(',');
            }

            writer.write('\n');
        }
    */

        writer.write(BibTeXLanguageInterface.SYMBOL_BRACKET_CLOSE);
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
    
    private void writeHeader(String header, Writer writer) throws IOException{
        writer.write("%" + StringUtil.repeat("-",29) + "\n");
        writer.write("% " + header + "\n");
        writer.write("%" + StringUtils.repeat("-",29) + "\n");
        writer.write("\n");
        
    }
    
    protected void format(Value value, Style style, Writer writer) throws IOException {
        //String string = StringUtil.addIndent(value.format(), level, getIndent());
        
        String string = style.getBegin() + value.toUserString() + style.getEnd();

        writer.write(string);
    }
    
    protected void format(String value, Style style, Writer writer) throws IOException {
        //String string = StringUtil.addIndent(value.format(), level, getIndent());
        
        String string = style.getBegin() + value + style.getEnd();

        writer.write(string);
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
    
    private abstract class AbstractItemFormatter{
        
        protected final String value;
        
        protected String result;
        
        public AbstractItemFormatter(
                String value
        ){
            this.value = value;
        }
        
        public String get(){return result;}
        
        public abstract void perform();
    }
    
    public class PagesFormatter extends AbstractItemFormatter{
        
        
        public PagesFormatter(
                String value
        ){
            super(
                    value
            );
        }

        @Override
        public void perform() {
            
            // Remove spaces
            result = StringUtils.removeAll(value," ");
            
            // Long Em minus?
            if (result.contains("\u2014")){
                result = result.replace("\u2014","--");
            }
            
            // Minus?
            if (result.contains("-") && !result.contains("--")){
                result = result.replace("-","--");
            }
            
        }
        
    }

}
