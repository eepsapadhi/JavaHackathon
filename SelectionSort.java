package javaHackathon;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = { 3, 60, 35, 2, 45, 320, 5 };
		System.out.println("Array befor Selection sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		insertionSort(arr);
		System.out.println("Array after Selection sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
	}

	public static void insertionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int min_index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min_index]) {
					min_index = j;
				}
			}

			if (min_index != i) {
				int temp = arr[i];
				arr[i] = arr[min_index];
				arr[min_index] = temp;
			}
		}

	}

}

		
	}

	
		
	}
}
}


