package by.it.karpinskaya.lesson02;

import java.util.Scanner;

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
        System.out.println("Введите два числа: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        a = a + b;
        System.out.println("Sum " + "= " + a);
    }
}
