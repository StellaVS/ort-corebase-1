package ua.dp.ort.module4;

public class Figure {
	public static void main(String[] args) {
		final int HORIZONTAL = 1;
		final int VERTICAL = 2;
		final int UP_TO_DOWN = 3;
		final int DOWN_TO_UP = 4;
		final int DOWN_TO_UP_TRIANGLE = 5;
		final int RECTANGLE = 6;
		final char s = '*';
		final char empty = '-';

		int length = 50;
		int direction = RECTANGLE;

		if (direction == HORIZONTAL) {
			for (int i = 0; i < length; ++i) {
				System.out.print(s);
			}
		} else if (direction == VERTICAL) {
			for (int i = 0; i < length; ++i) {
				System.out.println(s);
			}
		} else if (direction == UP_TO_DOWN) {
			for (int i = 0; i < length; ++i) {
				for (int j = 0; j < i; ++j) {
					System.out.print(empty);
				}
				System.out.println(s);
			}
		} else if (direction == DOWN_TO_UP) {
			for (int i = length - 1; i >= 0; --i) {
				for (int j = 0; j < i; ++j) {
					System.out.print(empty);
				}
				System.out.println(s);
			}
		} else if (direction == DOWN_TO_UP_TRIANGLE) {
			for (int i = 0; i < length; ++i) {
				System.out.print(s);
			}
			System.out.println();
			for (int i = length - 2; i >= 0; --i) {
				for (int j = 0; j < i; ++j) {
					if (j == 0) {
						System.out.print(s);
					} else {
						System.out.print(empty);
					}
				}
				System.out.println(s);
			}
		} else if (direction == RECTANGLE) {
			// верхняя строка **********
			for (int i = 0; i < length; ++i) {
				System.out.print(s);
			}
			System.out.println();
			// середина
			for (int i = length - 2; i > 0; --i) {
				// левая сторона + пустое пространство слева от диагонали
				for (int j = 0; j < i; ++j) {
					if (j == 0) {
						System.out.print(s);
					} else {
						System.out.print(empty);
					}
				}
				// диагональ
				System.out.print(s);
				// пустое пространство справа от диагонали
				for (int j = 0; j < length - 2 - i; j++) {
					System.out.print(empty);
				}
				// правая сторона
				System.out.print(s + "\n");
			}
			// нижняя сторона
			for (int i = 0; i < length; ++i) {
				System.out.print(s);
			}
		}
	}
}
