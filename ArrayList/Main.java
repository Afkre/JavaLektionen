import java.util.ArrayList;

public class Main{
public static void druck(ArrayList<String> a){

    for (int i= 0; i<a.size(); i++){
        
        System.out.println("Buch " + (i+1) + ": " + a.get(i));
    }
}

    public static void main(String[]args){

        ArrayList<String> arraylist = new ArrayList<String>();

        arraylist.add("Faust");
        arraylist.add("Die Räuber");
        arraylist.add("Die Harzreise");
        arraylist.add("Der Zauberberg");
        arraylist.add("Emil und die Detektive");  

        //System.out.println(arraylist.get(0));
        //System.out.println(arraylist.get(3));   
        //System.out.println(arraylist.size());

        //arraylist.remove(2);

        //System.out.println(arraylist.size());

        //arraylist.clear();

        //System.out.println(arraylist.size());

        //System.out.println(arraylist.indexOf("Faust"));

        System.out.println(arraylist.set(4, "Winnetou"));
        
        for (int i = 0; i<arraylist.size();i++ ){
            System.out.println(arraylist.get(i));
        }
        
        druck(arraylist);

    }
}