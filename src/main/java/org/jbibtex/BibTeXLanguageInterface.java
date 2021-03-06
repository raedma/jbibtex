
package org.jbibtex;

/**
 *
 * @author Martin Raedel {@literal <martin.raedel@dlr.de>}
 */
public interface BibTeXLanguageInterface {
    
    public static final String TYPE_ARTICLE = "article";
    public static final String TYPE_BOOK = "book";
    public static final String TYPE_BOOKLET = "booklet";
    public static final String TYPE_CONFERENCE = "conference";
    public static final String TYPE_INBOOK = "inbook";
    public static final String TYPE_INCOLLECTION = "incollection";
    public static final String TYPE_INPROCEEDINGS = "inproceedings";
    public static final String TYPE_MANUAL = "manual";
    public static final String TYPE_MASTERSTHESIS = "mastersthesis";
    public static final String TYPE_MISC = "misc";
    public static final String TYPE_PERIODICAL = "periodical";
    public static final String TYPE_PHDTHESIS = "phdthesis";
    public static final String TYPE_PROCEEDINGS = "proceedings";
    public static final String TYPE_TECHREPORT = "techreport";
    public static final String TYPE_UNPUBLISHED = "unpublished";

    public static final String KEY_ABSTRACT = "abstract";
    public static final String KEY_ACKNOWLEDGEMENT = "acknowledgement";
    public static final String KEY_ADDRESS = "address";
    public static final String KEY_AFFILIATION = "affiliation";
    public static final String KEY_ANNOTE = "annote";
    public static final String KEY_ARCHIVEPREFIX = "archiveprefix";
    public static final String KEY_AUTHOR = "author";
    public static final String KEY_BIBDATE = "bibdate";
    public static final String KEY_BIBSOURCE = "bibsource";
    public static final String KEY_BIBURL = "biburl";
    public static final String KEY_BOOKTITLE = "booktitle";
    public static final String KEY_CHAPTER = "chapter";
    public static final String KEY_CLASSCODES = "classcodes";
    public static final String KEY_CLASSIFICATION = "classification";
    public static final String KEY_CODEN = "coden";
    public static final String KEY_CORPSOURCE = "corpsource";
    public static final String KEY_CROSSREF = "crossref";
    public static final String KEY_DAY = "day";
    public static final String KEY_DOCUMENT_TYPE = "document_type";
    public static final String KEY_DOI = "doi";
    public static final String KEY_EDITION = "edition";
    public static final String KEY_EDITOR = "editor";
    public static final String KEY_EPRINT = "eprint";
    public static final String KEY_FJOURNAL = "fjournal";
    public static final String KEY_GENERALTERMS = "generalterms";
    public static final String KEY_HOWPUBLISHED = "howpublished";
    public static final String KEY_INSTITUTION = "institution";
    public static final String KEY_ISBN = "isbn";
    public static final String KEY_ISBN13 = "isbn-13";
    public static final String KEY_ISSN = "issn";
    public static final String KEY_ISSNL = "issn-l";
    public static final String KEY_JOURNAL = "journal";
    public static final String KEY_KEY = "key";
    public static final String KEY_KEYWORDS = "keywords";
    public static final String KEY_LCCN = "lccn";
    public static final String KEY_MONTH = "month";
    public static final String KEY_NOTE = "note";
    public static final String KEY_NUMBER = "number";
    public static final String KEY_NUMPAGES = "numpages";
    public static final String KEY_ORGANIZATION = "organization";
    public static final String KEY_PAGES = "pages";
    public static final String KEY_PUBLISHER = "publisher";
    public static final String KEY_SCHOOL = "school";
    public static final String KEY_SERIES = "series";
    public static final String KEY_SUBJECT = "subject";
    public static final String KEY_TIMESTAMP = "timestamp";
    public static final String KEY_TITLE = "title";
    public static final String KEY_TOPIC = "topic";
    public static final String KEY_TREATMENT = "treatment";
    public static final String KEY_TYPE = "type";
    public static final String KEY_URL = "url";
    public static final String KEY_VOLUME = "volume";
    public static final String KEY_YEAR = "year";
    
    public static final String KEY_UNKNOWN = "unknown";
    
