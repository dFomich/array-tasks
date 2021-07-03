package com.training.unit06.main;

import java.util.Scanner;

import java.util.Random;

public class Task08 {

	public static void main(String[] args) {
		// Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
		
		int n, m;
		Random rand = new Random();
		n = 5;
		m = 7;
		int[][] mas = new int[n][m];
		
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
			  
			 try (Scanner sc = new Scanner(System.in)) {
			  System.out.println("Введите нужную строку: ");
			  while (!sc.hasNextInt()) {
				  sc.next();
				  System.out.print(" >");
			  }
			  int k = sc.nextInt();
			  
		
		for (int element : mas[k-1]) {
			System.out.printf("[%4d]", element);
		}
		System.out.println();
		
		System.out.println("Введите нужный столбец: ");
		 while (!sc.hasNextInt()) {
			 sc.next();
			  System.out.print(" >");
		  }
		  int p = sc.nextInt();
		  for(int i = 0; i < mas.length; i++) {
			  System.out.printf("[%4d]\n", mas[i][p-1]);
		  }
		  
			 }

	}

}
