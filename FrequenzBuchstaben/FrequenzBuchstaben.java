package FrequenzBuchstaben;


import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class FrequenzBuchstaben {
    public static void main(String[] args) {
        
        // Ermitteln der Häufigkeit von Buchstaben in einer Zeichenkette mit TreeMap
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie den Satz ein: ");
        String satz = scanner.nextLine();
        Map<Character,Integer> frekans = new TreeMap<Character,Integer>();
        
        
        for (int i = 0 ; i< satz.length() ; i++) {
            char c = satz.charAt(i);
            
            if (frekans.containsKey(c)) {
                
                frekans.replace(c, frekans.get(c) + 1);
               
            }
            else {
                frekans.put(c, 1);
                
            }
           
        }
        
        for (Map.Entry<Character,Integer> entry : frekans.entrySet()) {
            System.out.println("Karakter => " + entry.getKey() + " " + entry.getValue() + " Mal..." );
            
            
        }
        scanner.close();
    }
    
}
