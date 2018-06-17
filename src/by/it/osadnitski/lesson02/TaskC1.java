package by.it.osadnitski.lesson02;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод (это вы вводите с клавиатуры):
34 26

Вывод (это должна появится в консоли, обратите внимание на пробелы и слово Sum:
Sum = 26
*/
import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter Number 2: ");
        int n2 = sc.nextInt();
        int sum=n1+n2;
        System.out.println("Sum"+" "+"="+" "+sum);
    }
}
