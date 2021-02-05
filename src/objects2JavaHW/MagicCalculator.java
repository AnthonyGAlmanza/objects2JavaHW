package objects2JavaHW;

public class MagicCalculator extends Calculator {
	
	public static double findSquareRoot(double number){
		double j;
		double squareroot = number / 2;
		do {
			j = squareroot;
			squareroot = (j + (number / j)) / 2;
		}
		while ((j - squareroot) != 0);
		return squareroot;
			
	}
	
	public static double findSine(double number){
		double sine = (double) Math.sin(number);
		return sine;
	}
	
	public static double findCosine(double number) {
		double cosine = (double) Math.cos(number);
		return cosine;
	}
	
	public static double findTangent(double number) {
		double tangent = (double) Math.tan(number);
		return tangent;
	}
	
	public static int findFactorial(int number) {
		int factorial = 1;
		for(int i = 1; i <= number; i++) {
			factorial *= i;	
		}
		return factorial; 
	}	

}
