import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class Strawberry_Harvest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int summHarvest;
        int valueEaten;

        String result;
        try (FileReader fr = new FileReader("e:/input.txt");
             FileWriter fw = new FileWriter("e:/output.txt");
             BufferedReader br = new BufferedReader(fr);) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            while (tokenizer.hasMoreTokens()) {
                list.add(parseInt(tokenizer.nextToken()));
            }
            summHarvest = list.get(0) + list.get(1);
            valueEaten = list.get(2);

            if (summHarvest < valueEaten) {
                result = "Impossible";
            } else {
                result = Integer.toString(summHarvest - valueEaten);
            }
            fw.write(result);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}