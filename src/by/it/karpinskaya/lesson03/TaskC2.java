package by.it.karpinskaya.lesson03;
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
import java.util.Scanner;
public class TaskC2 {
    public static int sumDigitsInNumber(int n) {
        int a = n-(n%1000);
        int b = a/1000;
        int c = n-a;
        int d = c-c%100;
        int e = d/100;
        int f = n-a-d;
        int g = f-(f%10);
        int h = g/10;
        int i = f%10;
        n = b + e + h + i;
        return n;
    }

    public static void main(String[] args) {
        System.out.println("Введите четырехзначное число: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        a = sumDigitsInNumber(a);
        System.out.println("Сумма цифр числа: "+a);

    }
}




//    public static void main(String[] args) {
//        System.out.println(sumDigitsInNumber(5467));
//    }


