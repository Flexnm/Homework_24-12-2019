package forTest;

import java.util.Arrays;


public class Ex1 {
	public static void main(String[] args) {
		
		int[] intArr = new int[5];
		//Random rand = new Random();
		double avg = 0;
		
		int index = 0;
		int five = 0;
		int max = 0;
		int min = 10;
		
		while(index < intArr.length) {
			int x = (int)(Math.random()*10 + 1);
			int i;
			for (i = 0; i < intArr.length; i++) {
				if(intArr[i] == x) {
					break;
				}
			}
			
			if(i == intArr.length) {
				intArr[index] = x;
				index++;
				avg += x;
				if(x > 5) {
					five++;
				}
				for (int j = 0; j < intArr.length; j++) {
					if(x > max) {
						max = x;
					} else if(x < min) {
						min = x;
					}
				}
			}
		}
		System.out.println(Arrays.toString(intArr));
		System.out.println(max);
		System.out.println(min);
		System.out.println(avg/intArr.length);
		System.out.println(five);
		
		
	}

}
