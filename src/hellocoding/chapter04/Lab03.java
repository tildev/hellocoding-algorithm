/**
 * 
 */
package hellocoding.chapter04;

/**
 * @author tildev
 * @data 2018. 6. 30.
 */
public class Lab03 {

	/**
	 * x와 y 중 max 값 return
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public int max(int x, int y) {
		return x < y ? y : x;
	}

	/**
	 * 리스트에서 가장 큰 숫자 출력
	 * 
	 * @param i
	 * @param arr
	 * @return
	 */
	public int maxArr(int[] arr, int arrIndex) {
		if (arrIndex == 1) {
			return arr[0];
		}
		return max(arr[arrIndex - 1], maxArr(arr, arrIndex - 1));
	}

	public static void main(String[] args) {
		int arr[] = { 13, 2, 4, 17, 6 };
		int result = new Lab03().maxArr(arr, arr.length);
		System.out.println(result);
	}
}
