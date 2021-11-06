package week1.day1;

public class PrimeNumberOrNot {

	public static void main(String[] args) {
		int n = 13, x;
		boolean flag = false;
		x = n/2;
		for (int i = 2; i<=x; i++) {
			if(n%i==0) {
				System.out.println(n + " is not a prime number");
				flag = true;
				break;
			}
		}
		if(flag == false) {
			System.out.println(n + " is a prime number");
		}
	}

}
