package com.training.unit06.main;

import java.util.Random;

public class Task02 {

	public static void main(String[] args) {
		
		// Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину числовой оси, содержащую все эти числа.
		
		Random rand = new Random();

		int arrl = rand.nextInt(25);
		int[] arr = new int[arrl];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(50);
			System.out.print(arr[i] + " ");

		}
		System.out.println(""); //последовательность чисел 
		
		int min, temp;
		for (int i = 0; i < arr.length - 1; i++) {
			min = i;
			
			for (int j = i + 1; j < arr.length; j++ ) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " "); //отсортированный массив
		}
		
		System.out.println("");
		int l = arr.length - 1;
		System.out.println("Миниальная длина числовой оси равна: " + (arr[l] - arr[0]));
		
	}

}
