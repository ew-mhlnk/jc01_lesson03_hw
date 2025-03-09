package edu.training.jc.hw;

public class Task02 {

	public static void main(String[] args) {
		double x1 = 1;
		double y1 = 3;
		double x2 = 2;
		double y2 = 4;
		
		double z = Math.hypot(x2 - x1, y2 - y1);
		
		System.out.println("Расстояние между точками: " + z);
	}

}
