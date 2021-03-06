package L07_OOP.homeWork;

public class Main {
	public static void main(String[] args) {
		ImprovedStringArray i = new ImprovedStringArray();

		for (int j = 1; j < 25; j++) {
			i.add(String.valueOf(j));
		}

		System.out.println(i);

		ImprovedStringArray i2 = i.clone();

		i.add("ff");
		i2.add("ff");

		System.out.println(i.equals(i2));

		System.out.println("Test");

		ImprovedStringArray first = new ImprovedStringArray();
		ImprovedStringArray second = new ImprovedStringArray();

		first.add("A");

		second.add("B");
		second.add("C");

		System.out.println(first.equals(second));

	}
}
