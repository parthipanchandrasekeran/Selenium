package TestQue;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SmallLarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] numberList = { 2, 1, 3, 5, 2, 7, 9 };

		List<Integer> setArray = Arrays.asList(numberList);
		setArray.sort(Comparator.reverseOrder());
		System.out.println(setArray.get(0) + " - maximum");
		System.out.println(setArray.get(setArray.size() - 1) + " - minimum");

	}

}
