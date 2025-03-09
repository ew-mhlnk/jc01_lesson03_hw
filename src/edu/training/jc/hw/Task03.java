package edu.training.jc.hw;

public class Task03 {

	public static void main(String[] args) {
	 
		double x1 = 7; 
		double x2 = 12;
		double x3 = 5;
		double y2 = 3;
		double y3 = 10;
		double S;
		double P;
	
		// Вычисление длин сторон
		double AB = Math.abs(x2 - x1);
		double AC = Math.hypot(x3 - x1, y3 - y2);
		double BC = Math.hypot(x3 - x2, y3 - y2);
		
		// Вычисление периметра
		P = AB + AC + BC;
		
		
		// Вычисление площади
		double m =AB;
		double h = Math.abs(y3 - y2);
		S = 0.5 * m * h;
		
		System.out.println("Периметр равен: " + P);
		System.out.println("Площадь равна: " + S);
	}

}
