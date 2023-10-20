/*
 DZ2
 Необходимо написать простой консольный калькулятор на Java.
 Для считывания ввода нужно использовать класс Scanner. В конце напечатать результат.
 Используйте форматированный вывод. Пока пусть работает так, пользователь вводит целые числа,
 а на вывод передается результат 4-х операций(+, -, *, /) без выбора операции.
 В дальнейшем будете дорабатывать приложение.
*/

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Объявление переменных
        int firstNumber, secondNumber, sum, diff, product;
        double quotient;
        // Запрос данных пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        firstNumber = scanner.nextInt();
        System.out.println("Введите второе число");
        secondNumber = scanner.nextInt();
        scanner.close();
        // Операции
        sum = firstNumber + secondNumber;
        diff = firstNumber - secondNumber;
        product = firstNumber * secondNumber;
        quotient = (double) firstNumber / secondNumber;
        // Вывод результатов операций (+, -, *, /)
        System.out.printf("\tРезультат:\nСложение:\n" + firstNumber + " + " + secondNumber + " = %d", sum);
        System.out.printf("\nВычитание:\n" + firstNumber + " - " + secondNumber + " = %d", diff);
        System.out.printf("\nУмножение:\n" + firstNumber + " * " + secondNumber + " = %d", product);
        System.out.printf("\nДеление:\n" + firstNumber + " / " + secondNumber + " = %.2f", quotient);
    }
}