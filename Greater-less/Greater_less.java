import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static java.lang.Integer.parseInt;

public class Greater_less {
    public static void main(String[] args) throws IOException {
        FileWriter fin = null;
        try {
            String sourse = Files.readString(Paths.get("e:/input.txt"));
            String[] Array = sourse.split("\\r\n");

            int A = parseInt(Array[0]);
            int B = parseInt(Array[1]);

            fin = new FileWriter("e:/output.txt");
            if (A == B) {
                fin.write("=");
            } else if (A < B) {
                fin.write("<");
            } else if (A > B) {
                fin.write(">");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            assert fin != null;
            fin.close();
        }

    }
}