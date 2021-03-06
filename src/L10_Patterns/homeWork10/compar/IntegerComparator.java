package L10_Patterns.homeWork10.compar;

import java.util.Comparator;

public class IntegerComparator extends MyComparator {

	public IntegerComparator(int direction) {
		super(direction);
	}

	public IntegerComparator() {
	}

	@Override
	public int compare(Object obj1, Object obj2) {
		int int1 = (int) obj1;
		int int2 = (int) obj2;

		int result = int1 < int2 ? -1 : int1 == int2 ? 0 : 1;
		return result * getDirection();
	}

	@Override
	public Comparator reversed() {
		return new IntegerComparator(-1);
	}
}
