package com.arun.practice;

public class TransverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,4,7,5,8,9,3,5,6};
		for(int i=0;i<a.length-1;i+=2) {
			int temp = a[i];
			a[i] = a[i+1];
			a[i+1] = temp;
			
		}
		System.out.println(a);
		for(int i:a)
		{
			System.out.println(i);
		}

	}

}
