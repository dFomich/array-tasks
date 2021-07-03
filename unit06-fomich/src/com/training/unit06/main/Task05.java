package com.training.unit06.main;

import java.util.Arrays;
import java.util.Random;

public class Task05 {

	public static void main(String[] args) {
		// Реализовать алгоритм сортировки вставками.
		Random rand = new Random();

		int arrl = rand.nextInt(50);
		int[] arr = new int[arrl];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(100);
			

		}
		
		System.out.println(Arrays.toString(arr));
		
		for (int i = 0; i < arr.length; i++) {
			int current = arr[i];
			int j = i - 1;
			for (; j >= 0; j--) {
				if (current < arr[j]) {
				arr[j + 1] = arr [j];
				} else {
					break;
				}
			}
			arr [j + 1] = current;
			
		}
		System.out.println(Arrays.toString(arr));
	}

}
