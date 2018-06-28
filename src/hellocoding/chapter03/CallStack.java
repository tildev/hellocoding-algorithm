/**
 * 
 */
package hellocoding.chapter03;

/**
 * @author tildev
 * @data 2018. 6. 28.
 */
public class CallStack {

	public void greet(String name) {

		System.out.println("hello, " + name + "!");
		greet2(name);
		System.out.println("getting ready to say bye...");
		bye();
	}

	public void greet2(String name) {
		System.out.println("how are you, " + name + "?");
	}

	public void bye() {
		System.out.println("ok bye!");
	}

	public static void main(String[] args) {
		new CallStack().greet("ann");
	}
}
