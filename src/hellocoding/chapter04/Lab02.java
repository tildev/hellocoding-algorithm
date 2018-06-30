/**
 * 
 */
package hellocoding.chapter04;

/**
 * @author tildev
 * @data 2018. 6. 30.
 */
public class Lab02 {

	/**
	 * 리스트 안의 모든 원소의 수
	 * 
	 * @param arr
	 * @param arrLen
	 * @return
	 */
	public int numCount(int[] arr, int len) {
		if (len <= 1) {
			return len;
		}
		return 1 + numCount(arr, len - 1);
	}

	public static void main(String[] args) {
		int arr[] = { 2, 4, 6, 10, 11, 12 };
		int result = new Lab02().numCount(arr, arr.length);
		System.out.println(result);
	}
}
