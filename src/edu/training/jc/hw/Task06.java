package edu.training.jc.hw;

public class Task06 {

    public static void main(String[] args) {
        int number = 1234;  
        int product = 1;   

        // Цикл 
        for (int i = 0; i < 4; i++) {
            int lastDigit = number % 10; // Извлекаем последнюю цифру
            product *= lastDigit;        // Умножаем произведение на цифру
            number /= 10;               // Удаляем последнюю цифру из числа
        }
        System.out.println("Произведение цифр: " + product);
    }
}