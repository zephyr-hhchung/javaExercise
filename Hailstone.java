import java.util.Scanner;


public class Hailstone{
	public static void main(String args[]){
		// Print the prompt
		System.out.println("This program computes Hailstone sequences.");
		System.out.println(" ");

		// Enter the number n
		Scanner myScanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = myScanner.nextInt();
		int nSteps = 0;    // the steps
		int nPre = n;      // used to record previous n 

		// The Hailstone sequence
		while (n != 1){
			// if n is odd
			if (n % 2 != 0){
				n = 3*n + 1;
				System.out.println(nPre+" is odd, so I make 3n+1: "+n);
			}
			// if n is even
			else{
				n = n/2;
				System.out.println(nPre+" is even, so I take half: "+n);
			}
			nSteps += 1;
			nPre = n;
		}
		System.out.println("It took " + nSteps + " steps to reach 1.");
	}
}