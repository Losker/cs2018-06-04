package by.it.kolos.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[20];
        for (int i = 0; i < 20; i++) {
            nums[i] = sc.nextInt();
        }
        sort(nums);
    }
    //сортировка по убыванию
    public static void sort(int[] array) {
        int i, j, t;
        for (i = 1; i < array.length; i++) {
            for (j = 0; j <= array.length - 2; j++) {
                if (array[j] < array[j + 1]) {
                    t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                }
            }
        }
        for (i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }

// сортировка по возрастанию
    /*public static void sort2(int[] array) {
        int i, j, t;
        for (i = 1; i < array.length; i++) {
            for (j = array.length - 1; j >= i; j--) {
                if (array[j - 1] < array[j]) {
                    t = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = t;
                }
            }
        }
        for (i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }*/


}
