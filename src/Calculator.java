/*
 DZ2: Необходимо написать простой консольный калькулятор на Java. Для считывания ввода нужно использовать класс Scanner.
 В конце напечатать результат. Используйте форматированный вывод.
 Пока пусть работает так, пользователь вводит целые числа,а на вывод передается результат 4-х операций(+, -, *, /)
 без выбора операции.В дальнейшем будете дорабатывать приложение.
 DZ3.1: Доработать калькулятор, получение от пользователя действия, которое нужно выполнить.
 Можно получить таким образом - если пользователь вводит 1, то это сложение, 2 - разность и т.д.
 Вывести результат действия. Используйте конструкции if -else, case.
*/

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Объявление переменных
        int firstNumber, secondNumber, command = 1, sum, diff, product;
        double quotient;
        // Запрос данных пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        firstNumber = scanner.nextInt();
        System.out.print("Введите второе число: ");
        secondNumber = scanner.nextInt();
        // Операции
        while (command !=0) {
            System.out.println("\nКакое действие выполнить?\n1 - Вычислить сумму\n2 - Вычислить разность\n" +
                    "3 - Вычислить произведение\n4 - Вычислить частное\n0 - Выйти из приложения");
            command = scanner.nextInt();
            switch (command) {
                case 1:
                    sum = firstNumber + secondNumber;
                    System.out.printf("Сумма: " + firstNumber + " + " + secondNumber + " = %d\n", sum);
                    break;
                case 2:
                    diff = firstNumber - secondNumber;
                    System.out.printf("Разность: " + firstNumber + " - " + secondNumber + " = %d\n", diff);
                    break;
                case 3:
                    product = firstNumber * secondNumber;
                    System.out.printf("Произведение: " + firstNumber + " * " + secondNumber + " = %d\n", product);
                    break;
                case 4:
                    quotient = (double) firstNumber / secondNumber;
                    System.out.printf("Частное: " + firstNumber + " / " + secondNumber + " = %.2f\n", quotient);
                    break;
                case 0:
                    System.out.println("Приложение закрыто");
                    break;
                default:
                    System.out.println("Несуществующая команда. Выберите из предложенных вариантов.");
            }
        }
        scanner.close();
    }
}