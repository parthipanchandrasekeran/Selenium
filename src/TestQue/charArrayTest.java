package TestQue;

import java.util.LinkedHashMap;
import java.util.Map;

public class charArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String valueString = "i love coding coding love me";
		char[] charArray = valueString.toCharArray();
		System.out.println(charArray[1]);
		Map<Character, Integer> sortedMap = new LinkedHashMap<>();
		for (char letter : charArray) {

			if (sortedMap.containsKey(letter) == false) {

				sortedMap.put(letter, 1);
			} else {
				sortedMap.put(letter, sortedMap.get(letter) + 1);
			}
		}

		sortedMap.forEach((letter, count) -> {

			if (count > 1 && letter != ' ') {

				System.out.println(letter);
			}
		});
	}

}
