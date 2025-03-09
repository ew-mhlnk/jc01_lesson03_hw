package edu.training.jc.hw;
// 8. Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объем этого куба.

public class Task08 {

	public static void main(String[] args) {
		double a = 9;
		double Sgran = Math.pow(a, 2);
		double Spov = 6 * (Math.pow(a,2));
		double V = Math.pow(a, 3);
		
		System.out.println("Площадь грани куба = " + Sgran);
		System.out.println("Площадь полной поверхности куба = " + Spov);
		System.out.println("Объем куба = " + V);

	}

}
