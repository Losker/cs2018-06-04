package by.it.osadnitski.lesson05;
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
        String str1="Крестьянские дети";
        String str2="Однажды, в студеную зимнюю пору,";
        String str3="Я из лесу вышел; был сильный мороз;.";
        String str4="Гляжу, поднимается медленно в гору";
        String str5="Лошадка, везущая хворосту воз.";

        ArrayList str5Arraylist = new ArrayList();

        str5Arraylist.add(str1);
        str5Arraylist.add(str2);
        str5Arraylist.add(str3);
        str5Arraylist.add(str4);
        str5Arraylist.add(str5);

        int len=str5Arraylist.size();
        System.out.println(len);

        System.out.println(str1+"\n"+str2+"\n"+str3+"\n"+str4+"\n"+str5);
    }
}
