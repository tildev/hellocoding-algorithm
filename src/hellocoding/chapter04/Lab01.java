/**
 * 
 */
package hellocoding.chapter04;

/**
 * @author tildev
 * @data 2018. 6. 30.
 */
public class Lab01 {

	/**
	 * 배열 값 전체를 재귀로 표현.
	 * 
	 * @param i
	 * @param arr
	 * @return
	 */
	public int sum(int i, int[] arr) {
		if (i == arr.length - 1) {
			return arr[i];
		}
		return arr[i] + sum(i + 1, arr);
	}

	public static void main(String[] args) {
		int arr[] = { 2, 4, 6 };
		int result = new Lab01().sum(0, arr);
		System.out.println(result);
	}
}
