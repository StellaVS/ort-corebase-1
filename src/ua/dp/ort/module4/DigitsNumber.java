package ua.dp.ort.module4;

import java.util.Scanner;

public class DigitsNumber {
	
	public static void main(String[] args) {
		int numberFromUser;
		Scanner s = new Scanner(System.in);
		System.out.println("Введите число, "
				+ "которое мы разобьем на цифры");
		numberFromUser = s.nextInt();
		int copy = numberFromUser;
		int digitNumber = 0;
		while (copy != 0) {
			digitNumber++;
			int lastDigit = copy % 10;
			System.out.println(digitNumber + "-я цифра числа " 
					+ numberFromUser + " = " + lastDigit);
			copy /= 10; //copy = copy / 10
		}
		
		s.close();
	}
}