import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.Math.log;

public class BinaryNumbers {
	public static void main (String[] args) throws IOException {
		FileReader source = new FileReader("e:/input.txt");
		FileWriter fin = new FileWriter("e:/output.txt");
		Scanner sc = new Scanner(source);
		String str = sc.nextLine();
		double number = parseInt(str);
		String result;

		result = log(number) / log(2) % 1 == 0 ? "YES" : "NO";

		/*if (log(number) / log(2) % 1 == 0) {
			result = "YES";
		} else {
			result = "NO";
		}*/

		fin.write(result);
		fin.close();
	}
}