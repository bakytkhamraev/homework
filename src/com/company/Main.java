package com.company;

public class Main {

    public static void main(String[] args) {
        String[] names = {"Bakyt", "Arslan", "Tilek"};
        for (String name1 : names) {
            switch (name1) {
                case "Bakyt":
                    System.out.println(name1 + " Good morning");
                    break;
                case "Arslan":
                    System.out.println(name1 + " Good day");
                    break;
                case "Tilek":
                    System.out.println(name1 + " Good evening");
                    break;
            }
        }
    }
}