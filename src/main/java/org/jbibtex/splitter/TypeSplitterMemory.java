
package org.jbibtex.splitter;

import java.util.ArrayList;
import org.jbibtex.BibTeXEntry;
import org.jbibtex.BibTeXEntryType;

/**
 *
 * @author Martin Raedel {@literal <martin.raedel@dlr.de>}
 */
public class TypeSplitterMemory extends AbstractBibTeXSplitterMemory <
            TypeSplitterMemoryPreferences
        > {
    
    // --------------------------------------------------------------------
    // Class variables
    // --------------------------------------------------------------------
    
    // --------------------------------------------------------------------
    // Variables
    // --------------------------------------------------------------------
    
    private ArrayList<BibTeXEntry> articles;
    private ArrayList<BibTeXEntry> books;
    private ArrayList<BibTeXEntry> booklets;
    private ArrayList<BibTeXEntry> conferences;
    private ArrayList<BibTeXEntry> inbooks;
    private ArrayList<BibTeXEntry> incollections;
    private ArrayList<BibTeXEntry> inproceedings;
    private ArrayList<BibTeXEntry> manuals;
    private ArrayList<BibTeXEntry> masterthesis;
    private ArrayList<BibTeXEntry> miscs;
    private ArrayList<BibTeXEntry> periodicals;
    private ArrayList<BibTeXEntry> phdthesis;
    private ArrayList<BibTeXEntry> proceedings;
    private ArrayList<BibTeXEntry> techreports;
    private ArrayList<BibTeXEntry> unpublished;
    
    // --------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------
    
    public TypeSplitterMemory(){
        super(new TypeSplitterMemoryPreferences());
    }
    
    public TypeSplitterMemory(
            TypeSplitterMemoryPreferences p
    ){
        super(p);
    }
    
    // --------------------------------------------------------------------
    // set-get-add-is-has-Methods
    // --------------------------------------------------------------------
    
    public void addArticle(BibTeXEntry v){
        if (this.articles == null){this.articles = new ArrayList<>(prefs.getInitialCapacity());}
        articles.add(v);
    }
    public boolean hasArticles(){return articles != null && !articles.isEmpty();}
    public ArrayList<BibTeXEntry> getArticles(){return articles;}
    public void clearArticles(){articles = null;}
    
    public void addBook(BibTeXEntry v){
        if (this.books == null){this.books = new ArrayList<>(prefs.getInitialCapacity());}
        books.add(v);
    }
    public boolean hasBooks(){return books != null && !books.isEmpty();}
    public ArrayList<BibTeXEntry> getBooks(){return books;}
    public void clearBooks(){books = null;}
    
    public void addBooklet(BibTeXEntry v){
        if (this.booklets == null){this.booklets = new ArrayList<>(prefs.getInitialCapacity());}
        booklets.add(v);
    }
    public boolean hasBooklets(){return booklets != null && !booklets.isEmpty();}
    public ArrayList<BibTeXEntry> getBooklets(){return booklets;}
    public void clearBooklets(){booklets = null;}
    
    public void addConference(BibTeXEntry v){
        if (this.conferences == null){this.conferences = new ArrayList<>(prefs.getInitialCapacity());}
        conferences.add(v);
    }
    public boolean hasConferences(){return conferences != null && !conferences.isEmpty();}
    public ArrayList<BibTeXEntry> getConferences(){return conferences;}
    public void clearConferences(){conferences = null;}
    
    public void addInbook(BibTeXEntry v){
        if (this.inbooks == null){this.inbooks = new ArrayList<>(prefs.getInitialCapacity());}
        inbooks.add(v);
    }
    public boolean hasInBooks(){return inbooks != null && !inbooks.isEmpty();}
    public ArrayList<BibTeXEntry> getInBooks(){return inbooks;}
    public void clearInBooks(){inbooks = null;}
    
    public void addInCollection(BibTeXEntry v){
        if (this.incollections == null){this.incollections = new ArrayList<>(prefs.getInitialCapacity());}
        incollections.add(v);
    }
    public boolean hasInCollections(){return incollections != null && !incollections.isEmpty();}
    public ArrayList<BibTeXEntry> getInCollections(){return incollections;}
    public void clearInCollections(){incollections = null;}
    
    public void addInProceeding(BibTeXEntry v){
        if (this.inproceedings == null){this.inproceedings = new ArrayList<>(prefs.getInitialCapacity());}
        inproceedings.add(v);
    }
    public boolean hasInProceedings(){return inproceedings != null && !inproceedings.isEmpty();}
    public ArrayList<BibTeXEntry> getInProceedings(){return inproceedings;}
    public void clearInProceedings(){inproceedings = null;}
    
    public void addManual(BibTeXEntry v){
        if (this.manuals == null){this.manuals = new ArrayList<>(prefs.getInitialCapacity());}
        manuals.add(v);
    }
    public boolean hasManuals(){return manuals != null && !manuals.isEmpty();}
    public ArrayList<BibTeXEntry> getManuals(){return manuals;}
    public void clearManuals(){manuals = null;}
    
    public void addMasterThesis(BibTeXEntry v){
        if (this.masterthesis == null){this.masterthesis = new ArrayList<>(prefs.getInitialCapacity());}
        masterthesis.add(v);
    }
    public boolean hasMasterThesis(){return masterthesis != null && !masterthesis.isEmpty();}
    public ArrayList<BibTeXEntry> getMasterThesis(){return masterthesis;}
    public void clearMasterThesis(){masterthesis = null;}
    
    public void addMisc(BibTeXEntry v){
        if (this.miscs == null){this.miscs = new ArrayList<>(prefs.getInitialCapacity());}
        miscs.add(v);
    }
    public boolean hasMiscs(){return miscs != null && !miscs.isEmpty();}
    public ArrayList<BibTeXEntry> getMiscs(){return miscs;}
    public void clearMiscs(){miscs = null;}
    
    public void addPeriodical(BibTeXEntry v){
        if (this.periodicals == null){this.periodicals = new ArrayList<>(prefs.getInitialCapacity());}
        periodicals.add(v);
    }
    public boolean hasPeriodicals(){return periodicals != null && !periodicals.isEmpty();}
    public ArrayList<BibTeXEntry> getPeriodicals(){return periodicals;}
    public void clearPeriodicals(){periodicals = null;}
    
    public void addPhDThesis(BibTeXEntry v){
        if (this.phdthesis == null){this.phdthesis = new ArrayList<>(prefs.getInitialCapacity());}
        phdthesis.add(v);
    }
    public boolean hasPhDThesis(){return phdthesis != null && !phdthesis.isEmpty();}
    public ArrayList<BibTeXEntry> getPhDThesis(){return phdthesis;}
    public void clearPhDThesis(){phdthesis = null;}
    
    public void addProceeding(BibTeXEntry v){
        if (this.proceedings == null){this.proceedings = new ArrayList<>(prefs.getInitialCapacity());}
        proceedings.add(v);
    }
    public boolean hasProceedings(){return proceedings != null && !proceedings.isEmpty();}
    public ArrayList<BibTeXEntry> getProceedings(){return proceedings;}
    public void clearProceedings(){proceedings = null;}
    
    public void addTechReport(BibTeXEntry v){
        if (this.techreports == null){this.techreports = new ArrayList<>(prefs.getInitialCapacity());}
        techreports.add(v);
    }
    public boolean hasTechReports(){return techreports != null && !techreports.isEmpty();}
    public ArrayList<BibTeXEntry> getTechReports(){return techreports;}
    public void clearTechReports(){techreports = null;}
    
    public void addUnpublished(BibTeXEntry v){
        if (this.unpublished == null){this.unpublished = new ArrayList<>(prefs.getInitialCapacity());}
        unpublished.add(v);
    }
    public boolean hasUnpublished(){return unpublished != null && !unpublished.isEmpty();}
    public ArrayList<BibTeXEntry> getUnpublished(){return unpublished;}
    public void clearUnpublished(){unpublished = null;}
    
    // --------------------------------------------------------------------
    // Methods
    // --------------------------------------------------------------------
    
    // --------------------------------
    // General
    // --------------------------------
    
    // --------------------------------
    // Utility
    // --------------------------------
    
    @Override
    public void clear(){
        this.clearArticles();
        this.clearBooklets();
        this.clearBooks();
        this.clearConferences();
        this.clearInBooks();
        this.clearInCollections();
        this.clearInProceedings();
        this.clearManuals();
        this.clearMasterThesis();
        this.clearMiscs();
        this.clearPhDThesis();
        this.clearProceedings();
        this.clearTechReports();
        this.clearUnpublished();
    }
    
    @Override
    public boolean isEmpty(){
        return 
                !this.hasArticles()
             && !this.hasBooklets()
             && !this.hasBooks()
             && !this.hasConferences()
             && !this.hasInBooks()
             && !this.hasInCollections()
             && !this.hasInProceedings()
             && !this.hasManuals()
             && !this.hasMasterThesis()
             && !this.hasMiscs()
             && !this.hasPhDThesis()
             && !this.hasProceedings()
             && !this.hasTechReports()
             && !this.hasUnpublished()
                ;
    }

    @Override
    public void printSummary() {
        
        String S = " ";
        
        System.out.println("Summary:");
        System.out.println("  " + BibTeXEntryType.ARTICLE.get() + ":" + S + (this.hasArticles() ? this.getArticles().size() : "0"));
        System.out.println("  " + BibTeXEntryType.BOOK.get() + ":" + S + (this.hasBooks() ? this.getBooks().size() : "0"));
        System.out.println("  " + BibTeXEntryType.BOOKLET.get() + ":" + S + (this.hasBooklets() ? this.getBooklets().size() : "0"));
        System.out.println("  " + BibTeXEntryType.CONFERENCE.get() + ":" + S + (this.hasConferences() ? this.getConferences().size() : "0"));
        System.out.println("  " + BibTeXEntryType.INBOOK.get() + ":" + S + (this.hasInBooks() ? this.getInBooks().size() : "0"));
        System.out.println("  " + BibTeXEntryType.INCOLLECTION.get() + ":" + S + (this.hasInCollections() ? this.getInCollections().size() : "0"));
        System.out.println("  " + BibTeXEntryType.INPROCEEDINGS.get() + ":" + S + (this.hasInProceedings() ? this.getInProceedings().size() : "0"));
        System.out.println("  " + BibTeXEntryType.MANUAL.get() + ":" + S + (this.hasManuals() ? this.getManuals().size() : "0"));
        System.out.println("  " + BibTeXEntryType.MASTERSTHESIS.get() + ":" + S + (this.hasMasterThesis() ? this.getMasterThesis().size() : "0"));
        System.out.println("  " + BibTeXEntryType.MISC.get() + ":" + S + (this.hasMiscs() ? this.getMiscs().size() : "0"));
        System.out.println("  " + BibTeXEntryType.PERIODICAL.get() + ":" + S + (this.hasPeriodicals() ? this.getPeriodicals().size() : "0"));
        System.out.println("  " + BibTeXEntryType.PHDTHESIS.get() + ":" + S + (this.hasPhDThesis() ? this.getPhDThesis().size() : "0"));
        System.out.println("  " + BibTeXEntryType.PROCEEDINGS.get() + ":" + S + (this.hasProceedings() ? this.getProceedings().size() : "0"));
        System.out.println("  " + BibTeXEntryType.TECHREPORT.get() + ":" + S + (this.hasTechReports() ? this.getTechReports().size() : "0"));
        System.out.println("  " + BibTeXEntryType.UNPUBLISHED.get() + ":" + S + (this.hasUnpublished() ? this.getUnpublished().size() : "0"));
        
    }
    
    // --------------------------------------------------------------------
    // Static methods
    // --------------------------------------------------------------------
    
    // --------------------------------------------------------------------
    // Inner classes
    // --------------------------------------------------------------------

}
