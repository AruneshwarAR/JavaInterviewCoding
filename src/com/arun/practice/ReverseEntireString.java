package com.arun.practice;

import java.util.stream.Stream;

public class ReverseEntireString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="i code java well ";
String[] s1 = str.split(" ");
for(String s:s1) {
	s=s.trim();
	StringBuilder sb = new StringBuilder(s);
	s = sb.reverse().toString();
}
str ="";
for(int i=s1.length-1;i>=0;i--)
{
	str +=(s1[i]+" ");
}
System.out.println(str);


	}

}
