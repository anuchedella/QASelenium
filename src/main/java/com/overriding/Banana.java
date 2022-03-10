package com.overriding;

public class Banana extends AppleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banana b = new Banana();
		b.price();
		b.greenColor();
	}
	public void price()
	{
		System.out.println("price is 0.5$");
	}
	public void greenColor()
	{
		System.out.println("Good for health");
	}
	public void season()
	{
		System.out.println("Banana is available in all the seasons especially we will use for festivals in home");
	}
}

