package org.arrays;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		int a[][] = new int [2][3];
		a[0][0]=99;
		a[0][1]=88;
		a[0][2]=77;
		a[1][0]=66;
		a[1][1]=55;
		a[1][2]=44;
		
		System.out.println(a[1][0]);
		
		//length of array
		int length = a.length;
		System.out.println(length);
		
		//for loop
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(a[i][j]);
			}
			
		//for each loop or enhanced loop
			for(int[] z: a) {
				for(int y:z) {
					System.out.println(y);
				}
			}
			
		}
	}
}
