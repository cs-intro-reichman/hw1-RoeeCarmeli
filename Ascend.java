// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int number = Integer.parseInt(args[0]);
		int a = (int) (Math.random() * number);
		int b = (int) (Math.random() * number);
		int c = (int) (Math.random() * number);
		System.out.println(a + " " + b + " " + c);
		
		int max1 = Math.max(a, b);
		int max2 = Math.max(max1, c);
		int min1 = Math.min(a, b);
		int min2 = Math.min(min1, c);

		int middle = a + b + c - max2 - min2;
		System.out.println(min2 + " " + middle + " " + max2);
	}
}
