package be.ephec.java.exercice.e02;

import java.util.Scanner;

public class parseInt02 {
    private int bases ;
    private String nbr;
    private Scanner sc =new Scanner(System.in);


    public  void afficher(){
        do {
            System.out.println("Entrer un nombre : ");
            nbr = sc.next();
            System.out.println("Entrer une base : ");
            bases = sc.nextInt();
            if(nbr !="0"&& bases!=0) {
                System.out.println(Integer.parseInt(nbr, bases));
            }
            else
                System.out.println("end");


        }while (nbr!="0" && bases!=0 );
    }




}
