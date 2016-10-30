package ua.dp.ort.module4;

public class LeftToRightDigits {
	public static void main(String[] args) {
		int number = 123456;
		
		int copy = number;
		int numberOfDigits = 0;
		while (copy != 0) {
			copy /= 10;
			numberOfDigits++;
		}
		
		for (int i = 1; i <= numberOfDigits; i++) {
			int digit = number / (int) Math.pow(10, numberOfDigits - i) % 10;
			System.out.println(digit);
		}
	}
}
