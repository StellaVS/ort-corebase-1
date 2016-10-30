package ua.dp.ort.module4;

public class While {
	
	public static void main(String[] args) {
		boolean hasDirtyPlates = true;
		int numberOfCleanPlates = 0;
		while (hasDirtyPlates) {
			System.out.println("Washing dirty plate");
			hasDirtyPlates = Math.random() * 10 > 3;
			numberOfCleanPlates++;
		}
		System.out.println("Number of clean plates = " 
				+ numberOfCleanPlates);
	}
}
