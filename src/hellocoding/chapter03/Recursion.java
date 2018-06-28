/**
 * 
 */
package hellocoding.chapter03;

/**
 * @author tildev
 * @data 2018. 6. 28.
 */
public class Recursion {

	public void countDown(int i) {
		System.out.println(i);

		if (i <= 1) {
			return;
		} else {
			countDown(i-1);
		}
	}

	public static void main(String[] args) {
		new Recursion().countDown(3);
	}
}
