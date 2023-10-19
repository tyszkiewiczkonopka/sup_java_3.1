package org.example;

public class Main {
    public static void main(String[] args) {

    shout("Magda");
    shout(333);
    }

    public static <T> void shout (T name){
        System.out.println(name);
    }
}