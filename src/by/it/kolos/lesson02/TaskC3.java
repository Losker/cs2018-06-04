package by.it.kolos.lesson02;

import java.util.Locale;
import java.util.Scanner;

/*
Ускорение свободного падения на Земле и Марсе таково:
Марс   3.86
Земля   9.81

С клавиатуры вводится вес человека в килограммах.
Рассчитайте вес человека на Марсе и выведите
округлив его до сотых килограмма (2 знака)

Создайте для этих целей метод getWeight(int weight)

Требования:
1. Метод getWeight(int weight) должен быть статическим.
2. Метод getWeight должен возвращать значение типа double.
3. Метод getWeight должен обязательно (!) округлять до сотых возвращаемое значение типа double.
4. Метод getWeight не должен ничего выводить на экран.
5. Метод getWeight должен правильно переводить вес тела в килограммах на Земле
    в вес этого же тела на Марсе, и возвращать это значение.

Пример:

Ввод:
75

Вывод:
29.51


*/
class TaskC3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
        double weightMars = getWeight(weight);
        System.out.println(weightMars);
    }

    public static double getWeight(int weightEarth) {
        double earth = 9.81;
        double mars = 3.86;
        double weightMars = weightEarth * mars / earth;
        String rounded = String.format(Locale.US, "%.2f", weightMars);
        return Double.valueOf(rounded); // преобразов. в число
        /*String one = weightMars+"";// 1 - преобразование числа в строку
        String two = String.valueOf(weightMars); // 2 - преобразование числа в строку
        String three = ((Double)weightMars).toString(); // 3 - преобразование числа в строку
        String rounded = String.format("%f", weightMars); // 4 - преобразование числа в строку (через формат.)
*/
        /*double temp=res*100:
        int tempi=(int)temp;
        double del=temp-tempi
        if (del>=0.5);
        tempi++;
        return tempi/100/0
        return Math.round (res*100)/100/0;
        */
    }
}


