package forTest;

import java.util.Arrays;

public class Ex2 {
	public static void main(String[] args) {
		
	int[] intArr = new int[10];
	
	for (int i = 0; i < intArr.length; i++) {
		intArr[i] = (int)(Math.random()*5 + 1);
	}
	System.out.println(Arrays.toString(intArr));
	
	
	int index = 1;
	while(index <= 5) {
		int counter = 0;
		for (int i = 0; i < intArr.length; i++) {
			if(intArr[i] == index) {
				counter++;
			}
		}
		System.out.println("The number " + index + " appears " + counter + " times.");
		index++;
	}
	
	

	
	
	
	
	
	}
}
