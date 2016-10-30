package ua.dp.ort.module4;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		final int bottomLimit = 0;
		final int topLimit = 999999;
		int ticketNumber = 0;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Введите номер билета (" + bottomLimit +
					" - " + topLimit + ")");
			ticketNumber = scanner.nextInt();
		} while (ticketNumber < bottomLimit || ticketNumber > topLimit);
		System.out.println("Номер введен корректно");
		scanner.close();
	}
}
