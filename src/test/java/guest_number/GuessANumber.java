package guest_number;

import java.util.Random;
import java.util.Scanner;

//GuessANumber.java
/*
 * iturriak
 * https://gist.github.com/JordanTFA/8e6f32bf1a114eed48c762c7fda4d5e8
 */
public class GuessANumber {

	final static String WON = "You won!";
	final static String LOST = "Oh no! You lost!";
	static Scanner scanner;

	public static String guess() {

		System.out.println("Enter a number");
		scanner = new Scanner(System.in);
		int sysGuess = new Random().nextInt(2);

		int count = 0;
		while (count <= 3) {
			int myguess = scanner.nextInt();

			if (sysGuess == myguess) {
				System.err.println("Well Done");
				return WON;
			} else {
				System.err.println("Try again");
			}
			count++;
		}

		scanner.close();

		return LOST;
	}
}