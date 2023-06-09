package LinkedList;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<String> programmierSprachen = new ArrayList<String>();

        programmierSprachen.add("Python");
        programmierSprachen.add("Java");
        programmierSprachen.add("Php");
        programmierSprachen.add("JavaScript");
        programmierSprachen.add("C#");
        
    /*for(int i=0; i<programmierSprachen.size(); i++){
        System.out.println(programmierSprachen.get(i));
    }*/
    
    for(String s: programmierSprachen){
        System.out.println(s);
    }

    }
    
    
    
}

