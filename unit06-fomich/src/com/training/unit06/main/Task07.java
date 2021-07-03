package com.training.unit06.main;

import java.util.Random;

public class Task07 {

	public static void main(String[] args) {
		// Дана квадратная матрица. Вывести на экран элементы, стоящие на
		//диагонали.
		int n;
		Random rand = new Random();
		n = 5;

		int[][] mas = new int[n][n];
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas [i][j] = rand.nextInt(50);
			}
		}
		
		  for (int i = 0; i < mas.length; i++) {
		  
		  for (int j = 0; j < mas[i].length; j++) {
		  
		  System.out.printf("[%4d]", mas[i][j]); } System.out.println ();
		  }
		  System.out.println ();
		  
		  int i = 0;
		  int j = 0;
		  while (i < mas.length && j < mas[i].length) {
			  System.out.printf("[%4d]", mas[i][j]);
			  i++;
			  j++;
			  			  
		  }
		
	}

}
