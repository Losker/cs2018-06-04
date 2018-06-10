package by.it.kolos.lesson03;

import java.util.Scanner;

/*
    Сумма цифр четырехзначного числа

    Реализуйте метод sumDigitsInNumber(int number).
    Метод на вход принимает целое четырехзначное число.
    Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.

    Пример:
    Метод sumDigitsInNumber вызывается с параметром 5467.

    Пример вывода:
    22

    Требования:
    1. В методе sumDigitsInNumber не могут быть использованы никакие дополнительные классы.
    2. Метод sumDigitsInNumber(int) должен быть не приватным и статическим.
    3. Метод sumDigitsInNumber должен возвращать значение типа int.
    4. Метод sumDigitsInNumber не должен ничего выводить на экран.
    5. Метод sumDigitsInNumber должен правильно возвращать сумму всех цифр в числе number.
*/
public class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(sumDigitsInNumber(a));
    }

    public static int sumDigitsInNumber(int number) {
        int a4 = number / 1000;
        int a4mod = number % 1000;
        int a3 = a4mod / 100;
        int a3mod = a4mod % 100;
        int a2 = a3mod / 10;
        int a2mod = a3mod % 10;
        int a1 = a2mod / 1;
        int sum = a4 + a3 + a2 + a1;
        return sum;
    }

//    public static void main(String[] args) {
//        System.out.println(sumDigitsInNumber(5467));
//    }

}
