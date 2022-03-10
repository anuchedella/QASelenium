package com.overriding;

public class Animals extends Zoo{

	public static void main(String[] args) {
		Animals an = new Animals();
		an.elephant();
		an.lion();
		an.tiger();
		
	}
	public void deer()
	{
		System.out.println("DEER");
	}
	public void elephant()
	{
		System.out.println("ELEPHANT");
	}
	public void monkey()
	{
		System.out.println("MONKEY");
	}
	public void lion()
	{
		System.out.println("LION");
	}
}

