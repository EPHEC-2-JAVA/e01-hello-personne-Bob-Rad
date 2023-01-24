package be.ephec.java.exercice;

import be.ephec.java.exercice.e01.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Person p1=new Person();
        Scanner sc = new Scanner(System.in);

        System.out.println("First Name ? : ");
        p1.firstName = sc.next();

        System.out.println("last Name ? : ");
        p1.lastName = sc.next();


        System.out.println("Age ? : ");
        p1.age = sc.nextInt();

        p1.display();
    }
}