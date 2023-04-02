import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

import static java.lang.Integer.parseInt;

public class Basketball {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        String result;
        int scoreOne;
        int scoreTwo;

        try {
            String sourse = Files.readString(Paths.get("e:/input.txt"));
            FileWriter fw = new FileWriter("e:/output.txt");

            StringTokenizer tokenizer = new StringTokenizer(sourse);
            while (tokenizer.hasMoreTokens()) {
                list.add(parseInt(tokenizer.nextToken()));
            }

            scoreOne = list.get(0) + list.get(2) + list.get(4) + list.get(6);
            scoreTwo = list.get(1) + list.get(3) + list.get(5) + list.get(7);
            if (scoreOne > scoreTwo) {
                result = "1";
            } else if (scoreOne < scoreTwo) {
                result = "2";
            } else {
                result = "DRAW";
            }
            fw.write(result);
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

