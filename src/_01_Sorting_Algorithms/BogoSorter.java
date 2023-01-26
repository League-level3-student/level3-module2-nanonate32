package _01_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
	public BogoSorter() {
		type = "Bogo";
	}

	/*
	 * Bogo sort is a joke sorting algorithm. It is considered the most inefficient
	 * sorting algorithm while still maintaining the possibility of eventually
	 * sorting data.
	 * 
	 * It works by following these steps: STEP 1. Is the array in order? if yes,
	 * finished; if no, go to step 2. STEP 2. Take two random elements in the array
	 * and swap them. STEP 3. Go back to step 1.
	 */
	@Override
	void sort(int[] array, SortingVisualizer display) {
		boolean shouldSwap = false;
		while (true) {
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i+1]) {
					shouldSwap = true;
					break;
				}
			}
			if (shouldSwap) {
				Random r = new Random();
				int a = r.nextInt(array.length);
				int b = r.nextInt(array.length);
				int temp = array[a];
				array[a] = array[b];
				array[b] = temp;
				shouldSwap = false;
			} else {
				break;
			}
			display.updateDisplay();
		}
//    	 for (int i = 0; i < array.length; i++) {
//    	 for(int k = 0; k < array.length -1; k++) {
//         	if((array[k] > array[k+1] )) {
//         		
//         		int temp = array[new Random().nextInt(array.length)];
//         		array[new Random().nextInt(array.length)] = array[new Random().nextInt(array.length)];
//         		array[new Random().nextInt(array.length)] = temp;
//         		
//         		
//         		 
//         	    	
//         	
//         	
//         	 
//         	 display.updateDisplay();
//         	}
//    	 }
	}
}
