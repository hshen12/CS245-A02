package edu.usfca.cs.cs245;

import java.util.Arrays;

public class BinaryIterativeSearch implements Practice2Search {

	@Override
	public String searchName() {
		// TODO Auto-generated method stub
		return "this is a binary iterative search";
	}

	@Override
	public int search(int[] arr, int target) {
		
		
		int start = 0;
		int end = arr.length-1;
		while(end >= start) {

			int midPoint = (start+end)/2;
			if(arr[midPoint] == target) {
				return midPoint;
			}
			
			if(arr[midPoint] > 0) {
				end = midPoint-1;
			}else {
				start = midPoint-1;
			}
		}
		
		return -1;
	}


}
