package edu.training.jc.hw;

public class Task05 {

    public static void main(String[] args) {
        
        for (int i = 1; i <= 4; i++) {
            double piPower = Math.pow(Math.PI, i);
            System.out.printf("%d-я степень числа π: %.4f%n", i, piPower);
        }
    } 
}