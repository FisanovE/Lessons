import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

import static java.lang.Integer.parseInt;

public class Torte {
    public static void main(String[] args) throws IOException {
        int numberOfGuests;
        int result;

        String sourse = Files.readString(Paths.get("e:/input.txt"));
        FileWriter fw = new FileWriter("e:/output.txt");

        numberOfGuests = parseInt(sourse);

        result = (numberOfGuests == 1) ? 0 :
                (numberOfGuests % 2 == 0) ? numberOfGuests / 2 : numberOfGuests;

        fw.write(Integer.toString(result));
        fw.close();
    }
}