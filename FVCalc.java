// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		double startFunds = Double.parseDouble(args[0]);
		double intrest = Double.parseDouble(args[1]);
		double newIntrest = intrest / 100;
		int years = Integer.parseInt(args[2]);
		double futureValue = startFunds * (Math.pow((1 + newIntrest), years));
		System.out.println("After " + years + " years, a $" + (int)startFunds + " " + "saved at " 
		+ intrest + "$25 will yield $" + ((int) futureValue));
	}
}