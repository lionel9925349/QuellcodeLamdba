import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
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
//				return o2 - o1;
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

		// (Parameter) -> { }
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

		
		
		
		List<Person> personsList = Person.createShortList();
		
		for (Person person : personsList) {
			person.getPesonData();
		}

		// personsList sortieren

		// Mit einer Anonymen Klasse
		Collections.sort(personsList, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getVorname().compareToIgnoreCase(o2.getVorname());
			}
			
		});

		for (Person person : personsList) {
			person.getPesonData();
		}

		// Mit Lambda verkürzen
		// (Paramter p1, Paramter p2) -> { };
		Collections.sort(personsList, (Person p1, Person p2) -> {
			return p1.getVorname().compareTo(p2.getVorname());
		});
		
		for (Person person : personsList) {
			person.getPesonData();
		}
		
		// Lambda vereinfachen
		Collections.sort(personsList, (p1, p2) -> {
			return p1.getVorname().compareTo(p2.getVorname());
		});
		
		Collections.sort(personsList, (p1, p2) -> p2.getVorname().compareTo(p1.getVorname()));
		
		for (Person person : personsList) {
			person.getPesonData();
		}
		
		
		
		
		// Lambda Beispiele:
		
		
		
		

	}

}































