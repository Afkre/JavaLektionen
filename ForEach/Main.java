public class Main {
    public static void main(String[] args) {
        
        String[] array = {"Hund","Katze","Vogel"};
        int[] array2  = {1,2,3,4,5,6,7};
        Test[] array3 = {new Test("Banana"),new Test("Orange"),new Test("Apfel")};
        
        for (Test t : array3) {
            t.druck();
            
        }
        for (int i: array2){
            System.out.println(i);
        }
        for (String a : array) {
            System.out.println(a);
        }
    }
    
}
