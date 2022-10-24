package guest_number;

import java.io.InputStream;
import java.util.Scanner;

//IntegerAsker.java
public class IntegerAsker {

	private final Scanner scanner;

	public IntegerAsker(InputStream in) {
		scanner = new Scanner(in);
	}

	public int ask() {
		return scanner.nextInt();
	}

}
