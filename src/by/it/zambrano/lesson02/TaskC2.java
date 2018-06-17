package by.it.zambrano.lesson02;


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
            int firstNumber, secondNumber;
            int sum;
            String sum2;
            String sum3;
            String sum4;
            Scanner inputNumScanner = new Scanner(System.in);
            System.out.println("Enter First Number: ");
            firstNumber = inputNumScanner.nextInt();

            System.out.println("Enter Second Number: ");
            secondNumber = inputNumScanner.nextInt();
            sum=firstNumber+secondNumber;
            sum2=Integer.toString(sum,2);
            sum3=Integer.toString(sum,16);
            sum4=Integer.toString(sum,8);
            System.out.println("DEC:"+firstNumber+"+"+secondNumber+"="+sum);
            System.out.println("BIN:"+Integer.toString(firstNumber,2)+"+"+Integer.toString(secondNumber,2)+"="+sum2);
            System.out.println("HEX:"+Integer.toString(firstNumber,16)+"+"+Integer.toString(secondNumber,16)+"="+sum3);
            System.out.println("OCT:"+Integer.toString(firstNumber,8)+"+"+Integer.toString(secondNumber,8)+"="+sum4);

        }
}







