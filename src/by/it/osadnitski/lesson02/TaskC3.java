package by.it.osadnitski.lesson02;

/*
Ускорение свободного падения на Земле и Марсе таково:
Марс   3.86
Земля   9.81

С клавиатуры вводится вес человека в килограммах.
Рассчитайте вес человека на Марсе и выведите
округлив его до сотых килограмма (2 знака)

Создайте для этих целей метод getWeight(int weight)

Требования:
1.?Метод getWeight(int weight) должен быть статическим.
2.?Метод getWeight должен возвращать значение типа double.
3.?Метод getWeight должен обязательно (!) округлять до сотых возвращаемое значение типа double.
4.?Метод getWeight не должен ничего выводить на экран.
5.?Метод getWeight должен правильно переводить вес тела в килограммах на Земле
    в вес этого же тела на Марсе, и возвращать это значение.

Пример:

Ввод:
75

Вывод:
29.51


*/
import java.util.Scanner;

public class TaskC3 {

    public class G {
        public static final double MARS =3.86;
        public static final double EARTH =9.81;
    }
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
        System.out.println(getWeight(weight));
    }
    public static double getWeight(int weight) {

        double mw = (G.MARS / G.EARTH * weight);
        double mwt = Math.round(mw * 1000);
        mw = Math.round(mw * 100);
        mw = mw / 100;
        double mwdr=mwt-mw*1000;
        if (mwdr>4) {
            mw=(mw*100+1)/100;
        }
        return mw;
    }
}