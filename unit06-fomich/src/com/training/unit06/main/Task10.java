package com.training.unit06.main;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		//Сформировать квадратную матрицу порядка n по заданному образцу
		int n = enterNum();
		int[][] matr = new int[n][n];
		form(matr);
		print(matr);

	}

	public static int enterNum() {
		int num;
		while (true) {
			System.out.print("Введите число n: ");
			
			try (Scanner sc = new Scanner(System.in)) {
			if (sc.hasNextInt()) {
				num = sc.nextInt();
				if(num > 1){
					if(num % 2 == 0)
						break;
					else System.out.print("Введите чётное число!  ");
				}else{
					System.out.print("Число отрицательное или меньше 2, повторите ввод!  ");
				}
			}else{
				System.out.print("Некорректное значение, повторите!  ");
			}
		}
			}
		return num;
	}
	
	public static void form(int[][] mat){
		int n = mat.length;
		for(int i = 0; i < mat.length; i++){
			for(int j = 0; j < mat[i].length; j++){
				if(i == 0 || j == 0 || i == n -1 || j == n - 1)
					mat[i][j] = 1;
				else
					mat[i][j] = 0;
			}
		}
	}
	
	public static void print(int[][] mat){
		for(int i = 0; i < mat.length; i++){
			for(int j = 0; j < mat[i].length; j++){
				System.out.printf("%3d", mat[i][j]);
			}
			System.out.println();
		}
		
	}

}
