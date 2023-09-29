import java.util.Scanner;

public class PrimeChecker{
	public static final int STOP = -1;
	public static void main(String args[]){
		// Print the prompt
		System.out.println("Welcome to the prime checker!");
		Scanner myScanner = new Scanner(System.in);

		// Check if the given number is a prime number
		while (true){
			System.out.print("n: ");
			int n = myScanner.nextInt();  // the given number to check
			int factor = n;             // used to check all possible factors of n

			if (n == STOP) break;  // Stop
			else{
				while(true){
					factor -= 1;
					if ((n%factor) == 0){
						if (factor != 1) System.out.println(n + " is a not prime number.");
						else System.out.println(n + " is a prime number.");
						break;
					}
				}
			}
		}
		System.out.print("Have a good one!");
	}
}