package forTest;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {

		int num = (int) (Math.random() * 11);

		Scanner scan = new Scanner(System.in);
		System.out.println(num);

		System.out.println("A random number was introduced!");
		System.out.println("Write down your guess: ");

		
		int i;
		for (i = 1; i <= 3; i++) {
			int guess = scan.nextInt();
			if (guess != num) {
				System.out.println("You have entered the wrong number, guess again: ");
				
			} else {
				System.out.println("You did it!");
				break;
			}
		}
		if(i == 4) {
			System.out.println("Too bad...");
		}
		scan.close();
	}
}
