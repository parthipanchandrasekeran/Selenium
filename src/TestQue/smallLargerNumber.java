package TestQue;

public class smallLargerNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numberList = { 1, 3, 1, 2, 4, 234, 56 };
		int maxnumber = numberList[0];
		int minNumber = numberList[0];

		for (int i = 1; i <= numberList.length - 1; i++) {

			if (numberList[i] > maxnumber) {
				maxnumber = numberList[i];
			} else if (numberList[i] < minNumber) {
				minNumber = numberList[i];
			}
		}
		System.out.println("max - " + maxnumber + "\nminnumber - " + minNumber);

	}

}
