package ua.dp.ort.module3;

import java.util.Scanner;

public class Elseif {
	
	public static void main(String[] args) {
		//������������� ����������
		double firstOperand, secondOperand;
		Scanner scanner = new Scanner(System.in);
		//���� ������
		System.out.println("������� ������ �������");
		firstOperand = scanner.nextDouble();
		System.out.println("������� ������ �������");
		secondOperand = scanner.nextDouble();
		System.out.println("������� �������:\n1. ��������\n"
				+ "2. ���������\n3. ���������\n4. �������");
		int operation = scanner.nextInt();
		//���������� ����������
		double result;
		if (operation == 1) {
			result = firstOperand + secondOperand;
		} else if (operation == 2) {
			result = firstOperand - secondOperand;
		} else if (operation == 3) {
			result = firstOperand * secondOperand;
		} else if (operation == 4) {
			result = firstOperand / secondOperand;
		} else {
			System.out.println("�� ����� �������� ��������");
			return; //������ ��������!!! ������� �� ������.
				    //���� ������ return ������� ������
		}
		System.out.println("��������� = " + result);
		scanner.close();
	}
}
