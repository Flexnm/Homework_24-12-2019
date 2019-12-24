package forTest;

import java.util.Arrays;

public class Ex2 {
	public static void main(String[] args) {
		
	int[] intArr = new int[10]; // creating the array.
	
	for (int i = 0; i < intArr.length; i++) {
		intArr[i] = (int)(Math.random()*5 + 1); // adding the elements to the array in a 'for' loop.
	}
	System.out.println(Arrays.toString(intArr)); // printing the array to see how it looks.
	
	
	int index = 1; // start an index at 1
	while(index <= 5) { // run a 'while' loop for all the numbers 1, 2, 3, 4 and 5.
		int counter = 0; // start a counter for the digits at 0.
		for (int i = 0; i < intArr.length; i++) { // look through the whole array.
			if(intArr[i] == index) { // if an element in the array is equal to the index.
				counter++; // count it as such.
			}
		}
		System.out.println("The number " + index + " appears " + counter + " times."); // printing while in the 'while' loop.
		index++; // advancing the index.
		}
	}
}
