package by.it.rusakewicz.lesson02;

import java.util.Scanner;

import static java.lang.Integer.toBinaryString;
import static java.lang.Integer.toHexString;
import static java.lang.Integer.toOctalString;

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
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc1.nextInt();
        int h = i+j;
        String a = toBinaryString(i);
        String b = toBinaryString(j);
        String c = toBinaryString(h);
        String d = toHexString(i);
        String e = toHexString(j);
        String f = toHexString(h);
        String g = toOctalString(i);
        String k = toOctalString(j);
        String l = toOctalString(h);
        System.out.println("DEC:" + i + "+" + j + "=" + h);
        System.out.println("BIN:" + a + "+" + b + "=" + c);
        System.out.println("HEX:" + d + "+" + e + "=" + f);
        System.out.println("OCT:" + g + "+" + k + "=" + l);
    }
}
