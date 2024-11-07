// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		double totalBill = Double.parseDouble(args[3]);
		double splitBill = totalBill / 3.0;
		double newBill = Math.ceil(splitBill);
		System.out.println("dear " + name1 + " " + name2 + " and" + name3 + ": pay " + newBill + " Shekels each");
	}
}
