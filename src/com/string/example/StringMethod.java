package com.string.example;

public class StringMethod {

	public static void main(String[] args) {

		String str ="kaveri";
		String str1="koli";
		String str3="KAVERI";
		String str2=str;
		int num =10;
		System.out.println(str1.equals(str));	
		System.out.println(str2.equals(str));
		System.out.println(str.compareTo(str1));
		System.out.println(str.endsWith("i"));
		System.out.println(str.startsWith("k"));
		System.out.println(str.charAt(3));
		System.out.println(str.concat(str1));
		System.out.println(str.contentEquals(str1));
		//System.out.println(str.getBytes());
		System.out.println(str.hashCode());
		System.out.println(str.indexOf("r"));
		System.out.println(str.lastIndexOf("i"));
		System.out.println(str.length());
		System.out.println(str.replace("i", "k"));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.equalsIgnoreCase(str3));
		System.out.println(String.valueOf(num));
		//String str5=String 
		System.out.println(str.contains("ka"));
		System.out.println(str.codePointAt(1));
		String result=String.format("kaveri is %s and %d", "good",10);
		System.out.println(result);
		System.out.println(str.toCharArray());
		System.out.println(str.substring(4));
		System.out.println(str.subSequence(2, 5));
		
		
		}

}
