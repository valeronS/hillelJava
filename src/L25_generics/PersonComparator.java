package L25_generics;

import L08_Inheritance.Person;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
	@Override
	public int compare(Person o1, Person o2) {
		return 0;
	}
}
