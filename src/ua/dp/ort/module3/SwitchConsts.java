package ua.dp.ort.module3;

import java.util.Scanner;

public class SwitchConsts {
	
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
			System.out.println("�� ����� �������� ��������");
			return; //������ ��������!!! ������� �� ������.
				    //���� ������ return ������� ������
		}
		System.out.println("��������� = " + result);
		scanner.close();
	}
}
