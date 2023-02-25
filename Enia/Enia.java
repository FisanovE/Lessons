import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class Enia {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int buf;
        int result;
        try (FileReader fr = new FileReader("e:/input.txt");
             FileWriter fw = new FileWriter("e:/output.txt");
             BufferedReader br = new BufferedReader(fr);)
        {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            while (tokenizer.hasMoreTokens()) {
                list.add(parseInt(tokenizer.nextToken()));
            }
            result = 2*list.get(0)*list.get(1)*list.get(2);
            fw.write(Integer.toString(result));
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}