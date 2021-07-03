package com.training.unit06.main;

import java.util.Random;

public class Task03 {

	public static void main(String[] args) {
		// Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
		
		Random rand = new Random();

		int arrl = rand.nextInt(100);
		int[] arr = new int[arrl];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(100);
			System.out.print(arr[i] + " ");

		}
		System.out.println("");
		
		int count1 = 0;
		int count2 = 0;
		int countzero = 0;
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				countzero++;
			}else if (arr[i] % 2 == 0) {
				count2++;
			} else if (arr[i] % 2 !=0) {
				count1++;				
			} 
		}
		System.out.println("В массиве " + count2 + " четных, " + count1 + " нечетных и " + countzero + " нулевых чисел.");
		//System.out.println (arr.length); чисел в массиве
	}

}
