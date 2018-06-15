package by.it.rusakewicz.lesson05;

import by.it._examples_.demo05.While;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/*
Создайте список строк.
Вводите строки с клавиатуры, пока пользователь не введет слово END.
Каждую введенную строку, кроме слова END добавьте в список типа ArrayList.

Напечатайте список, не используйте для этого цикл.
Список - это объект. Его можно просто напечатать, как переменную.

Для вот такого ввода:
ONE
TWO
THREE
FOUR
FIVE
END
Ожидается такой вывод:
[ONE, TWO, THREE, FOUR, FIVE]

*/
public class TaskA2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> arr=new ArrayList<>();
        while (true){
            String val=sc.next();
            if (val.equals("END"))
                break;
            arr.add(val);
        }
        System.out.println(arr);
    }

}
