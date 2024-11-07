// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
	double startFunds = Double.parseDouble(args[0]);
	double intrest = Double.parseDouble(args[1]) / 100;
	int years = Integer.parseInt(args[2]);
	double futureValue = startFunds * (Math.pow((1 + intrest), years));
	System.out.println((int) futureValue);
	}
}