package by.it.zambrano.lesson02;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод (это вы вводите с клавиатуры):
34 26

Вывод (это должна появится в консоли, обратите внимание на пробелы и слово Sum:
Sum = 26
*/
import java.util.Scanner;
class TaskC1 {
    public static void main(String[] args) {
        int sum = 0, firstNumber, secondNumber;
        Scanner inputNumScanner = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        firstNumber = inputNumScanner.nextInt();

        System.out.println("Enter Second Number: ");
        secondNumber = inputNumScanner.nextInt();

        sum = firstNumber + secondNumber;

        System.out.println("Sum = " + sum);
    }
}


