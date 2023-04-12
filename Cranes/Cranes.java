import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Cranes {
	public static void main (String[] args) throws IOException {
		FileReader source = new FileReader("e:/input.txt");
		Scanner sc = new Scanner(source);
		String str = sc.nextLine();

		int calc = parseInt(str)/6;
		String result = Integer.toString(calc) + " " + Integer.toString(calc * 4)+ " " + Integer.toString(calc) ;

		FileWriter fin = new FileWriter("e:/output.txt");
		fin.write(result);
		fin.close();
	}
}