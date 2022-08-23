import java.util.List;

public class PersonList {
	
	public static void main(String[] args) {
		
		// Liste 
		List<Person> personsList = Person.createShortList();
		
		for (Person person : personsList) {
			person.getPesonData();
		}
		
		System.out.println("----");
		
		
		
		
		
		
		
	}

}
