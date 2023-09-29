import java.util.Scanner;

public class WeatherMaster{
	public static final int STOP = -1;
	public static void main(String args[]){
		Scanner myScanner = new Scanner(System.in);

		// Print the prompt
		System.out.println("stanCode \"Weather Master 4.0!\"");

		// Define quantities
		int n = 0;         // n temperature infos
		int tHigh = 0;     // highest t
		int tLow = 0;      // lowest t
		int dAlert = 0;    // days when t < 16 deg
		double tAvg = 0.;  // average t

		// Enter the weather infos
		while (true){
			System.out.print("Next Temperature: (or " + STOP + " to quit)? ");
			int t = myScanner.nextInt();

			if (t == STOP) break;  // Stop
			else{                  // enter a temperature info
				n += 1; 
				tAvg += t;
				if (t < 16) dAlert += 1;
				if (n != 1){
					if (tHigh < t) tHigh = t;
					if (tLow > t) tLow = t;}
				else{
					tHigh = t;
					tLow = t;}
			}
		}
		// Print the calculations
		if (n == 0) System.out.println("No temmperature were entered. ");
		else{
			System.out.println("Highest temperature = " + tHigh);
			System.out.println("Lowest temperature = " + tLow);
			System.out.println("Average = " + (tAvg/n));
			System.out.println(dAlert + " cold day(s) ");
		}
	}
}