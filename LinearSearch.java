//package edu.usfca.cs.cs245;

public class LinearSearch implements Practice2Search {

	@Override
	public String searchName() {
		
		
		
/*
Way too much whitespace
*/
		return "this is a linear search";
	}

	@Override
	public int search(int[] arr, int target) {

		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == target) {
				return i;
			}
		}
		return -1;

	}

}
