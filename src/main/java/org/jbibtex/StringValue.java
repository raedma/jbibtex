/*
 * Copyright (c) 2012 University of Tartu
 */
package org.jbibtex;

public class StringValue extends LiteralValue {

	private Style style = null;


	StringValue(){
	}

	public StringValue(String string, Style style){
		super(string);

		setStyle(style);
	}

	@Override
	public String format(){
		Style style = getStyle();

		return style.getBegin() + getString() + style.getEnd();
	}

	public Style getStyle(){
		return this.style;
	}

	private void setStyle(Style style){
		this.style = style;
	}

	static
	public enum Style {
		BRACED(BibTeXLanguageInterface.SYMBOL_BRACKET_OPEN, BibTeXLanguageInterface.SYMBOL_BRACKET_CLOSE),
		QUOTED(BibTeXLanguageInterface.SYMBOL_QUOTATION_OPEN, BibTeXLanguageInterface.SYMBOL_QUOTATION_CLOSE),
		;

		private String begin = null;

		private String end = null;


		Style(String begin, String end){
			setBegin(begin);
			setEnd(end);
		}

		public String getBegin(){
			return this.begin;
		}

		private void setBegin(String begin){
			this.begin = begin;
		}

		public String getEnd(){
			return this.end;
		}

		private void setEnd(String end){
			this.end = end;
		}
	}
}