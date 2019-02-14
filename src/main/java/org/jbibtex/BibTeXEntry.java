/*
 * Copyright (c) 2012 University of Tartu
 */
package org.jbibtex;

import java.util.Collections;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class BibTeXEntry extends BibTeXObject {

	private BibTeXEntryType type = null;

	private Key key = null;

	private KeyMap<Value> fields = new KeyMap<>();


	BibTeXEntry(){
	}
        
	public BibTeXEntry(BibTeXEntryType type, Key key){
		setType(type);
		setKey(key);
	}

	@JsonIgnore
	public BibTeXEntry getCrossReference(){
		Value value = this.fields.get(KEY_CROSSREF);

		CrossReferenceValue crossRefValue = (CrossReferenceValue)value;
		if(crossRefValue != null){
			return crossRefValue.getEntry();
		}

		return null;
	}

	public Value getField(Key key){
		Value value = this.fields.get(key);

		if(value == null){
			BibTeXEntry entry = getCrossReference();

			if(entry != null){
				return entry.getField(key);
			}
		}

		return value;
	}

	public void addField(Key key, Value value){
		this.fields.put(key, value);
	}

	public void addAllFields(Map<Key, Value> fields){
		this.fields.putAll(fields);
	}

	public void removeField(Key key){
		this.fields.remove(key);
	}
        
	public BibTeXEntryType getType(){return this.type;}

	private void setType(BibTeXEntryType type){this.type = type;}
        

	public Key getKey(){
		return this.key;
	}

	private void setKey(Key key){
		this.key = key;
	}

	public Map<Key, Value> getFields(){
		return Collections.unmodifiableMap(this.fields);
	}
        
	public static final Key KEY_ADDRESS = new Key(BibTeXLanguageInterface.KEY_ADDRESS);
	public static final Key KEY_ANNOTE = new Key(BibTeXLanguageInterface.KEY_ANNOTE);
	public static final Key KEY_AUTHOR = new Key(BibTeXLanguageInterface.KEY_AUTHOR);
	public static final Key KEY_BOOKTITLE = new Key(BibTeXLanguageInterface.KEY_BOOKTITLE);
	public static final Key KEY_CHAPTER = new Key(BibTeXLanguageInterface.KEY_CHAPTER);
	public static final Key KEY_CROSSREF = new Key(BibTeXLanguageInterface.KEY_CROSSREF);
	public static final Key KEY_DOI = new Key(BibTeXLanguageInterface.KEY_DOI);
	public static final Key KEY_EDITION = new Key(BibTeXLanguageInterface.KEY_EDITION);
	public static final Key KEY_EDITOR = new Key(BibTeXLanguageInterface.KEY_EDITOR);
	public static final Key KEY_EPRINT = new Key(BibTeXLanguageInterface.KEY_EPRINT);
	public static final Key KEY_HOWPUBLISHED = new Key(BibTeXLanguageInterface.KEY_HOWPUBLISHED);
	public static final Key KEY_INSTITUTION = new Key(BibTeXLanguageInterface.KEY_INSTITUTION);
	public static final Key KEY_JOURNAL = new Key(BibTeXLanguageInterface.KEY_JOURNAL);
	public static final Key KEY_KEY = new Key(BibTeXLanguageInterface.KEY_KEY);
	public static final Key KEY_MONTH = new Key(BibTeXLanguageInterface.KEY_MONTH);
	public static final Key KEY_NOTE = new Key(BibTeXLanguageInterface.KEY_NOTE);
	public static final Key KEY_NUMBER = new Key(BibTeXLanguageInterface.KEY_NUMBER);
	public static final Key KEY_ORGANIZATION = new Key(BibTeXLanguageInterface.KEY_ORGANIZATION);
	public static final Key KEY_PAGES = new Key(BibTeXLanguageInterface.KEY_PAGES);
	public static final Key KEY_PUBLISHER = new Key(BibTeXLanguageInterface.KEY_PUBLISHER);
	public static final Key KEY_SCHOOL = new Key(BibTeXLanguageInterface.KEY_SCHOOL);
	public static final Key KEY_SERIES = new Key(BibTeXLanguageInterface.KEY_SERIES);
	public static final Key KEY_TITLE = new Key(BibTeXLanguageInterface.KEY_TITLE);
	public static final Key KEY_TYPE = new Key(BibTeXLanguageInterface.KEY_TYPE);
	public static final Key KEY_URL = new Key(BibTeXLanguageInterface.KEY_URL);
	public static final Key KEY_VOLUME = new Key(BibTeXLanguageInterface.KEY_VOLUME);
	public static final Key KEY_YEAR = new Key(BibTeXLanguageInterface.KEY_YEAR);
}