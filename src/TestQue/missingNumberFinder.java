package TestQue;

public class missingNumberFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numberListOrder = { 1, 2, 4, 5, 6, 7, 8, 9, 10 };

		int total = 0;

		for (int i = 1; i <= numberListOrder.length + 1; i++) {

			total = total + i;
		}

		for (int i = 0; i <= numberListOrder.length - 1; i++) {

			total = total - numberListOrder[i];
		}

		System.out.println(total);
	}

}
