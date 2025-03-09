package edu.training.jc.hw;

public class Task07 {

	public static void main(String[] args) {
		double a = 5;
		double b = 3;
		double Sar = (Math.pow(a,3) + Math.pow(b, 3)) / 2;
		double Smod = Math.sqrt(Math.abs (a) * Math.abs(b));
		
		System.out.println("Среднее арифметическое кубов двух чисел a и b = " + Sar);
		System.out.println("Среднее геометрическое двух чисел a и b = " + Smod);
	}

}
