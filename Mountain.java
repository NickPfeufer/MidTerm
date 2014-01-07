public class Mountain {
	public static boolean isIncreasing(int[] array, int stop){
		for (int i = 0; i< stop; i++) {
			if (!(array[i] < array[i+1])) {
				return false;
			}			
		}
		return true;
	}

	public static boolean isDecreasing(int[] array, int start){
		for (int i = start; i < array.length-1; i++) {
			if (!(array[i] > array[i+1])) {
				return false;
			}			
		}
		return true;
	}

	public static int getPeakIndex(int[] array){
		for (int i = 0; i<array.length; i++) {
			if (i == 0) {
				if (array[i] > array[i + 1]) {
					return i;
				}
				
			}else{
				if (array[i] > array[i-1] && array[i] > array[i + 1]) {
					return i;
				}				
			}

		}
		return -1;
	}

	public static boolean isMountain(int[] array){
		int peak = getPeakIndex(array);
		System.out.println(peak);
		if (peak == -1) {
			return false;
		}
		if (isIncreasing(array, peak) && isDecreasing(array, peak)) {
			return true;
		}
		return false;
	}

	public static void printMountain(int[] array){
		for (int i = 0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println();
		if (isMountain(array)) {
			System.out.println(" is a Mountain");
		}else {
			System.out.println(" no, no, no, not Mountain");
		}
	}
	public static void main(String[] args) {
		int[] bob = {1,2,3,4,5,6,7,8,9,8,7,6,5,4,3,2,1};
		int[] blue = {1,2,3,4,3,2,3};
		int[] goal = {9,1,2,3,4,5,5,4,3,2,1};
		int[] card = {11, 22, 11, 22, 11};
		printMountain(bob);
		printMountain(blue);
		printMountain(goal);
		printMountain(card);
	}
}