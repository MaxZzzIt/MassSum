package by.home.maxzzzit;

import java.util.Scanner;

public class MassSum {
	public static void main(String[]args) {
		int razm;
		System.out.print("Введите размер массива: ");
		Scanner scn = new Scanner(System.in);
		razm = scn.nextInt();
		int [] mass = new int [razm];
		allMass(mass);
		sumMass(mass);
	}
	
	private static void allMass(int [] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(1+Math.random()*8);
			System.out.print(array[i]+" ");
		}
	}
	private static void sumMass(int [] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum +=array[i];
		}
		System.out.println("\nСумма этого массива = "+sum);
	}
}
