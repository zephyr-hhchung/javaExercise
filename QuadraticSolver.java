import java.util.Scanner;

public class QuadraticSolver{
	public static void main(String[] args){
		// Print the prompt
		Scanner myScanner = new Scanner(System.in);
		System.out.println("stanCode Quadratic Solver!");

		// Enter a, b, c
		System.out.print("Enter a: ");
		int a = myScanner.nextInt();
		System.out.print("Enter b: ");
		int b = myScanner.nextInt();
		System.out.print("Enter c: ");
		int c = myScanner.nextInt();

		// Calculate discriminant b**2-4*a*c
		double discrim = Math.pow(b, 2) - 4*a*c;
		if (discrim > 0){
			double ans1 = (-b + Math.sqrt(discrim))/(2*a);
			double ans2 = (-b - Math.sqrt(discrim))/(2*a);
			System.out.println("Two root: " + ans1 + " , " + ans2);
		}
		else if (discrim == 0){
			double ans = -b/(2*a);
			System.out.println("One root: " + ans);
		}
		else System.out.println("No real roots");
	}
}

