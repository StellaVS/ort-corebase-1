package ua.dp.ort.module3;

import java.util.Scanner;

public class SwitchConsts {
	
	public static void main(String[] args) {
		//инициализация переменных
		double firstOperand, secondOperand;
		Scanner scanner = new Scanner(System.in);
		//Ввод данных
		System.out.println("Введите первый операнд");
		firstOperand = scanner.nextDouble();
		System.out.println("Введите второй операнд");
		secondOperand = scanner.nextDouble();
		System.out.println("Введите опрецию:\n1. Сложение\n"
				+ "2. Вычитание\n3. Умножение\n4. Деление");
		int operation = scanner.nextInt();
		//Вычисление результата
		double result;
		switch (operation) {
		case 1:
			result = firstOperand + secondOperand;
			break;
		case 2:
			result = firstOperand - secondOperand;
			break;
		case 3:
			result = firstOperand * secondOperand;
			break;
		case 4:
			result = firstOperand / secondOperand;
			break;
		default:
			System.out.println("Вы ввели неверную операцию");
			return; //Утечка ресурсов!!! сканнер не закрыт.
				    //Этим опасен return посреди метода
		}
		System.out.println("Результат = " + result);
		scanner.close();
	}
}
