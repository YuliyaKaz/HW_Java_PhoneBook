package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/***
 * @apiNote Телефонная книга
 */
public class PhoneBook {
    private HashMap<String, ArrayList<Integer>> book = new HashMap<String, ArrayList<Integer>>();

    /***
     * @apiNote Добавление контакта в телефонную книгу
     * @param name Имя контакта
     * @param phone Телефон
     */
    public void add(String name, int phone) {
        ArrayList<Integer> listNumbers = book.get(name);
        ArrayList<Integer> newNumbers = new ArrayList<>();

        newNumbers.add(phone);

        if (listNumbers != null){
            listNumbers.addAll(newNumbers);
            Collections.sort(listNumbers, Collections.reverseOrder());
            book.put(name, listNumbers);
        } else {
            book.putIfAbsent(name, newNumbers);
        }
    }

    /***
     * @apiNote Вывод контактов адресной книги в консоль
     */
    public void read() {
        for (String s : book.keySet()) {
            System.out.println("Имя: " + s + ", телефон: " + book.get(s).toString());
        }
    }
}