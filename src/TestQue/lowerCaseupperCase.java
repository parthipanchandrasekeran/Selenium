package TestQue;

public class lowerCaseupperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String normalString = "HeLlo";

		String[] splitWordStrings = normalString.split("");

		for (int i = 0; i < splitWordStrings.length - 1; i++) {

			if (splitWordStrings[i] != splitWordStrings[i].toLowerCase()) {

				System.out.println("Upper Case - " + splitWordStrings[i]);
			} else {
				System.out.println("Lower Case - " + splitWordStrings[i]);

			}
		}
	}

}
