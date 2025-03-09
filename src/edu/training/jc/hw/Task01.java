package edu.training.jc.hw;

// 1. Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух катетов.

public class Task01 {

	public static void main(String[] args) {
		double a = 3;
		double b = 6;
		double c = Math.sqrt(Math.pow (a,2) + Math.pow (b,2)); // гиоптенуза для нахождения периметра треугольника
		double S = (a * b) / 2;
		double P=  a + b + c;
		
		System.out.println("Периметр прямоугольного треугольника равен " +P);
		System.out.println("Площадь прямоугольного треугольника равна " +S);
	}

}
