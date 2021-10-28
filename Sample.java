import java.util.Arrays;
import java.util.Random;

class Utility {
	// Helper method to copy all elements of one array into another
	static void copy_elements(int [] base, int [] target) {
		for(int i = 0; i < base.length; i++) {
			target[i] = base[i];
		}
	}

	// Helper method to find the frequency of each element in an array
	static void find_frequency(int [] arr) {
		int freq[] = new int[arr.length];	// stores frequencies of elements
		int visited = -1;
		System.out.println("  Element : Frequency");
		for(int i = 0; i < arr.length; i++) {
			if(freq[i] == visited) { // already counted
				continue;
			}
			int count = 1;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[j] == arr[i]) {
					count++;
					freq[j] = visited;	// to avoid counting same element again
				}
			}
			freq[i] = count;
			if(freq[i] != visited) {
				System.out.println("\t" + arr[i] + " : " + freq[i]);
			}
		}
	}

	// Helper method to left rotate the 
	static void rotate(int [] arr, char orientation) {
		int length = arr.length;
		if(orientation == 'l') {
			int first_element = arr[0];
			for(int i = 0; i < length; i++) {
				arr[i] = arr[(i+1) % arr.length];
			}
			arr[length - 1] = first_element;
		}
		else if(orientation == 'r') {
			int last_element = arr[length - 1];
			for(int i = length - 1; i > 0; i--) {
				arr[i] = arr[i-1];
			}
			arr[0] = last_element;
		}
	}

	// Helper program to print the elements of an array
	static void print_array(int [] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	// Helper program to print the elements of an array in reverse order
	static void print_array_reverse(int [] arr) {
		for(int i = arr.length-1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	// Helper program to print the elements of an array in reverse order
	static void print_array_even(int [] arr) {
		for(int i = 1; i < arr.length; i+=2) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	// Helper program to print the elements of an array in reverse order
	static void print_array_odd(int [] arr) {
		for(int i = 0; i < arr.length; i+=2) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	// Helper function to return the largest element in an array
	static int max(int [] arr) {
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	// Helper function to return the smallest element in an array
	static int min(int [] arr) {
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	// Helper function to return the sum of elements of an array
	static int sum(int [] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++)
			sum += arr[i];
		return sum; 
	}

	// Helper function to return the number of elements of an array
	static int num(int [] arr) {
		int num = 0;
		for(int i:arr) {
			num++;
		}
		return num;
	}
}

class Sample {
	public static void main(String [] args) {
		// 1) Copy all elements of one array into another array
		int base_array[] = {2, 3, 5, 7, 11, 13, 17, 19};
		System.out.print("Base Array: ");
		System.out.println(Arrays.toString(base_array));
		int target_array[] = new int[base_array.length];
		Utility.copy_elements(base_array, target_array);
		System.out.print("Target Array: ");
		System.out.println(Arrays.toString(target_array));


		// 2) Find the frequency of each element in an array
		int sample_array_1[] = {3, 4, 3, 4, 5, 7, 4, 3, 3, 7, 9};
		Utility.find_frequency(sample_array_1);


	
		// 3) Left Rotate the elements of an array
		int sample_array_2[] = {1, 2, 3, 4, 5};
		System.out.println("Original Array: " + Arrays.toString(sample_array_2));
		Utility.rotate(sample_array_2, 'l');
		System.out.println("Left Rotation: " + Arrays.toString(sample_array_2));

		
		
		// 4) Right Rotate the elements of an array
		int sample_array_3[] = {1, 2, 3, 4, 5};
		System.out.println("Original Array: " + Arrays.toString(sample_array_3));
		Utility.rotate(sample_array_3, 'r');
		System.out.println("Right Rotation: " + Arrays.toString(sample_array_3));



		int sample_array_4[] = {7, 8, 9, 10, 11, 12, 13};

		// 5) Print the elements of an array
		System.out.println("Array:");
		Utility.print_array(sample_array_4);
		
		
		// 6) Print the elements of an array in reverse order
		System.out.println("Array in Reverse Order:");
		Utility.print_array_reverse(sample_array_4);

		
		// 7) Print array elements on even position
		System.out.println("Array elements on even position:");		
		Utility.print_array_even(sample_array_4);


		// 8) Print array elements on odd position
		System.out.println("Array elements on odd position:");
		Utility.print_array_odd(sample_array_4);


		// Generate a Random array of integers
		int random_array[] = new Random().ints(10,1,100).toArray();
		System.out.println("Random Array: " + Arrays.toString(random_array));
		
		// 9) Print the largest element in an array
		System.out.println("Maximum element in Random Array: " + Utility.max(random_array));


		// 10) Print the smallest element in an array
		System.out.println("Minimum element in Random Array: " + Utility.min(random_array));

		// 11) Number of elements in an array
		System.out.println("Number of elements in Random Array: " + Utility.num(random_array));

		// 12) Sum of all the items of an array:
		System.out.println("Sum of elements in Random Array: " + Utility.sum(random_array));
	}
}