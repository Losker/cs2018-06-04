package by.it.karpinskaya.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.util.ArrayList;

public class TaskB1 {
    public static void main(String[] args) {
        ArrayList<String> array=new ArrayList<>();
        array.add("one");
        array.add("two");
        array.add("three");
        array.add("four");
        array.add("five");
        int a=array.size();
        System.out.println(a);
        for (int b=0;b<5;) {
            System.out.println(array.get(b));
            b++;
        }
    }
}
