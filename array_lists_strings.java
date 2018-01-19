package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/*
@airoo
Массив списков строк
Создать массив, элементами которого будут списки строк.
Заполнить массив любыми данными и вывести их на экран.

Требования:
1. Метод createList должен объявлять и инициализировать массив с типом элементов ArrayList.
2. Метод createList должен возвращать созданный массив.
3. Метод createList должен добавлять в массив элементы (списки строк). Списки должны быть не пустые.
4. Программа должна выводить данные на экран.
5. Метод main должен вызывать метод createList.
6. Метод main должен вызывать метод printList.
*/

public class Solution {
    public static void main(String[] args) {
        //создаем массив списков с помощью метода createList()
        ArrayList<String>[] arrayOfStringList = createList();
        //выводим на экран массив списком при помощи метода printList()
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //создаем массив списков типа String на 3 элемента
        ArrayList<String>[] listOfList = new ArrayList[3];
        
        //создаем три списка типа String
        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2= new ArrayList<String>();
        ArrayList<String> list3 = new ArrayList<String>();
        
        //заполняем списки
        for (int i = 1; i < 10; i++) {
            list1.add("Hello, ");
            list2.add("world");
            list3.add("!");
        }
        
        //заносим списки в главный массив списков
        listOfList[0] = list1;
        listOfList[1] = list2;
        listOfList[2] = list3;
        
        //возвращаем из метода массив списков
        return listOfList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {//перебираем массив списков
            for (String s : list) {//перебираем список
                System.out.println(s);//выводим на экран
            }
        }
    }
}
