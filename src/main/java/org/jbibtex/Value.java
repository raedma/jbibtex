/*
 * Copyright (c) 2012 University of Tartu
 */
package org.jbibtex;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo (
	use = JsonTypeInfo.Id.CLASS
)
abstract
public class Value implements Serializable {

	Value(){
	}

	abstract
	public String format();

	/**
	 * Returns a string representation of the object which is suitable for displaying to end users.
	 * The result may contain LaTeX language markup.
	 *
         * @return string representation of the object which is suitable for displaying to end users
	 * @see LaTeXParser
	 * @see LaTeXPrinter
	 */
	abstract
	public String toUserString();
}