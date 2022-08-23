import java.util.LinkedList;
import java.util.List;

public class Person {
	
	// Eigenschaften
	private String vorname;
	private String nachname;
	private int alter;
	
	// Konstruktor
	public Person(String vorname, String nachname, int alter) {
		super();
		this.vorname = vorname;
		this.nachname = nachname;
		this.alter = alter;
	}

	// Methoden
	public void getPesonData() {
		System.out.println("Vorname: " + vorname + " Nachname: " + nachname + " Alter: " + alter);
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}
	
	// List mit Personen erstellen
	static public List<Person> createShortList() {
		Person person1 = new Person("Laura", "Berg", 65);
		Person person2 = new Person("Peter", "Anders", 34);
		Person person3 = new Person("Lena", "Wer", 22);
		Person person4 = new Person("Wolfgang", "Rode", 54);
		Person person5 = new Person("Daniel", "Logi", 12);
		Person person6 = new Person("Michael", "App", 87);
		Person person7 = new Person("Andi", "gestern", 87);
		
		List<Person> list = new LinkedList<Person>();
		list.add(person1);
		list.add(person2);
		list.add(person3);
		list.add(person4);
		list.add(person5);
		list.add(person6);
		list.add(person7);
		
		return list;
	}
	
	
	
	

}
