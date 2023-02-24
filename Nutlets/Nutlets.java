import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class Nutlets {
    public static void main(String[] args) throws IOException {
        ArrayList <String> list = new ArrayList<>();
        String result;

        try (FileWriter fw = new FileWriter("e:/output.txt"); FileReader fr = new FileReader("e:/input.txt")) {
            Scanner sc = new Scanner(fr);
            String str = sc.nextLine();
            StringTokenizer st = new StringTokenizer(str);
            while (st.hasMoreTokens())
                list.add((String) st.nextElement());

            int N = parseInt(list.get(0));
            int M = parseInt(list.get(1));
            int K = parseInt(list.get(2));
            if (N * M >= K) {
                result = "YES";
            } else {
                result = "NO";
            }

            fw.write(result);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}