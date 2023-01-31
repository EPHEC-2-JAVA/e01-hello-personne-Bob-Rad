package org.example;

import java.util.Scanner;

public class Pascal {
    public static void main(String[] args) {

        Scanner sc=new  Scanner(System.in);
        System.out.println("Enter nbr : ");
        int n;

        n= sc.nextInt();


        int [][] table =new int[n+1][n+1];

        for (int i=0;i<=n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if(j==0)
                {

                    table[i][0]=1;
                    System.out.print(" ");
                } else if (j==i) {

                    table[i][j]=1;


                } else

                    table[i][j]=table[i-1][j]+table[i-1][j-1];


            }
            System.out.println();
        }

    /*   for (int i=0;i<= table.length;i++)
       {
           for (int j=0;j<=i;j++)
           {
               System.out.print(table[i][j]);
               System.out.print(" | ");
           }
           System.out.println();
       }

     */

        for(int [] tab : table)
        {
            for(int i : tab){
                if(i>0)
                    System.out.print(i);
            }
            System.out.println();

        }
    }
}