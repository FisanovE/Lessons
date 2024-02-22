import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class UniqueElements {


	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		String str1 = reader.readLine();
		String str2 = reader.readLine();
		String str3;
		int counter;
		int counter2;
		int result = 0;
		String s;

		/*for (int i = 0; i < str2.length(); i++) {
			for (int j = i + 1; j < str2.length(); j++) {
				if (str2.charAt(j) != str2.charAt(i)) {
					result = str2.charAt(i);
				}
			}
		}*/
		//String[] parts = str2.readLine().split(" ");
		String[] array = str2.split(" ");

		for (int i = 0; i < array.length; i++) {
			counter2 = 0;
			for (int j = i + 1; j < array.length; j++) {
				counter = 0;
				if (array[i] == array[j]) {
					counter++;
				}
				if (counter == 0) {
					counter2++;
				}
				if (counter2 == array.length-(i+1)) {
					System.out.println(array[i]);

				}


				System.out.println("counter:" + counter);
				System.out.println("counter2:" + counter2);

			}
		}


		//writer.write(String.valueOf(myList.size()));
		reader.close();
		//writer.close();
	}
}




