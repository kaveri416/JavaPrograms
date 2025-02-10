package com.string.example;

public class StringMethod {

	public static void main(String[] args) {

		/*String str ="kaveri";
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
		System.out.println(str.subSequence(2, 5));*/
		
		StringBuffer str=new StringBuffer("john");
		str.append("johnny");
		/*System.out.println( str);
		StringBuilder str1=new StringBuilder("koli");
		System.out.println(str1.charAt(0));	
		StringBuilder s2=str1.delete(0, 2);	
		System.out.println(s2);
		StringBuilder s3=str1.replace(0, 1, "hi");
		System.out.println(s3);
		StringBuilder str4=new StringBuilder("kaveri");
		String st=str4.toString();
		System.out.println(st);
		StringBuffer st2=new StringBuffer("john");
		String st3=st2.toString();
		System.out.println(st3);*/
		StringBuffer st2=str.insert(1,"hi");
		System.out.println(st2);
		System.out.println(str.hashCode());
		
	}

}
