package com.stringbufferandstringbuilder;

public class example6 {

	public static void main(String[] args) {
		


StringBuffer name1 = new StringBuffer("Welcome to chennai");

System.out.println(name1.insert(16, ", welcome to my home"));

System.out.println("==========================================");

StringBuffer name2 = new StringBuffer("Welcome home");

System.out.println(name2.insert(8, "to  my ", 0,7));

StringBuffer name3 = new StringBuffer("welcome chennai");

System.out.println(name3.insert(8, "to ", 0, 3));
	}

}
