package Exercise;

public class MyArrayTools {

	public static boolean find(int[] numbers, int number) {
		boolean found = false;
		int i = 0;
		while(i < numbers.length) {
			if(numbers[i] == number) {
				found = true;
				break;
			}
			i++;
		}
		return found;
	}
	public static int indexOf(int[] numbers, int number) {
		int result = -1;
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i] ==  number) {
				result = i;
				break;
			}
		}
		return result;
	}
	public static int max(int[] numbers) {
		int result = numbers[0];
		for (int num : numbers) {
			if(num > result) {
				result = num;
			}
		}
		return result;
	}
	public static int min(int[] numbers) {
		int result = numbers[0];
		for (int num : numbers) {
			if(num < result) {
				result = num;
			}
		}
		return result;
	}
	
	public static void sort(int[] numbers) {
		int count = 0;
		while (count < numbers.length-1) {
			int i = 0;
			while(i < numbers.length-1) {
				if (numbers[i] > numbers[i+1]) {
					int temp = numbers[i+1];
					numbers[i+1] = numbers[i];
					numbers[i] = temp;
				}
				i++;
			}
		count++;
		}
	}
	
	public static String[] sort(String[] names) {
		int counter = 0;
		while (counter < names.length -1) {
			int i =0;
			while(i < names.length - 1) {
				if(names[i].compareTo(names[i+1])>0) {
					String temp = names[i+1];
					names[i+1] = names[i];
					names[i] = temp;
				}
				i++;
			}	
			counter++;
		}
		return names;
	}
}

