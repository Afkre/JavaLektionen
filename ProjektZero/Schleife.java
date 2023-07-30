
import java.util.Scanner;

public class Schleife {

	public static void main(String[] args) {
		
		// testWhile1();
		//testDOWhile();
		//testFor2();
		//testEnhancedFor2();
		tsetBreakAndContinue();
	}

	public static void testWhile() {
		int i = 0, j = 0;
		System.out.println("Start");

		while (i < 10) {
			System.out.print(i + ", ");
			i++;
		}
	} // Output => Start
		// 0, 1, 2, 3, 4, 5, 6, 7, 8, 9,

	public static void testWhile1() {
		int i = 0, j = 0;
		System.out.println("Start");

		while (i < 10)
			while (j < 10)
				System.out.print(++i + ++j + ", ");
		i++;

	} // Output => Start //Einfach addiert
		// 2, 4, 6, 8, 10, 12, 14, 16, 18, 20,

	public static void testDOWhile() {
		//String answer;
		/*do {
			//game	
			Scanner scan = new Scanner(System.in);
			answer = scan.nextLine();
			
			
		}while(answer.equals("y"));
		*/
		int i = 0, j = 0;
		
		do {while(i < 5) 
			
			System.out.print(++i + j +  ", ");
		
		}while (j < 5);
	}
	
	public static void testFor() {
		int i;
		for ( i = 0; i < 10; i++) {
			
			System.out.print(i + ", ");
			
		}
		/*
		int i=0;
		for(;;) {
			System.out.println(i + ", ");
		}if(i<10)
			i++;
		*/
	}
	
	public static void testFor1() {
		
		for (int  i = 0 , j = 10;  i < 10 && j >0 ; i++, j--) {
			
			System.out.print(i + j +", ");
			
		}
	}
	
	public static void testFor2() {
		
		//for (int  i = 0 ; i < 4 ; i++)for (int  j = 0 ; j < 4 ; j++) System.out.print(i + ", " + j +", ");
		//Output =>0, 0, 0, 1, 0, 2, 0, 3, 1, 0, 1, 1, 1, 2, 1, 3, 2, 0, 2, 1, 2, 2, 2, 3, 3, 0, 3, 1, 3, 2, 3, 3, 	
		
		for (int  i = 0 ; i < 4 ; i++)for (int  j = 0 ; j < 4 ; j++) System.out.print(i + j +", ");
		//Output => 0, 1, 2, 3, 1, 2, 3, 4, 2, 3, 4, 5, 3, 4, 5, 6, 
	}
	
	
	public static void testEnhancedFor() {
		int [] nums = {4,2,8,1,6};
		
		for(int i = 0; i < nums.length; i++) {
				System.out.print(nums[i] + ", ");
		}
		System.out.println();
		
		for (int num : nums)
			System.out.print(num + ", ");
			
		
	}
	
	public static void testEnhancedFor2() {
		int [] nums1 = new int[6];
		int [] nums2 = new int[6];
		
		for(int i = 0; i < nums1.length; i++) {
			nums1[i] = 22;
		}
		
		for(int num : nums2)
			num = 33;
		
		for(int i = 0; i < nums1.length; i++) {
				System.out.print(nums1[i] + ", ");
		}
		System.out.println();
		
		for (int num : nums2)
			System.out.print(num + ", ");
			
		
	}
	//Output = > 22, 22, 22, 22, 22, 22, 
	//			 0, 0, 0, 0, 0, 0, 
	
	public static void tsetBreakAndContinue() { 

		int i = 0, j = 0; 
		while(j < 3){
			while(i < 10) {
				if (i == 5) {
					break;
				}
				System.out.print(i);
				i++;
			}
			j++;
		}
	}//Output = >01234

    public static void testBreakAndContinue1() { 

	int i = 0;
	int j = 0;
	outer:
	while(j < 3){
		j++;
		int i = 0;
		inner;
		while(i < 10) {
			i++;
			if (i == 5) {
				break;
			}
			System.out.print(i);
			i++;
		}
		
		}
	}

	public static void testLabel() {
	
		int i=3;
		
		label:
			
		{
			int j = 1;
			if(i >3) {
                continue label;
            }
			j=5;
			System.out.println(j);	
		}
	}


	
}





















