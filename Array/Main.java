package Array;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
        // int a = 5;
        

        //einem Array einen Wert zuweisen
        //int[] a;        
        //double [] b;    

        /*
        //Erste Methode
        int [] a = new int[10];  //Für das Array wurden 10 Plätze zugewiesen. Das ist stabil.

        a[5] = 32;              //Zuweisung des Wertes 32 an das fünfte Element des Arrays
        */

        /*
        //Moderne-Einfache  Methode
        int [] a = {1,2,3,4,5,6,7,8,9,10};
        int [] b = {10,20,30,40,50};
                                    
                                      //Output:  
        System.out.println(a[0]);     //1
        //System.out.println(a[10]);  //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10. Das ist 11.element
        System.out.println(a[9]);     //10
        System.out.println(b[4]);     //50  
        */
        
        /*
        int []a = new int [5];

        for (int i= 0; i < 5; i++){
            a[i] = i * 4 + 2;
            System.out.println(a[i]);   //Output:   2   6   10  14  18  
        }
        */


        int []a = new int [5];

        Scanner scanner = new Scanner(System.in);

        for (int i= 0; i < 5; i++){
            a[i] = scanner.nextInt();

        }
        System.out.println("-----------------------------------------");

        for (int i= 0; i < 5; i++){
        System.out.println(a[i]);   //Output:   eingegebene Werte

        }    

    }
    
}