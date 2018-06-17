package by.it.kolos.lesson05;
/*
Три массива
1.  Введите с клавиатуры 20 чисел, сохраните их в список и рассортируйте по трём другим спискам:
    Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
    Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2.  Статический метод void printList(List<Integer> list) должен выводить на экран
    все элементы переданного ему списка list, каждый элемент - с новой строки.
3.  Используя метод printList выведите ваши три списка на экран.
    Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> listMain = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            int x = sc.nextInt();
            listMain.add(x);
        }
        ArrayList<Integer> listThree = new ArrayList<>(); // делится на 3
        ArrayList<Integer> listTwo = new ArrayList<>(); // делится на 2
        ArrayList<Integer> listOthers = new ArrayList<>(); //  и остальные

        for (int i = 0; i < listMain.size(); i++) {
            Integer x = listMain.get(i);
            if (x % 3 == 0 && x % 2 == 0) {
                listTwo.add(x);
                listThree.add(x);
            } else if (x % 3 == 0) {
                listThree.add(x);
            } else if (x % 2 == 0) {
                listTwo.add(x);
            } else {
                listOthers.add(x);
            }
        }
        printList(listThree);
        printList(listTwo);
        printList(listOthers);
    }

    private static void printList(List<Integer> list) {
        for (Integer aList : list) System.out.println(aList);
    }
}


