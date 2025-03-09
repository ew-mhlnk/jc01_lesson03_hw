package edu.training.jc.hw;

public class Task09 {

	public static void main(String[] args) {
		double a = 4; 
        double h = a * Math.sqrt(3) / 2;
        double S = (Math.sqrt(3) / 4) * Math.pow(a, 2);
        double R = a * (Math.sqrt(3) / 3);
        double r = R / 2;

        System.out.println("Площадь треугольника: " + S);
        System.out.println("Высота треугольника: " + h);
        System.out.println("Радиус описанной окружности: " + R);
        System.out.println("Радиус вписанной окружности: " + r);

	}

}
