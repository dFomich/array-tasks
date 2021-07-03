package com.training.unit06.main;

public class Task09 {

	public static void main(String[] args) {
		// Сформировать квадратную матрицу порядка n по заданному образцу(n -
		//четное)
		
		int n = 8;
		int[][] mas = new int[n][n];
		
		for (int i = mas.length-1; i >=0; i--) {
			mas [i][i] = i+1;
		}
		
		for (int i = 0; i < mas.length; i++) {
			for( int j = mas.length-1; j >= 0; j--) {
				System.out.printf("%3d", mas[i][j]);
			}
			 System.out.println(); 
		}
		System.out.println();

	}

}
