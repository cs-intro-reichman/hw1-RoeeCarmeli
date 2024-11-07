// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		int fullNum = Integer.parseInt(args[0]);
		fullNum = fullNum % 1000;
		int hundreds = fullNum / 100;
		fullNum = fullNum % 100;
		int tens = fullNum / 10;
		fullNum = fullNum % 10;
		System.out.println(hundreds + " hundreds, " + tens + " tens, and " + fullNum + " ones.");
	}
}
