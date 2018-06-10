package by.it.zambrano.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Вот пример ввода с клавиатуры:
34 26

Тогда вывод ожидается такой (обратите внимание на регистр букв):
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OCT:42+32=74
*/

class TaskC2 {
    public static void main(String[] args) {
        int sum = 0,firstNumber, secondNumber ;

        Scanner inputNumScanner = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        firstNumber = inputNumScanner.nextInt();

        System.out.println("Enter Second Number: ");
        secondNumber = inputNumScanner.nextInt();

        sum = firstNumber + secondNumber;
        BIN= Integer.toBinaryString(firstNumber)+Integer.toBinaryString(secondNumber);
        HEX= Integer.toHexString(firstNumber)+Integer.toHexString(secondNumber);
        OCT= Integer.toOctalString(firstNumber)+Integer.toOctalString(secondNumber);
        System.out.println(sum);
        System.out.println(BIN);
        System.out.println(HEX);
        System.out.println(OCT);

    }
}


