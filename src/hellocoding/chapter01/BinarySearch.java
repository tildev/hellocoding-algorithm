/**
 * 
 */
package hellocoding.chapter01;

/**
 * @author tildev
 * @data 2018. 6. 25.
 */
public class BinarySearch {
	/**
	 * O(log n)
	 * 
	 * @param list
	 * @param item
	 * @return
	 */
	public int bs(int[] list, int item) {
		int low = 0;
		int high = list.length - 1;
		int mid = 0;
		while (low <= high) {
			mid = (low + high) / 2;

			if (list[mid] == item) {
				return mid;
			} else if (list[mid] > item) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		int myList[] = { 1, 3, 5, 7, 9 };
		int result = new BinarySearch().bs(myList, 3);
		int result1 = new BinarySearch().bs(myList, -1);

		System.out.println(result);
		System.out.println(result1);
	}
}
