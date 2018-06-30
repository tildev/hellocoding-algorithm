/**
 * 
 */
package hellocoding.chapter04;

/**
 * @author tildev
 * @data 2018. 6. 30.
 */
public class QuickSort {

	public void quickSort(int arr[], int left, int right) {
		if (left < right) {
			int pivot = partition(arr, left, right);
			quickSort(arr, left, pivot - 1);
			quickSort(arr, pivot + 1, right);
		}
	}

	public int partition(int arr[], int left, int right) {

		int pivot = arr[(left + right) / 2];

		while (left < right) {
			while ((arr[left] < pivot) && (left < right))
				left++;
			while ((arr[right] > pivot) && (left < right))
				right--;

			if (left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
		}

		return left;
	}

	public static void main(String[] args) {
		int arr[] = { 66, 10, 1, 34, 5, -10, 2, 3 };
		new QuickSort().quickSort(arr, 0, arr.length - 1);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
