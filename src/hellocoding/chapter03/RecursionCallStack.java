/**
 * 
 */
package hellocoding.chapter03;

/**
 * @author tildev
 * @data 2018. 6. 28.
 */
public class RecursionCallStack {

	public int fact(int x) {

		if (x == 1) {
			return 1;
		} else {
			return x* fact(x-1);
		}
	}

	public static void main(String[] args) {
		int result = new RecursionCallStack().fact(3);
		System.out.println(result);
	}
}
