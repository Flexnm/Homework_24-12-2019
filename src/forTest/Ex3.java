package forTest;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {

		int num = (int) (Math.random() * 11); // pick a random number (in this case between 0 to 10).

		Scanner scan = new Scanner(System.in); // start a scanner object to recieve keyboard input.
		// System.out.println(num); // print the number for myself to test the program.

		System.out.println("A random number was introduced!"); // print out scenario
		System.out.println("Write down your guess: "); // print instructions.

		
		int i; // initialize 'i' outside the 'for' loop so it could be used outside of it.
		for (i = 1; i <= 3; i++) { // run the loop exactly 3 times.
			int guess = scan.nextInt(); // the input is taken in the loop itself.
			if (guess != num) { // if user guesses wrong.
				System.out.println("You have entered the wrong number, guess again: "); // print to retry.
				
			} else { // if user guesses right.
				System.out.println("You did it!"); // print success.
				break; // and exit the for loop.
			}
		}
		if(i == 4) { // if the user failed 3 times (aka, 'i > 3'.
			System.out.println("Too bad..."); // print failiure.
		}
		scan.close(); // end the scanner operation whether there was success or failiure.
	}
}
