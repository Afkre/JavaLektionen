import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class TestString {

	public static void main(String[] args) {
		//testString();
		//testString4();
		//testRegExes();
		//testStringBuilder();
		//testArray();
		//testArrayList1();
		//testList();
		//testLocalDate();
		//testPeriodAndDuration1();
		testFormatDate();
	}
	public static void testString() {
		String text1 = "Hallo Welt";
		String text2 = "Hallo Welt";
		String text3 = new String("Hallo Welt");
		
		System.out.println(text1 == text2);			// Output =>true
		System.out.println(text1 == text3);			// Output =>false
		System.out.println(text1.equals(text2));	// Output =>true
		System.out.println(text1.equals(text3));	// Output =>false
		
		System.out.println(text1.length()); 		// Output => 10 
		//System.out.println(text1.substring(6,11));  //falsh wegen 11
		System.out.println(text1.substring(6));  	//Output => Welt    => das bedeutet ab exklusive 6 bis ende drucken lassen
		System.out.println(text1.substring(6,7));  	//Output =>W
		
		int i= 47 ;
		int j = 11;
		System.out.println(text1 + i + j); 			// Output => Hallo Welt4711
		System.out.println(text1 + (i + j)); 		// Output => Hallo Welt58
		System.out.println( i + j + text1);			// Output => 58Hallo Welt
		
		String num = String.valueOf(47);
		String num1 = "" + i;
		
		System.out.println("" + true);
		String strbool = String.valueOf(false);
		
	}
	
	public static void testString2() {
		String text = "Dies ist ein Testtext zum Testen";
		char character = text.charAt(5);
		//String character = text.charAt(5)+ "";
		
		System.out.println(character);
	}
	
	public static void testString3() {
		String text = "Dies ist ein Testtext zum Testen";
		char character = text.charAt(5);
	
		//int pos = text.indexOf("Test", 27);
		
		//System.out.println(pos);
		
		int pos = text.lastIndexOf("Test", 25);  //13
		
		System.out.println(pos);
		
		//text.replace('t', 'd');
		//System.out.println(text.replace('t', 'd'));//Dies isd ein Tesddexd zum Tesden
		
		//text.replace('t', 'd');
		//text.substring(3, 7);
		//System.out.println(text);			//Dies ist ein Testtext zum Testen
		
		
		text = text.replace('t', 'd');
		text.substring(3, 7);
		System.out.println(text);			//Dies isd ein Tesddexd zum Tesden
		
	}
	public static void testString4() {
		String filename = "Demo.txt";
		System.out.println(filename.endsWith(".txt"));
		System.out.println(filename.toLowerCase().startsWith("demo"));
		
	}
	
	public static void testRegExes() {
		String regex_plz1 = "[0123456789]{5}";
		String regex_plz2 = "[0-9]{5}";
		String regex_plz3 = "\\d{5}";
		String plz = "05127";
		System.out.println(plz.matches(regex_plz3));
		String bs = "\\\\";
		
		//String regexdate = "(0?[1-9]) | (1[0-9] )| (3[01])\\. (0?[1-9]) | (1[0-2])\\.[0-2]?[0-9]?[0-9]?[09]";
		//System.out.println("22.10.1985".matches(regexdate));
		
		String regexdate = "(0?[1-9]|1[0-9]|2[0-9]|3[0-1])\\.(0?[1-9]|1[0-2])\\.[0-9]{4}";
		System.out.println("22.10.1985".matches(regexdate));
			
	}
	
	public static void testStringBuilder() {
		StringBuilder sb = new StringBuilder();
		sb.append("Dies ist ");
		sb.append("ein Test");
		sb.insert(13, "neuer ");
		
		//System.out.println(sb.toString()); 	//Output => Dies ist ein neuer Test
		//System.out.println(sb); 				//Output => Dies ist ein neuer Test
		sb.deleteCharAt(7);						
		System.out.println(sb);					//Output => Dies is ein neuer Test
		sb.delete(12, 18);
		System.out.println(sb);					//Output => Dies is ein Test
		sb.substring(6,8);
		System.out.println(sb);					//Output => Dies is ein Test
		//sb.reverse();
		//System.out.println(sb);					//Output => tseT nie si seiD
		sb.replace(5,7,"war");
		System.out.println(sb);					//Output => Dies war ein Test
		System.out.println(sb.length());		//Output =>17
		
	}
	
	public static void testArray() {
		int[] lotto = new int[6];
		lotto[0] = 15;
		lotto[1] = 21;
		lotto[2] = 9;
		lotto[3] = 46;
		lotto[4] = 18;
		lotto[5] = 25;
		
		int[] lotto2 = new int[] {15,21,9,46,18,25};
		
		//lotto[6]=5;   6 außerhalb des Breiches
		System.out.println(lotto[2]);			// Output => 9
		System.out.println(lotto);				// [I@5a07e868  ----> objecktsreferanz
		System.out.println(lotto.length);		// 6
		Arrays.sort(lotto2);
		System.out.println(Arrays.toString(lotto2));	//Output => [9, 15, 18, 21, 25, 46]
		
	}
	
	public static void testArrayList() {
		ArrayList al = new ArrayList(100);
		al.add("Ahmet");
		al.add(1);
		al.add(true);
		al.add(new StringBuilder("Test"));
		al.add(4, "OK");
		
		System.out.println(al.get(3));					//Output =>	Test
		System.out.println(al.get(2));					//Output =>	true
		System.out.println(al.get(4));					//Output =>	OK
		System.out.println(al);							//Output =>	[Ahmet, 1, true, Test, OK]
		
		System.out.println(al.get(1));					//Output =>	1
				
	}
	
	public static void testArrayList1() {
		ArrayList<String> al = new ArrayList<String>(100);
		al.add("Ahmet");
		al.add("Tim");
		al.add("Ben");
		al.add("Key");
		al.add("Best");
		al.add("Bäck");
		al.add(0,"Tina");
		String del = al.remove(2);						// um eine element zu löschen, muss mann "remove" benutzen. Hier funktioniert "delete."nicht
		System.out.println(del);
		del = al.set(2, "Maria");
		System.out.println(del);
		
		System.out.println(al.get(1).length());
		System.out.println(al.get(2).length());
		System.out.println(al.get(2));
		System.out.println(al.size());					// Array lenght
		al.sort(Comparator.naturalOrder());
		//al.sort((String v1, String v2) -> v1.compareTo(v2));
		al.sort(new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				//TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		});
		System.out.println(al);	
		
	}
	
	public static void testList() {
		
		LinkedList<String> ll = new LinkedList<>();
		SortedSet<String> sortset = new TreeSet<String>();
		
	}
	
	public static void testLocalDate() {
		LocalDate bday = LocalDate.of(1971, 05, 12);
		LocalDate day =  LocalDate.parse("2000-10-22");
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		System.out.println(today.plusWeeks(10));
		System.out.println(today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
		
		System.out.println(day.isBefore(today));
		//System.out.println(day.getYear());
				
	}
	
	public static void testPeriodAndDuration() {
		LocalDate bday = LocalDate.of(1971, 05, 12);
		LocalDate today = LocalDate.now();
		
		Period per = Period.of(2, 10, 6);
		Period per1 = Period.parse("p2w2d");
		Period per2 = Period.parse("p1m2w-42d");
		
		System.out.println(today.plus(per));
		System.out.println(per1.getDays());
		System.out.println(per1.getMonths());
		System.out.println(today.plus(per1));
		
		System.out.println(per2.getDays());
		System.out.println(today.plus(per2));
		
		Period per3 = Period.between(bday, today);
		
		System.out.println(per3);
		System.out.println(today.toEpochDay() - bday.toEpochDay());
		
				
	}
	public static void testPeriodAndDuration1() {
		LocalDateTime bday = LocalDateTime.of(1971, 05, 12, 0, 0, 0);
		LocalDateTime today = LocalDateTime.now();
		
		Period per = Period.of(2, 10, 6);
		Period per1 = Period.parse("p2w2d");
		Period per2 = Period.parse("p1m2w-42d");
		
		System.out.println(today.plus(per));
		System.out.println(per1.getDays());
		System.out.println(per1.getMonths());
		System.out.println(today.plus(per1));
		
		System.out.println(per2.getDays());
		System.out.println(today.plus(per2));
		
		
		
		Duration between = Duration.between(bday, today);
		System.out.println(between);
		System.out.println(between.getSeconds());
		System.out.println(between.toMinutes());
		System.out.println(between.toMinutesPart());
		System.out.println(between.get(ChronoUnit.SECONDS));		
			
	}
	
	public static void testFormatDate() {
		LocalDateTime bday = LocalDateTime.of(1971, 05, 12, 12, 12, 12);
		String text = bday.format(DateTimeFormatter.ofLocalizedDateTime
								(FormatStyle.LONG,FormatStyle.MEDIUM));
								//(FormatStyle.LONG)); // geht mit einem Parameter wenn dateformatter medium oder short
		
		/*
		 String text1 = bday.format(DateTimeFormatter.ofLocalizedDateTime
		 				(FormatStyle.LONG,FormatStyle.SHORT ));
		*/
		text = bday.format(DateTimeFormatter.ISO_DATE_TIME);
		
		String pattern = "EE 'den' dd. MMMM YY";
		text = bday.format(DateTimeFormatter.ofPattern(pattern));
		text = bday.format(DateTimeFormatter.ofPattern(pattern, Locale.ENGLISH));
		System.out.println(text);
		JOptionPane.showConfirmDialog(null, text);
		
		System.out.println(text);
		
	}
	
	
}
