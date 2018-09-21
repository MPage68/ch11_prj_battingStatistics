import java.util.Arrays;
import java.util.Scanner;

public class BattingStatisticsApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String choice = "y";
		double slugging = 0;
		int sluggingTotal = 0;
		double battingAvg = 0;
		int size = 0;
		int result = 0;

		System.out.println("Welcome to the batting average calculator");
		System.out.println("");
		System.out.print("Enter number of times at bat:  ");		
		size = sc.nextInt();
		System.out.println();
		System.out.println("0 = out, 1 = single, 2 = double, 3 = triple, 4 = home run");
		System.out.println();
		while (choice.equalsIgnoreCase("y")) {

			int[] atBats = new int[size];
			for (int i = 0; i < size; i++) {

				System.out.print("Result for at-bat: ");
				atBats[i] = sc.nextInt();
				sluggingTotal += atBats[i];
				if (atBats[i] > 0) {
					result++;
				}

				battingAvg = (double) result / size;
				battingAvg = (double) Math.round(battingAvg * 1000) / 1000;

				slugging = (double) sluggingTotal / size;
				slugging = (double) Math.round(slugging * 1000) / 1000;

			}
			System.out.println();
			System.out.println("Batting average: " + battingAvg);
			System.out.println("Slugging percent: " + slugging);
			System.out.println();
			choice = Console.getString("Another player? (y/n)  ", "y", "n");
		}

		System.out.println("Bye");

	}
}
