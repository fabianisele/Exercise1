import java.util.Scanner;

/**
 * 
 */

/**
 * @author Tobias
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello ASE2015 - how are you? :)");
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter your name:");
		String name = in.nextLine();
		in.close();
		HelloUser user = new HelloUser(name);
		user.greetUser();
	}

}
