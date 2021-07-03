package com.training.unit06.main;

import java.util.Random;

public class Task04 {

	public static void main(String[] args) {
		//Реализовать алгоритм сортировки выбором или пузырьком по убыванию
		
		Random rand = new Random();

		int arrl = rand.nextInt(50);
		int[] arr = new int[arrl];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(100);
			System.out.print(arr[i] + " ");

		}
		System.out.println("");
///
		int min, temp;
		for (int i = 0; i < arr.length - 1; i++ ) {
			min = i;
			
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
