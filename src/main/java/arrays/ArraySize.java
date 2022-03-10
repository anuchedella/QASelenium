package arrays;

import java.util.Arrays;

public class ArraySize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,30,50,5,20,15};
		Arrays.sort(a);
		System.out.println("Array size is:" +a.length);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			
		}
		
		/*int b[] = {30,15,40,5,20,60,50};
		Arrays.sort(b);
		System.out.println("Array length is:" +b.length);
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i] +" ");
		}*/
		
		
	}

}
