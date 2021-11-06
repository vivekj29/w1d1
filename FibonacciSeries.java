package week1.day1;

import java.util.Iterator;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1;
		int sum;
		System.out.println(n1);
		for (int i=0; i<7; i++) {
			System.out.println(+n2);
			sum = n1+n2;
			n1 = n2;
			n2 = sum;
		}
		

	}

}
