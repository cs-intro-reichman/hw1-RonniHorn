// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int num = Integer.parseInt(args[0]);
		int hundred = num / 100;
		int ten = (num / 10) - hundred*10;
		int unit = num % 10;
		System.out.println(hundred + " hundreds, " + ten + " tens, and " + unit + " ones.");
	}
}