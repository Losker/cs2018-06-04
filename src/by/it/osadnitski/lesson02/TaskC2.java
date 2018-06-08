package by.it.osadnitski.lesson02;

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


import java.util.Scanner;

class TaskC2 {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number 1: ");
            int n1 = sc.nextInt();
            System.out.println("Enter Number 2: ");
            int n2 = sc.nextInt();

            int sum = n1 + n2;

            String binary1 = Integer.toBinaryString(n1);
            String binary2 = Integer.toBinaryString(n2);
            String bsum = Integer.toBinaryString(sum);

            String hex1 = Integer.toHexString(n1);
            String hex2 = Integer.toHexString(n2);
            String hexsum = Integer.toHexString(sum);

            String oct1 = Integer.toOctalString(n1);
            String oct2 = Integer.toOctalString(n2);
            String octsum = Integer.toOctalString(sum);

            System.out.println("DEC:" + n1 + "+" + n2 + "=" + sum);
            System.out.println("BIN:" + binary1 + "+" + binary2 + "=" +bsum);
            System.out.println("HEX:" + hex1 + "+" + hex2 + "=" +hexsum);
            System.out.println("OCT:" + oct1 + "+" + oct2 + "=" +octsum);
        }
    }
