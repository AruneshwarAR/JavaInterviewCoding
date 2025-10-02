package com.arun.practice;

import java.util.stream.Stream;

//public class ReverseEntireString {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//String str="i code java well ";
//String[] s1 = str.split(" ");
//for(String s:s1) {
//	s=s.trim();
//	StringBuilder sb = new StringBuilder(s);
//	s = sb.reverse().toString();
//}
//str ="";
//for(int i=s1.length-1;i>=0;i--)
//{
//	str +=(s1[i]+" ");
//}
//System.out.println(str);
//
//
//	}
//
//}

public class ReverseEntireString {
    public static void main(String[] args) {
        String str = "i code java well";
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            String reversedWord = new StringBuilder(words[i].trim()).toString();
            result.append(reversedWord).append(" ");
        }

        // Remove the last space
        System.out.println(result.toString().trim());
    }
}
