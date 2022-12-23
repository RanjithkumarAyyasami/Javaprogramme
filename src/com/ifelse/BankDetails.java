package com.ifelse;

public class BankDetails {

	public static void main(String[] args) {
	
	String s = " Java Application ";
	String s2 = "java Application";
	
	int length = s.length();
	int indexOf = s.indexOf('a');
	int lastIndexOf = s.lastIndexOf('a');
	
	boolean startWith = s.startsWith("jav");
	boolean contains = s.contains("Appl");
	boolean endWith = s.endsWith("ion");
	boolean empty = s.isEmpty();
	boolean equals = s.equals(s2);
	boolean equalIgnoreCase= s.equalsIgnoreCase(s2);
	
	String upperCase = s.toUpperCase();
	String lowerCase = s.toLowerCase();
	String replace = s.replace('a', 'd');
	String replaceAll = s.replaceAll("java", "python");
	String concat = s.concat(s2);
	String trim = s.trim();
	
	
	
	
	System.out.println(length);
	System.out.println(indexOf);
	System.out.println(lastIndexOf);
	System.out.println(lastIndexOf);
	System.out.println(startWith);
	System.out.println(contains);
	System.out.println(endWith);
	System.out.println(empty);
	System.out.println(equals);
	System.out.println(equalIgnoreCase);
	System.out.println(upperCase);
	System.out.println(lowerCase);
	System.out.println(replace);
	System.out.println(replaceAll);
	System.out.println(concat);
	System.out.println(trim);
	
	
	
	}
}
