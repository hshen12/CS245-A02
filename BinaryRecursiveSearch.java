package edu.usfca.cs.cs245;

import java.util.Arrays;

public class BinaryRecursiveSearch implements Practice2Search {

	@Override
	public String searchName() {

		return "this is a binary recursive searchs";
	}

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
