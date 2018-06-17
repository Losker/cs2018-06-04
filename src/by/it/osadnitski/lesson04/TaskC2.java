package by.it.osadnitski.lesson04;

/*

На входе вводится число и месяц 2018 года.
Программа должна выводить номер дня года, считая 1 января первым днем,
а 31 декабря 365-м.

Пример:
Ввод:
1 1

Вывод
1

Ввод:
31 12

Вывод
365

Ввод:
13 9

Вывод
256

 */
import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        int m = scanner.nextInt();
        int n;

        if (m == 1) {
            n = d;
            System.out.println(n);
        }
        if (m == 2) {
            n = 31 + d;
            System.out.println(n);
        }
        if (m == 3) {
            n = 31 + 28 + d;
            System.out.println(n);
        }
        if (m == 4) {
            n = 31 + 28 + 31 + d;
            System.out.println(n);
        }
        if (m == 5) {
            n = 31 + 28 + 31+30+ d;
            System.out.println(n);
        }
        if (m == 6) {
            n = 31 + 28 + 31+30+31+d;
            System.out.println(n);
        }
        if (m == 7) {
            n = 31 + 28 + 31+30+31+30+d;
            System.out.println(n);
        }
        if (m == 8) {
            n = 31 + 28 + 31+30+31+30+31+d;
            System.out.println(n);
        }
        if (m == 9) {
            n = 31 + 28 + 31+30+31+30+31+31+d;
            System.out.println(n);
        }
        if (m == 10) {
            n = 31 + 28 + 31+30+31+30+31+31+30+d;
            System.out.println(n);
        }
        if (m == 11) {
            n = 31 + 28 + 31+30+31+30+31+31+30+31+d;
            System.out.println(n);
        }
        if (m == 12) {
            n = 31 + 28 + 31+30+31+30+31+31+30+31+30+d;
            System.out.println(n);
        }
    }
}