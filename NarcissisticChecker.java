import java.util.Scanner;

public class NarcissisticChecker{
	public static final int STOP = -100;
	public static void main(String args[]){
		// Print the prompt
		System.out.println("Welcome to the Narcissistic number checker!");
		Scanner myScanner = new Scanner(System.in);

		// Check if the given number is a Narcissistic number
		while (true){
			System.out.print("n: ");
			int number = myScanner.nextInt();  // the given number to check
			int digit = 0;                     // the digit of the number N
			int count = 0;                     // the sum of the number in each digit
			int nTemp = number;                // the temp number used fr calculation

			// Count the digit of the number
			while (true){
				digit += 1;
				nTemp = nTemp/10;
				if (nTemp < 10){
					digit += 1;
					break;
				}
			}

			int nPower = digit;  // the power N
			nTemp = number;      // re-assign the variable to the input number

			if (number == STOP) break;  // Stop
			else{
				while (true){
					count += Math.pow((nTemp%10), nPower);  // count the sum of each digit**N
					nTemp = nTemp/10;
					digit -= 1;
					if (digit == 0) break;
				}
				if (count == number) System.out.println(number + " is a narcissistic number");
				else System.out.println(number + " is not a narcissistic number");
			}

		}
		System.out.print("Have a good one!");
	}
}