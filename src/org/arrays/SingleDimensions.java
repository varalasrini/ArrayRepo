package org.arrays;

public class SingleDimensions {
	public static void main(String[] args) {
		int a[] = new int [6];
		a[0]=11;
		a[1]=22;
		a[2]=33;
		a[3]=44;
		a[4]=55;
		a[5]=66;
		System.out.println("this is my first git");
		
		System.out.println(a[4]);
		
		//length of array
		int length = a.length;
		System.out.println(length);
		
		//using for loop
		for(int i=0; i<6;i++) {
		System.out.println(a[i]);
		}
		
		//using for each loop
		for (int i : a) {
			System.out.println(i);
			
		}
		
	}
}
