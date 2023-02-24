import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Beads {
    public static void main(String[] args) throws IOException {
        FileReader sourse = new FileReader("e:/input.txt");
        Scanner sc = new Scanner(sourse);
        String str = sc.nextLine();

        int calc = parseInt(str) + 1;
        String result = Integer.toString(calc);

        FileWriter fin = new FileWriter("e:/output.txt");
        fin.write(result);
        fin.close();
    }
}