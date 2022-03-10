package com.overriding;

public class States1 implements India {

		public static void main(String[] args) {
			States1 state = new States1();
			state.delhi();
			India in = new States1();
			in.goa();
			in.delhi();
			
		}
		public void ap()
		{
			System.out.println("I am from AP");
		}
		public void tg()
		{
			System.out.println("I am from TG");
		}
		public void goa() {
			// TODO Auto-generated method stub
			
		}
		public void delhi() {
			// TODO Auto-generated method stub
			
		}
	}


