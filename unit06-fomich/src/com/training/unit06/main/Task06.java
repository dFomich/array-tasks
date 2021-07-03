package com.training.unit06.main;
import java.util.Random;

public class Task06 {

	public static void main(String[] args) {
		// Дан двухмерный массив n×m элементов. Определить, сколько раз
	//	встречается число 7 среди элементов массива.
		
		int n, m;
		Random rand = new Random();
		n = 5;
		m = 6;
		int[][] mas = new int[n][m];
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas [i][j] = rand.nextInt(50);
			}
		}
		int count = 0;
		
		for (int i = 0; i < mas.length; i++) {				
						
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] == 7) { 
					count++;
				}
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println ();
			
			
		}
		System.out.println ("Число [7] встречается раз: " + count);
				

	}

}
