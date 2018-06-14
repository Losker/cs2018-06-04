package by.it.kolos.lesson04;

import java.util.Scanner;

/*
Напишите программу которая спрашивает у пользователя:
Какую вы хотите зарплату в $$$?

После ввода суммы, программа анализирует полученное значение
и если введенная цифра меньше 300 или больше 3000 программа выводит на экран:
Мы вам перезвоним!

Иначе выводит в цикле по переменной int month от 0 до 14 рассчитанную зарплату.
В летние месяцы - выводится введенная сумма с названием месяца.
В несуществующие месяцы 0, 13 и 14 выводится сумма в $0.0
в остальные месяцы выводится указанная сумма с премией в 50%.

Сделайте так, чтобы в тот месяц, когда получилась зарплата в $666 цикл после вывода прерывался.

Пример работы программы (у вас должно быть так же, до символа):

Какую вы хотите зарплату в $$$?
2000
За месяц 0 начислено $0.0
За январь начислено $3000.0
За февраль начислено $3000.0
За март начислено $3000.0
За апрель начислено $3000.0
За май начислено $3000.0
За июнь начислено $2000.0
За июль начислено $2000.0
За август начислено $2000.0
За сентябрь начислено $3000.0
За октябрь начислено $3000.0
За ноябрь начислено $3000.0
За декабрь начислено $3000.0
За месяц 13 начислено $0.0
За месяц 14 начислено $0.0

*/
public class TaskC1 {
    public static void main(String[] args) {
        System.out.print("Какую вы хотите зарплату в $$$?");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();


        if (s < 300 || s > 3000) System.out.println("Мы вам перезвоним!");
        else {
            int mounth;
            for (mounth = 0; mounth <= 14; mounth++) {
                double result = s * 1.5;
                if (mounth < 1 || mounth > 12) {
                    result = s * 0.0;
                }
                if (mounth >= 6 && mounth <= 8) {
                    result = s * 1.0;
                }
                String numMounth = "месяц" + mounth;
                switch (mounth) {
                    case 0:
                        numMounth = "месяц 0";
                        break;
                    case 1:
                        numMounth = "январь";
                        break;
                    case 2:
                        numMounth = "февраль";
                        break;
                    case 3:
                        numMounth = "март";
                        break;
                    case 4:
                        numMounth = "апрель";
                        break;
                    case 5:
                        numMounth = "май";
                        break;
                    case 6:
                        numMounth = "июнь";
                        break;
                    case 7:
                        numMounth = "июль";
                        break;
                    case 8:
                        numMounth = "август";
                        break;
                    case 9:
                        numMounth = "сентябрь";
                        break;
                    case 10:
                        numMounth = "октябрь";
                        break;
                    case 11:
                        numMounth = "ноябрь";
                        break;
                    case 12:
                        numMounth = "декабрь";
                        break;
                    case 13:
                        numMounth = "месяц 13";
                        break;
                    case 14:
                        numMounth = "месяц 14";
                        break;
                }
                System.out.println("За" + " " + numMounth + " " + "начислено" + " " + "$" + result);
                if (result == 666) break;
            }
        }
    }
}




