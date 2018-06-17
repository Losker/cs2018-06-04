package by.it.zambrano.lesson03;
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
    static Scanner sumDigitsInNumber=new Scanner(System.in);
    public static void main(String[] args) {
        int numero=sumDigitsInNumber.nextInt();
        System.out.println(sumDigitsInNumber(numero));
    }

    private static int sumDigitsInNumber(int numero) {
        if (numero==0) {
            return 0;
        }  else{
            return  sumDigitsInNumber(numero/10)+(numero%10);
        }
    }

}
