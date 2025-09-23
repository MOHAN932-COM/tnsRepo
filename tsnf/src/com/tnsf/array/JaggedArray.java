package com.tnsf.array;

public class JaggedArray {

	public static void main(String[] args) {
			int[][] jagged = {
					{1,2},
					{3,4,5},
					{6}
			};
			for(int i = 0; i < jagged.length; i++) {
				for(int j = 0; j < jagged[i].length; j++) {
					System.out.print(jagged[i][j] + " ");
				}
				System.out.println();
			}
	}

}
