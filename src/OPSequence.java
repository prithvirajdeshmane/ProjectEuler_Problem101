
public class OPSequence {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			double val = findQuadraticVal(i);
			System.out.println(val);
		}
	}

	private static double findQuadraticVal(int n) {
		
		double n1, n2, n3, n4, n5, n6, n7, n8, n9, n10;
		
		n1 = findExponentialVal(n, 1);
		n2 = findExponentialVal(n, 2);
		n3 = findExponentialVal(n, 3);
		n4 = findExponentialVal(n, 4);
		n5 = findExponentialVal(n, 5);
		n6 = findExponentialVal(n, 6);
		n7 = findExponentialVal(n, 7);
		n8 = findExponentialVal(n, 8);
		n9 = findExponentialVal(n, 9);
		n10 = findExponentialVal(n, 10);
		
		//System.out.println("1 - " + n1 + " + " + n2 + " - " + n3 + " + " + n4 + " - " + n5 + " + " + n6 + " - " + n7 + " + " + n8 + " - " + n9 + " + " + n10);
		
		double seqVal = 1 - n1 + n2 - n3 + n4 - n5 + n6 - n7 + n8 - n9 + n10;
		return seqVal;
	}

	private static double findExponentialVal(double n, double i) {
		return Math.pow(n, i);
	}

}
