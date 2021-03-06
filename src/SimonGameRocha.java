import java.util.Scanner;

public class SimonGameRocha {

	public static void main(String[] args) {

		final String[] colors = { "red", "green", "yellow", "blue" };
		boolean won = false;

		Scanner in = new Scanner(System.in);

		System.out.print("How many colors you would like to try to remember?: ");

		int numOfColors = in.nextInt();

		String randomColors[] = new String[numOfColors];

		System.out.println("\nHere is the random sequence generated by the computer: ");

		for (int pos = 0; pos < randomColors.length; pos++) {
			randomColors[pos] = colors[(int) (Math.random() * colors.length)];
			System.out.print(randomColors[pos] + ' ');
		}

		System.out.println();
		System.out.println(
				"\nYou are going to be tested! Please enter the colors in the order it was presented. After each color, hit ENTER!");
		in.nextLine();

		for (int guess = 0; guess < randomColors.length; guess++) {
			System.out.print("Enter color[" + (guess + 1) + "]: ");
			String userGuess = in.nextLine();
			if (!userGuess.equalsIgnoreCase(randomColors[guess])) {
				System.out.println("You lost!");
				won = false;
				break;
			}
			won = true;
		}

		if (won)
			System.out.println("You won!!!");
		in.close();

	}
}