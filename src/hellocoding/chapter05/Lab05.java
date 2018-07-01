/**
 * 
 */
package hellocoding.chapter05;

/**
 * @author tildev
 * @data 2018. 6. 30.
 */
public class Lab05 {

	private static final int HASH_TABLE_SIZE = 10;

	public int primeNumber(int n) {
		boolean flag;
		int count = 0;
		int result = 0;
		for (int i = 2; i <= 100; i++) {
			flag = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				count += 1;
			}
			if (count == n) {
				result = i;
				break;
			}
		}
		return result;
	}

	public int distribution(String s) {
		s = s.toLowerCase();
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			sum += primeNumber(s.charAt(i) - '`');
		}
		return sum % HASH_TABLE_SIZE;
	}

	public static void main(String[] args) {
		int result = new Lab05().distribution("bag");
		System.out.println(result);
	}

}
