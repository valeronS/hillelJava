package L11_collections;

import L10_Patterns.homeWork10.TheItem;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList list = new ArrayList(20);

		ArrayList<TheItem> list2 = new ArrayList<>();

		list2.add(new TheItem());

//		list2.add(5);

		list.add(5);
		list.add(8);



		System.out.println(list);
	}


}