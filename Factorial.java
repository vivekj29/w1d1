package week1.day1;

public class Factorial {

	public static void main(String[] args) {
		int n = 5; int fact = 1;
		for (int i=1; i<=n; i++) {
			fact = fact*i;
			//fact = 1*1
			//fact = 1*2
			//fact = 2*3
			//fact = 6*4
			//fact = 24*5
		}
		System.out.println("The factorial of " + n + " is " + fact);
	}

}
