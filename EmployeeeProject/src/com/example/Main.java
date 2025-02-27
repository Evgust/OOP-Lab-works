package com.example;

import java.util.ArrayList;  // Подключаем API

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        System.out.println(list.get(0)); // Выведет "Java"
    }
}