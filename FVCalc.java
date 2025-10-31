// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]); //the invested sum
		double rate = Double.parseDouble(args[1]); // precentage
		int n = Integer.parseInt(args[2]); // number of years
		rate = rate/100;
		double futureValue = currentValue * Math.pow((1 + rate), n);
		System.out.println("After " +  n + " years, $" + currentValue + " saved at %" + rate*100  + " will yield $"+ ((int)futureValue));

		

	}
}