    public static final String KEY_ABSTRACT2 = "abstract2";
    public static final String KEY_ACCEPTED = "accepted";
    public static final String KEY_ADDEDAT = "added-at";
    public static final String KEY_ADDEDBY = "added-by";
    public static final String KEY_ADVISER = "adviser";
    public static final String KEY_AFFILIATIONADDRESS = "affiliationaddress";
    public static final String KEY_ALTBOOKTITLE = "altbooktitle";
    public static final String KEY_ALTTITLE = "alttitle";
    public static final String KEY_ARTICLENO = "articleno";
    public static final String KEY_ARXIVID = "arxivid";
    public static final String KEY_AUTHOR1ADDRESS = "author-1-address";
    public static final String KEY_AUTHOR2ADDRESS = "author-2-address";
    public static final String KEY_AUTHOR3ADDRESS = "author-3-address";
    public static final String KEY_AUTHORURL = "authorurl";
    public static final String KEY_AVAILABILITY = "availability";
    public static final String KEY_BASETEAM = "baseteam";
    public static final String KEY_BOOKPAGES = "bookpages";
    public static final String KEY_BOOKREVIEW = "bookreview";
    public static final String KEY_COCO = "coco";
    public static final String KEY_COMMENT = "comment";
    public static final String KEY_CONFDATE = "confdate";
    public static final String KEY_CONFERENCE = "conference";
    public static final String KEY_CONFERENCEYEAR = "conferenceyear";
    public static final String KEY_CONFLOCATION = "conflocation";
    public static final String KEY_CONFNAME = "confname";
    public static final String KEY_CONFSPONSOR = "confsponsor";
    public static final String KEY_CONFTITLE = "conftitle";
    public static final String KEY_COUNTRY = "country";
    public static final String KEY_COUNTRYPUB = "countrypub";
    public static final String KEY_DATE = "date";
    public static final String KEY_DESCRIPTORS = "descriptors";
    public static final String KEY_DEWEYNO = "deweyno";
    public static final String KEY_DIMENSIONS = "dimensions";
    public static final String KEY_EAN = "ean";
    public static final String KEY_EMAIL = "email";
    public static final String KEY_ENUM = "enum";
    public static final String KEY_ERICNO = "ericno";
    public static final String KEY_FILE = "file";
    public static final String KEY_GOVTDOCNUMBER = "govtdocnumber";
    public static final String KEY_IDENTIFIERS = "identifiers";
    public static final String KEY_ISSUE = "issue";
    public static final String KEY_JOURNALABR = "journalabr";
    public static final String KEY_KEYWORD = "keyword";
    public static final String KEY_LANGUAGE = "language";
    public static final String KEY_LCCNALT = "lccnalt";
    public static final String KEY_LIBNOTE = "libnote";
    public static final String KEY_LOCATION = "location";
    public static final String KEY_MAJORDESC = "majordesc";
    public static final String KEY_MEETINGABR = "meetingabr";
    public static final String KEY_MEETINGADDRESS = "meetingaddress";
    public static final String KEY_MEETINGDATE = "meetingdate";
    public static final String KEY_MEETINGDATE2 = "meetingdate2";
    public static final String KEY_MEETINGNAME = "meetingname";
    public static final String KEY_MINORDESC = "minordesc";
    public static final String KEY_MRCLASS = "mrclass";
    public static final String KEY_MRNUMBER = "mrnumber";
    public static final String KEY_NB = "nb";
    public static final String KEY_NUMERICALINDEX = "numericalindex";
    public static final String KEY_OLDLABEL = "oldlabel";
    public static final String KEY_OLDTITLE = "oldtitle";
    public static final String KEY_ONLINEDATE = "onlinedate";
    public static final String KEY_ORDERNUMBER = "ordernumber";
    public static final String KEY_OWNER = "owner";
    public static final String KEY_PAGECOUNT = "pagecount";
    public static final String KEY_PAPERBACK = "paperback";
    public static final String KEY_PMID = "pmid";
    public static final String KEY_PRICE = "price";
    public static final String KEY_PUBCOUNTRY = "pubcountry";
    public static final String KEY_PUBLISHERINFO = "publisherinfo";
    public static final String KEY_PUBLISHERSNOTE = "publishersnote";
    public static final String KEY_PUBLISHERSUMMARY = "publishersummary";
    public static final String KEY_REFERENCES = "references";
    public static final String KEY_REMARK = "remark";
    public static final String KEY_REVIEW = "review";
    public static final String KEY_REVISION = "revision";
    public static final String KEY_ROMANVOLUME = "romanvolume";
    public static final String KEY_SEARCHKEY = "searchkey";
    public static final String KEY_SOURCE = "source";
    public static final String KEY_SPONSOR = "sponsor";
    public static final String KEY_SPONSORORG = "sponsororg";
    public static final String KEY_TABLEOFCONTENTS = "tableofcontents";
    public static final String KEY_THESAURUS = "thesaurus";
    public static final String KEY_URLAUTHOR = "url-author";
    public static final String KEY_URLPUBLISHER = "url-publisher";
    public static final String KEY_WALTSREVIEW = "walts-review";
    public static final String KEY_WWWAUTHOR = "wwwauthor";
    public static final String KEY_WWWTITLE = "wwwtitle";
    public static final String KEY_XMLDATA = "xmldata";
    public static final String KEY_XXADDRESS = "xxaddress";
    public static final String KEY_XXAUTHOR = "xxauthor";
    public static final String KEY_XXAUTHOR1 = "xxauthor-1";
    public static final String KEY_XXAUTHOR2 = "xxauthor-2";
    public static final String KEY_XXCROSSREF = "xxcrossref";
    public static final String KEY_XXEDITOR = "xxeditor";
    public static final String KEY_XXISBN = "xxisbn";
    public static final String KEY_XXISBN13 = "xxisbn-13";
    public static final String KEY_XXLCCN = "xxlccn";
    public static final String KEY_XXNOTE = "xxnote";
    public static final String KEY_XXNOTE2 = "xxnote2";
    public static final String KEY_XXPAGES = "xxpages";
    public static final String KEY_XXPUBLISHER = "xxpublisher";
    public static final String KEY_XXTITLE = "xxtitle";
    public static final String KEY_XXTITLE1 = "xxtitle-1";
    public static final String KEY_XXTITLE2 = "xxtitle-2";
    public static final String KEY_XXURL = "xxurl";
    public static final String KEY_XXXNOTE = "xxxnote";
    
    public static final String ENTRYTYPE_COMMENT = "comment";
    public static final String ENTRYTYPE_INCLUDE = "include";
    public static final String ENTRYTYPE_PREAMBLE = "preamble";
    public static final String ENTRYTYPE_STRING = "string";
    
    public static final String SEP_AND = "and";
    
    public static final String SYMBOL_ENTRY = "@";
    public static final String SYMBOL_NAMETOKENDELIMITER = ",";
    public static final String SYMBOL_BRACKET_OPEN = "{";
    public static final String SYMBOL_BRACKET_CLOSE = "}";
    public static final String SYMBOL_QUOTATION_OPEN = "\"";
    public static final String SYMBOL_QUOTATION_CLOSE = "\"";

}
