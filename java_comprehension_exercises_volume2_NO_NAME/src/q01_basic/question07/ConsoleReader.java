package q01_basic.question07;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleReader {
	public int inputNumber() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		return Integer.parseInt(br.readLine());
	}

}
