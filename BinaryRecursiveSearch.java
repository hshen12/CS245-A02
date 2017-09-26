//package edu.usfca.cs.cs245;

import java.util.Arrays;

public class BinaryRecursiveSearch implements Practice2Search {

	@Override
	public String searchName() {

		return "this is a binary recursive searchs";
	}

	/*
	If a conditional is only one line, it makes sense to not have extra space before the return.
	Also, be consistent across files as well on how you format whitespace
	in your iterative your if, else looks like:
	if(...) {
		...
	}else {
		...
	}
	with no space before the else.
	*/
	@Override
	public int search(int[] arr, int target) {

		int min = 0;
		int max = arr.length-1;
		int mid = (min + max)/2;
		if(arr.length == 0){
			return -1;
		}
		if(arr[mid] == target) {

			return mid;
		}
		
		if(arr[mid] > target) {

			return search(Arrays.copyOfRange(arr, 0, mid), target);
		} else {

			return search(Arrays.copyOfRange(arr, mid, max), target);
		}
		
	}
}
