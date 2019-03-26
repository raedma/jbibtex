
package org.jbibtex;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Martin Raedel {@literal <martin.raedel@dlr.de>}
 */
public enum BibTeXFieldType implements Serializable {
    
    // --------------------------------------------------------------------
    // Values
    // --------------------------------------------------------------------
        
    ABSTRACT(BibTeXLanguageInterface.KEY_ABSTRACT),
    ACKNOWLEDGEMENT(BibTeXLanguageInterface.KEY_ACKNOWLEDGEMENT),
    ADDRESS(BibTeXLanguageInterface.KEY_ADDRESS),
    AFFILIATION(BibTeXLanguageInterface.KEY_AFFILIATION),
    ANNOTE(BibTeXLanguageInterface.KEY_ANNOTE),
    AUTHOR(BibTeXLanguageInterface.KEY_AUTHOR),
    BIBDATE(BibTeXLanguageInterface.KEY_BIBDATE),
    BIBSOURCE(BibTeXLanguageInterface.KEY_BIBSOURCE),
    BIBURL(BibTeXLanguageInterface.KEY_BIBURL),
    BOOKTITLE(BibTeXLanguageInterface.KEY_BOOKTITLE),
    CHAPTER(BibTeXLanguageInterface.KEY_CHAPTER),
    CLASSCODES(BibTeXLanguageInterface.KEY_CLASSCODES),
    CLASSIFICATION(BibTeXLanguageInterface.KEY_CLASSIFICATION),
    CODEN(BibTeXLanguageInterface.KEY_CODEN),
    CORPSOURCE(BibTeXLanguageInterface.KEY_CORPSOURCE),
    CROSSREF(BibTeXLanguageInterface.KEY_CROSSREF),
    DAY(BibTeXLanguageInterface.KEY_DAY),
    DOCUMENT_TYPE(BibTeXLanguageInterface.KEY_DOCUMENT_TYPE),
    DOI(BibTeXLanguageInterface.KEY_DOI),
    EDITION(BibTeXLanguageInterface.KEY_EDITION),
    EDITOR(BibTeXLanguageInterface.KEY_EDITOR),
    EPRINT(BibTeXLanguageInterface.KEY_EPRINT),
    FJOURNAL(BibTeXLanguageInterface.KEY_FJOURNAL),
    GENERALTERMS(BibTeXLanguageInterface.KEY_GENERALTERMS),
    HOWPUBLISHED(BibTeXLanguageInterface.KEY_HOWPUBLISHED),
    INSTITUTION(BibTeXLanguageInterface.KEY_INSTITUTION),
    ISBN(BibTeXLanguageInterface.KEY_ISBN),
    ISBN13(BibTeXLanguageInterface.KEY_ISBN13),
    ISSN(BibTeXLanguageInterface.KEY_ISSN),
    ISSNL(BibTeXLanguageInterface.KEY_ISSNL),
    JOURNAL(BibTeXLanguageInterface.KEY_JOURNAL),
    KEY(BibTeXLanguageInterface.KEY_KEY),
    KEYWORDS(BibTeXLanguageInterface.KEY_KEYWORDS),
    LCCN(BibTeXLanguageInterface.KEY_LCCN),
    MONTH(BibTeXLanguageInterface.KEY_MONTH),
    NOTE(BibTeXLanguageInterface.KEY_NOTE),
    NUMBER(BibTeXLanguageInterface.KEY_NUMBER),
    NUMPAGES(BibTeXLanguageInterface.KEY_NUMPAGES),
    ORGANIZATION(BibTeXLanguageInterface.KEY_ORGANIZATION),
    PAGES(BibTeXLanguageInterface.KEY_PAGES),
    PUBLISHER(BibTeXLanguageInterface.KEY_PUBLISHER),
    SCHOOL(BibTeXLanguageInterface.KEY_SCHOOL),
    SERIES(BibTeXLanguageInterface.KEY_SERIES),
    SUBJECT(BibTeXLanguageInterface.KEY_SUBJECT),
    TIMESTAMP(BibTeXLanguageInterface.KEY_TIMESTAMP),
    TITLE(BibTeXLanguageInterface.KEY_TITLE),
    TOPIC(BibTeXLanguageInterface.KEY_TOPIC),
    TREATMENT(BibTeXLanguageInterface.KEY_TREATMENT),
    TYPE(BibTeXLanguageInterface.KEY_TYPE),
    UNKNOWN(BibTeXLanguageInterface.KEY_UNKNOWN),
    URL(BibTeXLanguageInterface.KEY_URL),
    VOLUME(BibTeXLanguageInterface.KEY_VOLUME),
    YEAR(BibTeXLanguageInterface.KEY_YEAR),
    
    
    ABSTRACT2(BibTeXLanguageInterface.KEY_ABSTRACT2),
    ACCEPTED(BibTeXLanguageInterface.KEY_ACCEPTED),
    ADDEDAT(BibTeXLanguageInterface.KEY_ADDEDAT),
    ADDEDBY(BibTeXLanguageInterface.KEY_ADDEDBY),
    ADVISER(BibTeXLanguageInterface.KEY_ADVISER),
    AFFILIATIONADDRESS(BibTeXLanguageInterface.KEY_AFFILIATIONADDRESS),
    ALTBOOKTITLE(BibTeXLanguageInterface.KEY_ALTBOOKTITLE),
    ALTTITLE(BibTeXLanguageInterface.KEY_ALTTITLE),
    ARCHIVEPREFIX(BibTeXLanguageInterface.KEY_ARCHIVEPREFIX),
    ARTICLENO(BibTeXLanguageInterface.KEY_ARTICLENO),
    AUTHOR1ADDRESS(BibTeXLanguageInterface.KEY_AUTHOR1ADDRESS),
    AUTHOR2ADDRESS(BibTeXLanguageInterface.KEY_AUTHOR2ADDRESS),
    AUTHOR3ADDRESS(BibTeXLanguageInterface.KEY_AUTHOR3ADDRESS),
    AUTHORURL(BibTeXLanguageInterface.KEY_AUTHORURL),
    AVAILABILITY(BibTeXLanguageInterface.KEY_AVAILABILITY),
    BASETEAM(BibTeXLanguageInterface.KEY_BASETEAM),
    BOOKPAGES(BibTeXLanguageInterface.KEY_BOOKPAGES),
    BOOKREVIEW(BibTeXLanguageInterface.KEY_BOOKREVIEW),
    COCO(BibTeXLanguageInterface.KEY_COCO),
    COMMENT(BibTeXLanguageInterface.KEY_COMMENT),
    CONFDATE(BibTeXLanguageInterface.KEY_CONFDATE),
    CONFERENCE(BibTeXLanguageInterface.KEY_CONFERENCE),
    CONFERENCEYEAR(BibTeXLanguageInterface.KEY_CONFERENCEYEAR),
    CONFLOCATION(BibTeXLanguageInterface.KEY_CONFLOCATION),
    CONFNAME(BibTeXLanguageInterface.KEY_CONFNAME),
    CONFSPONSOR(BibTeXLanguageInterface.KEY_CONFSPONSOR),
    CONFTITLE(BibTeXLanguageInterface.KEY_CONFTITLE),
    COUNTRY(BibTeXLanguageInterface.KEY_COUNTRY),
    COUNTRYPUB(BibTeXLanguageInterface.KEY_COUNTRYPUB),
    DATE(BibTeXLanguageInterface.KEY_DATE),
    DESCRIPTORS(BibTeXLanguageInterface.KEY_DESCRIPTORS),
    DEWEYNO(BibTeXLanguageInterface.KEY_DEWEYNO),
    DIMENSIONS(BibTeXLanguageInterface.KEY_DIMENSIONS),
    EAN(BibTeXLanguageInterface.KEY_EAN),
    EMAIL(BibTeXLanguageInterface.KEY_EMAIL),
    ENUM(BibTeXLanguageInterface.KEY_ENUM),
    ERICNO(BibTeXLanguageInterface.KEY_ERICNO),
    FILE(BibTeXLanguageInterface.KEY_FILE),
    GOVTDOCNUMBER(BibTeXLanguageInterface.KEY_GOVTDOCNUMBER),
    IDENTIFIERS(BibTeXLanguageInterface.KEY_IDENTIFIERS),
    ISSUE(BibTeXLanguageInterface.KEY_ISSUE),
    JOURNALABR(BibTeXLanguageInterface.KEY_JOURNALABR),
    KEYWORD(BibTeXLanguageInterface.KEY_KEYWORD),
    LANGUAGE(BibTeXLanguageInterface.KEY_LANGUAGE),
    LCCNALT(BibTeXLanguageInterface.KEY_LCCNALT),
    LIBNOTE(BibTeXLanguageInterface.KEY_LIBNOTE),
    LOCATION(BibTeXLanguageInterface.KEY_LOCATION),
    MAJORDESC(BibTeXLanguageInterface.KEY_MAJORDESC),
    MEETINGABR(BibTeXLanguageInterface.KEY_MEETINGABR),
    MEETINGADDRESS(BibTeXLanguageInterface.KEY_MEETINGADDRESS),
    MEETINGDATE(BibTeXLanguageInterface.KEY_MEETINGDATE),
    MEETINGDATE2(BibTeXLanguageInterface.KEY_MEETINGDATE2),
    MEETINGNAME(BibTeXLanguageInterface.KEY_MEETINGNAME),
    MINORDESC(BibTeXLanguageInterface.KEY_MINORDESC),
    MRCLASS(BibTeXLanguageInterface.KEY_MRCLASS),
    MRNUMBER(BibTeXLanguageInterface.KEY_MRNUMBER),
    NB(BibTeXLanguageInterface.KEY_NB),
    NUMERICALINDEX(BibTeXLanguageInterface.KEY_NUMERICALINDEX),
    OLDLABEL(BibTeXLanguageInterface.KEY_OLDLABEL),
    OLDTITLE(BibTeXLanguageInterface.KEY_OLDTITLE),
    ONLINEDATE(BibTeXLanguageInterface.KEY_ONLINEDATE),
    ORDERNUMBER(BibTeXLanguageInterface.KEY_ORDERNUMBER),
    OWNER(BibTeXLanguageInterface.KEY_OWNER),
    PAGECOUNT(BibTeXLanguageInterface.KEY_PAGECOUNT),
    PAPERBACK(BibTeXLanguageInterface.KEY_PAPERBACK),
    PMID(BibTeXLanguageInterface.KEY_PMID),
    PRICE(BibTeXLanguageInterface.KEY_PRICE),
    PUBCOUNTRY(BibTeXLanguageInterface.KEY_PUBCOUNTRY),
    PUBLISHERINFO(BibTeXLanguageInterface.KEY_PUBLISHERINFO),
    PUBLISHERSNOTE(BibTeXLanguageInterface.KEY_PUBLISHERSNOTE),
    PUBLISHERSUMMARY(BibTeXLanguageInterface.KEY_PUBLISHERSUMMARY),
    REFERENCES(BibTeXLanguageInterface.KEY_REFERENCES),
    REMARK(BibTeXLanguageInterface.KEY_REMARK),
    REVIEW(BibTeXLanguageInterface.KEY_REVIEW),
    REVISION(BibTeXLanguageInterface.KEY_REVISION),
    ROMANVOLUME(BibTeXLanguageInterface.KEY_ROMANVOLUME),
    SEARCHKEY(BibTeXLanguageInterface.KEY_SEARCHKEY),
    SOURCE(BibTeXLanguageInterface.KEY_SOURCE),
    SPONSOR(BibTeXLanguageInterface.KEY_SPONSOR),
    SPONSORORG(BibTeXLanguageInterface.KEY_SPONSORORG),
    TABLEOFCONTENTS(BibTeXLanguageInterface.KEY_TABLEOFCONTENTS),
    THESAURUS(BibTeXLanguageInterface.KEY_THESAURUS),
    URLAUTHOR(BibTeXLanguageInterface.KEY_URLAUTHOR),
    URLPUBLISHER(BibTeXLanguageInterface.KEY_URLPUBLISHER),
    WALTSREVIEW(BibTeXLanguageInterface.KEY_WALTSREVIEW),
    WWWAUTHOR(BibTeXLanguageInterface.KEY_WWWAUTHOR),
    WWWTITLE(BibTeXLanguageInterface.KEY_WWWTITLE),
    XMLDATA(BibTeXLanguageInterface.KEY_XMLDATA),
    XXADDRESS(BibTeXLanguageInterface.KEY_XXADDRESS),
    XXAUTHOR(BibTeXLanguageInterface.KEY_XXAUTHOR),
    XXAUTHOR1(BibTeXLanguageInterface.KEY_XXAUTHOR1),
    XXAUTHOR2(BibTeXLanguageInterface.KEY_XXAUTHOR2),
    XXCROSSREF(BibTeXLanguageInterface.KEY_XXCROSSREF),
    XXEDITOR(BibTeXLanguageInterface.KEY_XXEDITOR),
    XXISBN(BibTeXLanguageInterface.KEY_XXISBN),
    XXISBN13(BibTeXLanguageInterface.KEY_XXISBN13),
    XXLCCN(BibTeXLanguageInterface.KEY_XXLCCN),
    XXNOTE(BibTeXLanguageInterface.KEY_XXNOTE),
    XXNOTE2(BibTeXLanguageInterface.KEY_XXNOTE2),
    XXPAGES(BibTeXLanguageInterface.KEY_XXPAGES),
    XXPUBLISHER(BibTeXLanguageInterface.KEY_XXPUBLISHER),
    XXTITLE(BibTeXLanguageInterface.KEY_XXTITLE),
    XXTITLE1(BibTeXLanguageInterface.KEY_XXTITLE1),
    XXTITLE2(BibTeXLanguageInterface.KEY_XXTITLE2),
    XXURL(BibTeXLanguageInterface.KEY_XXURL),
    XXXNOTE(BibTeXLanguageInterface.KEY_XXXNOTE),


    
    
    ;
    
    // --------------------------------------------------------------------
    // Class variables
    // --------------------------------------------------------------------
    
    private static final Map<String, BibTeXFieldType> nameMap = new HashMap<>(values().length, 1);
    
    // --------------------------------------------------------------------
    // Variables
    // --------------------------------------------------------------------
    
    private final String name;
    
    // --------------------------------------------------------------------
    // Static
    // --------------------------------------------------------------------
    
    static {
        for (BibTeXFieldType t : values()){nameMap.put(t.get(), t);}
    }
    
    // --------------------------------------------------------------------
    // Private constructor
    // --------------------------------------------------------------------
    
    private BibTeXFieldType(String v){
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
     * Get the {@link BibTeXFieldType} dependent of name. The comparison is
     * performed for the lowercase of the given argument.
     * @param typename name
     * @return {@link BibTeXFieldType}
     */
    public static BibTeXFieldType getTypeOf (String typename) {
        BibTeXFieldType result = nameMap.get(typename.toLowerCase());
        if (result == null) {throw new IllegalArgumentException("Invalid " + BibTeXFieldType.class.getSimpleName() + " type: " + typename);}
        return result;
    }
    
}
