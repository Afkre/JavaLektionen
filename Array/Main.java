package Array;

import java.util.Scanner;

public class Main{

    public static void arrayDruck(int [] array ){

        for(int i = 0 ;i < array.length; i++ ){

            System.out.println("Element " + (i + 1) + " : " + array[i]);
        }

    }

    public static double arrayDurchschnitt(int [] array){

        int sum = 0;

        for (int i = 0; i< array.length; i++){

            sum += array[i];
        }

        return ((double)sum/array.length);

    }


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

        /*/
        //Moderne-Einfache  Methode
        int [] a = {1,2,3,4,5,6,7,8,9,10};
        int [] b = {10,20,30,40,50};
                                    
                                      //Output:  
        System.out.println(a[0]);     //1
        //System.out.println(a[10]);  //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10. Das ist 11.element
        System.out.println(a[9]);     //10
        System.out.println(b[4]);     //50  
        System.out.println("Länge des Arrays: " + a.length);  // Output ==> Länge des Arrays: 10
        System.out.println("Länge des Arrays: " + b.length);    // Output ==> Länge des Arrays: 5
        */

        /*
        int []a = new int [5];

        for (int i= 0; i < 5; i++){
            a[i] = i * 4 + 2;
            System.out.println(a[i]);   //Output:   2   6   10  14  18  
        }
        */

        /*
        int []a = new int [5];

        Scanner scanner = new Scanner(System.in);

        for (int i= 0; i < 5; i++){
            a[i] = scanner.nextInt();

        }

        scanner.close(); 
        System.out.println("-----------------------------------------");

        for (int i= 0; i < 5; i++){
              
            System.out.println(a[i]);   //Output:   eingegebene Werte

        }
        */    

        int []b = {10,20,30,40,50,60};

        arrayDruck(b);
        /*
        Output: 
        Element 1 : 10
        Element 2 : 20
        Element 3 : 30
        Element 4 : 40
        Element 5 : 50
        Element 6 : 60
        */

        System.out.println("Durchschnitte: " + arrayDurchschnitt(b));   // Output ==> Durchschnitte: 35.0
        


    

    }
    
}