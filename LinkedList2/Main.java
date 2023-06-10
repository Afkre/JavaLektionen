package LinkedList2;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    
    public static void drucklist(LinkedList<String> haltestelle) {
        /*for (String s: haltestelle) {
            System.out.println(s);
        }*/
        
        ListIterator<String> iterator = haltestelle.listIterator();
        
        while(iterator.hasNext()) {
            
            System.out.println(iterator.next());
                
        }
        
      
    }
    public static void add_sortiert_einfügen(LinkedList<String> haltestelle,String neue){
        ListIterator<String> iterator = haltestelle.listIterator();
        
        while (iterator.hasNext()) {
            
            int vergleichen = iterator.next().compareTo(neue);
            
            if (vergleichen == 0) {
                // Zwei Werte sing gleich
                System.out.println("Dieser Element steht bereits auf Ihrer Liste....");
                
                return;
               
            }
            else if (vergleichen  < 0) {
                
                // Neu Wert ist vom iterator.next zu groß.
            }
            else if (vergleichen > 0 ) {
                
                iterator.previous();
                iterator.add(neue);
                
                return;
                
            }
           
        }
        iterator.add(neue);
        
        
        
        
    }
    public static void main(String[] args) {
        
        LinkedList<String> haltestelle = new LinkedList<String>();
        
        
        add_sortiert_einfügen(haltestelle, "Post");
        add_sortiert_einfügen(haltestelle, "Markt");
        add_sortiert_einfügen(haltestelle, "Haus");
        
        
        /*haltestelle.add("Post");
        
        haltestelle.add("Markt");
        
        haltestelle.add("Schule");
        
        haltestelle.add("Bücherei");
        
        haltestelle.add("Sportanlage");
        
        haltestelle.add("Haus");
        
        
        drucklist(haltestelle);
        
        System.out.println("----------------------------------------------");
        
        //haltestelle.add(4,"Einkaufzentrum");
        //haltestelle.remove(3);
        
        //listeyi_bastir(haltestelle); */
        
        
        drucklist(haltestelle);
        
    
    }


}
