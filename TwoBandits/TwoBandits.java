import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;

public class TwoBandits {
    public static void main(String[] args) throws IOException {
        try {
        BufferedReader br = new BufferedReader (new FileReader("e:/input.txt"));
        FileWriter fr = new FileWriter("e:/output.txt");
        ArrayList<Integer> List = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        while (st.hasMoreTokens()) {
            List.add (parseInt(st.nextToken()));
        }
            int Garry = List.get(1) - 1;
            int Larry = List.get(0) - 1;
            String result = Garry + " " + Larry;

        fr.write((String) result);
        fr.close();
    } catch (IOException e) {
            e.printStackTrace();
        }
    }
}