//package edu.usfca.cs.cs245;

import java.util.Arrays;

public class BinaryIterativeSearch implements Practice2Search {

	/*
	Always remove all TODO's from code.  Highly unprofessional to have TODO's in code.
	*/
	@Override
	public String searchName() {
		// TODO Auto-generated method stub
		return "this is a binary iterative search";
	}

	/*
	Be consistent with spaces.  If you want to have a line before any declarations
	in each function then make sure there is exactly one line.
	*/
	@Override
	public int search(int[] arr, int target) {
		
		
		int start = 0;
		int end = arr.length-1;
		while(end >= start) {

			int midPoint = (start+end)/2;
			if(arr[midPoint] == target) {
				return midPoint;
			}/*
			Conventionally connected conditionals should not have white space inbetween them
			This is more common when they are all together, but in this case the logic is 
			connected and so they should be as if they are connected.
			*/
			
			if(arr[midPoint] > 0) {
				end = midPoint-1;
			}else {
				start = midPoint-1;
			}
		}
		
		return -1;
	}


}
