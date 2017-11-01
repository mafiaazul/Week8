import java.util.Scanner;

public class SimonGameRocha {

	public static void main(String[] args) {

		final String[] colors = {"red", "green", "yellow", "blue"};
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("How many colors you would like to try to remember?: ");
		
		int numOfColors = in.nextInt();
		
		String randomColors[] = new String[numOfColors];
		
		for (int pos = 0; pos < randomColors.length; pos++) {
			randomColors[pos] = colors[(int)(Math.random() * colors.length)];
			System.out.print(randomColors[pos] + ' ');
		}
		
		System.out.println();
		System.out.println("You are going to be tested! Please enter the colors in the order it was presented. After each color, hit ENTER!");
		
		in.close();
		
	}

}
