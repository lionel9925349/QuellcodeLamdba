import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class WhyLambdas {
	
	public static void main(String[] args) {
//		Integer[] numbers = {5,11,17,3,1,100,300,120};
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.println(numbers[i]);
//		}
//		
//		//Arrays.sort(numbers);
//		MyComparator myComparator = new MyComparator();
//		
//		// Anonyme Klasse
//		Arrays.sort(numbers, new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//			
//				return 0;
//			}
//		});
//		
//		// Eigene Klasse für den Comparator erstellt 
//		Arrays.sort(numbers, myComparator);
//		
//		
//		// Lambda 
//		// (Paramter) -> {         }
//		Arrays.sort(numbers, (a,b) -> b-a);
//		
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.println(numbers[i]);
//		}
		
		
		// foreach Schleife 
		List<String> itemStrings = new ArrayList<String>();
		itemStrings.add("Einkaufen");
		itemStrings.add("Sport");
		itemStrings.add("Uni lernen");
		itemStrings.add("Freunde treffen");
		itemStrings.add("Freund anrufen");
		
		itemStrings.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
				
			}
		});
		
		// (Parameter) -> {       }
		itemStrings.forEach((String t) -> {
			System.out.println(t);
		});
		
		itemStrings.forEach((t) -> { 
			System.out.println(t);
		});
		
		itemStrings.forEach(t -> {  
			System.out.println(t);
		});
		
		itemStrings.forEach(t -> System.out.println(t + " Test "));
	}

}










