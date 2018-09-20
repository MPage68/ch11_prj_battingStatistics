import java.util.Arrays;
import java.util.Scanner;

public class BattingStatisticsApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String choice = "y";
		double slugging = 0.0;
		double battingAvg = 0.0;
		int size = 0;
		int result = 0;

		System.out.println("Welcome to the batting average calculator");
		System.out.println();
		System.out.print("Enter number of times at bat:  ");
		size = sc.nextInt();
		System.out.println("0 = out, 1 = single, 2 = double, 3 = triple, 4 = home run");

		while (choice.equalsIgnoreCase("y")) {

			int[] atBats = new int[size];
			for (int i = 0; i < size; i++) {
				// atBats[i] = i;

				System.out.print("Result for at-bat: ");
				atBats[i] = sc.nextInt();
				result += atBats[i];

				battingAvg = result / size;
				battingAvg = (double) Math.round(battingAvg * 100) / 100;
				

			}

			System.out.println("Batting average: " + battingAvg);

		}
		// choice = Console.getString("Another player? (y/n)", "y", "n");

		System.out.println("Bye");

	}
}
