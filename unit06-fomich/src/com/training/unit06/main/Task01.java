package com.training.unit06.main;

import java.util.Random;

public class Task01 {

	public static void main(String[] args) {

		// Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив из
		// четных чисел этой последовательности. Если таких чисел нет, то вывести
		// сообщение об этом факте.

		Random rand = new Random();

		int arrl = rand.nextInt(10);
		int[] arr = new int[arrl];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(100);
			System.out.print(arr[i] + " ");

		}
		System.out.println("");//последовательность чисел

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
			//	System.out.print(arr[i] + " "); проверка на четные числа
				count++;
			}
		}
		
			if (count == 0) {
				System.out.println("Чётных чисел не обнаружено");
			}else {
				
				/*
				 * System.out.println(""); System.out.println(count); проверка счетчика четных
				 * чисел
				 */
				 
		 
		int[] finalarr = new int[count];
		for (int i = 0, j = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				finalarr[j] = arr[i];

				System.out.print(finalarr[j] + " ");
			}
		}
			
			}

	}

}
