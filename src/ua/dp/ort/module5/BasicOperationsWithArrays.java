package ua.dp.ort.module5;

import java.util.Arrays;

public class BasicOperationsWithArrays {

	public static void main(String[] args) {
		double[] digits = { 1.5, 2.0, 3, 4, 5 };//так тоже можно
		System.out.println(digits.length);//размер массива
		System.out.println(Arrays.toString(digits));//еще один способ вывода


		//так не копируем!!!
//		double[] numbers = digits;
//		System.out.println(Arrays.toString(numbers));
//		numbers[0] = 99;
		//в digits отразились изменения из предыдущей строки
//		System.out.println(Arrays.toString(digits));
		
		double[] copyOfDigits = new double[digits.length];
		//первый способ копирования
		for (int i = 0; i < digits.length; ++i) {
			copyOfDigits[i] = digits[i];
		}
		//второй способ копирования
//		System.arraycopy(digits, 0, copyOfDigits, 0, digits.length);
		//показываем, что изменение одного массива не повлияло на второй
		copyOfDigits[0] = 85;
		System.out.print("Digits = ");
		System.out.println(Arrays.toString(digits));
		System.out.print("Copy   = ");
		System.out.println(Arrays.toString(copyOfDigits));
		
		
	}
}