package by.it.osadnitski.lesson03;
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

    public static void main(String args[]) {
        int number = 5467;
        System.out.println(sumDigitsInNumber(number));
    }

    public static int sumDigitsInNumber(int number) {

        int d = number % 10;
        int dt = (number - d) / 10;
        int c = dt % 10;
        int ct = (dt - c) / 10;
        int b = ct % 10;
        int a = (ct - b) / 10;

        int sum = a + b + c + d;
        return sum;
    }
}