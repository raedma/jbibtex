/*
 * Copyright (c) 2012 University of Tartu
 */
package org.jbibtex;

import java.util.Collections;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.LinkedHashMap;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BibTeXEntry extends BibTeXObject {

	private BibTeXEntryType type = null;

	private Key key = null;

        private final LinkedHashMap<BibTeXFieldType,Value> fields = new LinkedHashMap<>();


	BibTeXEntry(){
	}
        
	public BibTeXEntry(BibTeXEntryType type, Key key){
		setType(type);
		setKey(key);
	}

	@JsonIgnore
	public BibTeXEntry getCrossReference(){
                Value value = this.fields.get(BibTeXFieldType.CROSSREF);

		CrossReferenceValue crossRefValue = (CrossReferenceValue)value;
		if(crossRefValue != null){
			return crossRefValue.getEntry();
		}

		return null;
	}
        
        public boolean hasField(
                BibTeXFieldType key
        ){
            return fields.containsKey(key);
        }

	public Value getField(
                BibTeXFieldType key
        ){
		Value value = this.fields.get(key);

		if(value == null){
			BibTeXEntry entry = getCrossReference();

			if(entry != null){
				return entry.getField(key);
			}
		}

		return value;
	}

	public void addField(
                BibTeXFieldType key
               ,Value value
        ){
		this.fields.put(key, value);
	}

        public void addAllFields(Map<BibTeXFieldType, Value> fields){
		this.fields.putAll(fields);
	}

	public void removeField(
                BibTeXFieldType key
        ){
		this.fields.remove(key);
	}
        
        public boolean hasFields(){return fields != null && !fields.isEmpty();}
        
	public BibTeXEntryType getType(){return this.type;}

	private void setType(BibTeXEntryType type){this.type = type;}
        

	public Key getKey(){
		return this.key;
	}

	public void setKey(Key key){
		this.key = key;
	}

	public Map<BibTeXFieldType, Value> getFields(){
		return Collections.unmodifiableMap(this.fields);
	}
}