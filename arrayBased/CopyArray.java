package arrayBased;

import java.util.Arrays;

public class CopyArray {
	public static void main(String[] args) {
		int [] original = {1,2,3,4,5,6};
		int [] copy = new int[original.length];
		
		for(int i=0; i<original.length; i++) {
			copy[i] = original[i];
		}
		
		System.out.println("Original array"+ Arrays.toString(original));
		System.out.println("Copy Array" + Arrays.toString(copy));
	}

}
