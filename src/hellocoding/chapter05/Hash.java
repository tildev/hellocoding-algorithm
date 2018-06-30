/**
 * 
 */
package hellocoding.chapter05;

import java.util.HashSet;
import java.util.Set;

/**
 * @author tildev
 * @data 2018. 6. 30.
 */
public class Hash {

	public void ckVoter(String name, Set<String> voted) {
		if (voted.contains(name)) {
			System.out.println("쫒아내세요!");
		} else {
			voted.add(name);
			System.out.println("투표하게 하세요.");
		}
	}

	public static void main(String[] args) {
		Set<String> voted = new HashSet<>();
		new Hash().ckVoter("tom", voted);
		new Hash().ckVoter("mike", voted);
		new Hash().ckVoter("mike", voted);
	}

}
