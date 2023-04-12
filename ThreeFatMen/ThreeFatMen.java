import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class ThreeFatMen {
	public static void main (String[] args) {
		ArrayList <Integer> list = new ArrayList <> ();

		String result;
		try (FileReader fr = new FileReader ("e:/input.txt");
			 FileWriter fw = new FileWriter ("e:/output.txt");
			 BufferedReader br = new BufferedReader (fr);) {
			StringTokenizer tokenizer = new StringTokenizer (br.readLine ());
			while (tokenizer.hasMoreTokens ()) {
				list.add (parseInt (tokenizer.nextToken ()));
			}
			if ((93 < list.get (0) && list.get (0) < 728) && (93 < list.get (1) && list.get (1) < 728) && (93 < list.get (2) && list.get (2) < 728)) {
				int b = 0;
				int max = 0;
				for (int i : list) {
					max = i > b ? b = i : b;
				}
				result = Integer.toString (max);
			} else {
				result = "Error";
			}
			fw.write (result);
		} catch (Exception e) {
			throw new RuntimeException (e);
		}
	}
}
