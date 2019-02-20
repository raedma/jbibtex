/*
 * Copyright (c) 2012 University of Tartu
 */
package org.jbibtex;

public class StringUtil {

	private StringUtil(){
	}

	static
	public String addIndent(String string, String indent){
		return addIndent(string, 1, indent);
	}

	static
	public String addIndent(String string, int level, String indent){

		if(string.indexOf('\n') > -1){
			String levelIndent = indent;

			for(int i = 1; i < level; i++){
				levelIndent += indent;
			}

			string = string.replaceAll("\\n", "\n" + levelIndent);
		}

		return string;
	}

	static
	public String removeIndent(String string){

		if(string.indexOf('\n') > -1){
			string = string.replaceAll("\\n([\\ ,\\t])*", "\n");
		}

		return string;
	}
    
    /**
     * Returns the String {@code s} repeated {@code n} times.
     * 
     * @param s Input-String
     * @param n Number of repetitions
     * @return the String {@code s} repeated {@code n} times.
     */
    public static String repeat(String s, int n){
        return new String(new char[n]).replace("\0", s);
    }
    
    /**
     * Replace all occurences with two or more white spaces with a single one.
     * @param line String
     * @return String without multiple adjacent spaces
     */
    public static String removeMultipleWhiteSpacesWithOne(String line){
        return line.replaceAll(" +", " ");
    }
}