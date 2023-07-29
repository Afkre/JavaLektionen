
public class ConditionAndLoops {

	public static void main(String[] args) {

		//testIF();
		//testIFtrap();
		//testTernaerer();
		testSwitch();
	}

	public static void testIF() {
		int alter = 18;
		
		if (alter < 18) 
			System.out.println("Du bist zu jung!Tschüss");
		else if (alter == 18) 
			System.out.println("Pass ja gerade so, komm rein");
		else 
			System.out.println("Willkommen, viel Spaß...");
		
	}
	
	public static void testIFtrap() {
		int a = 10 , b = 20, m;
		
		if(a>b){
			m=a;
		}
		{
			m=b;
		}
		System.out.println(m);
		
	}
	
	public static void testTernaerer() {
		int a= 10, b = 20;
		String result = "";
		result  = a<b  ? "a ist kleiner b" :  "a ist größer b"; 
		
		result = a<b ? a < 10 ? "Test 1": "Test 2": b<10 ? "Test 3": "Test 4"; 
		System.out.println(result);
		
	}
	
	public static void testSwitch() {
		
		String name = "Tim" ;
		
		switch(name) {
			case "Ahmet":
				System.out.println("Hallo Trainer");
				break;
			case "Tim":				
			case "Tina":
				System.out.println("Hallo Teilnehmer");
				break;
			default:
				System.out.println("Du bist kein Teilnehmer");
				break;
		}
		
		byte num = 2 ;
		final int val= 5 ;
				
		
		switch(num) {
		case 1:
			System.out.println(1+ " wurde gewaehlt");
			break;
		case 2:
			System.out.println(2+ " wurde gewaehlt");
			break;
		case 3:
			System.out.println(3+ " wurde gewaehlt");
			break;
		case -1/2:
			System.out.println(4+ " wurde gewaehlt");
			break;
		case val:
			System.out.println(4+ " wurde gewaehlt");
			break;
		}
		
		
	}
	
	
}
