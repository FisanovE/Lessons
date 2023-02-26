import java.io.*;
import java.util.*;

public class Salary {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int result;
        try {
            FileReader fr = new FileReader("e:input.txt");
            FileWriter fw = new FileWriter("e:output.txt");
            BufferedReader br = new BufferedReader(fr);
            StringTokenizer st = new StringTokenizer(br.readLine());

            while (st.hasMoreTokens()) {
                list.add(Integer.parseInt(st.nextToken()));
            }

            int max = Collections.max(list);
            int min = Collections.min(list);
            result = max - min;

            fw.write(Integer.toString(result));
            fw.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}