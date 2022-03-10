package com.test;

public class LogicalOperators {

	public static void main(String[] args) {
		int a=100;
		int b=30;
		int c=50;
		int d=500;
		int e=60;
		System.out.println((a>b)&&(e>c));
		System.out.println((e>b)&&(e>a));
		System.out.println((c>e)&&(d>a));
		
		System.out.println((e>b)||(d>a));
		System.out.println((c>e)||(d>a));
		System.out.println((c>e)||(d>a));
		System.out.println((c>e)||(d<e));
	}

}
