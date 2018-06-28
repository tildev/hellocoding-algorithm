/**
 * 
 */
package hellocoding.chapter02;

/**
 * @author tildev
 * @data 2018. 6. 28.
 */
public class SelectionSort {

	public void selectionSort(int[] arr) {
		int size = arr.length;
		int min;
		int temp;

		for (int i = 0; i < size - 1; i++) {
			min = i;
			for (int j = i + 1; j < size; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}

	}

	public static void main(String[] args) {
		int myList[] = { 5, 3, 6, 2, 10 };
		new SelectionSort().selectionSort(myList);

		for (int i : myList) {
			System.out.println(i);
		}
	}
}
