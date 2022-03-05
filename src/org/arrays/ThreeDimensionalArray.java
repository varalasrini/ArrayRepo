package org.arrays;

public class ThreeDimensionalArray {
	public static void main(String[] args) {
		int a[][][] = new int [2][3][4];
		a[0][0][0]=10;
		a[0][0][1]=20;
		a[0][0][2]=30;
		a[0][0][3]=40;
		a[0][1][0]=50;
		a[0][1][1]=60;
		a[0][1][2]=70;
		a[0][1][3]=80;
		a[0][2][0]=90;
		a[0][2][1]=100;
		a[0][2][2]=110;
		a[0][2][3]=120;
		a[1][0][0]=130;
		a[1][0][1]=140;
		a[1][0][2]=150;
		a[1][0][3]=160;
		a[1][1][0]=170;
		a[1][1][1]=180;
		a[1][1][2]=190;
		a[1][1][3]=200;
		a[1][2][0]=210;
		a[1][2][1]=220;
		a[1][2][2]=230;
		a[1][2][3]=240;
		
		System.out.println(a[1][1][0]);
		System.out.println(" ");
		
		
		System.out.println("using for loop");
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 4; k++) {
					System.out.println(a[i][j][k]);
				}
			}
			
		}
		System.out.println(" ");
		System.out.println("using enhanced loop");
		for (int[][] q : a) {
			for (int[] w : q) {
				for (int i : w) {
					System.out.println(i);
					
				}
				
			}
			
		}
	}
}
