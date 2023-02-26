import java.io.*;

public class  Stones_and_Gemstones{
    public static void main(String[] args) throws IOException {
        BufferedReader sourse = new BufferedReader(new InputStreamReader(System.in));
        String str1 = sourse.readLine();
        String str2 = sourse.readLine();
        int counter = 0;
        int result;
        char[] ch = str1.toCharArray();
        for (char i : ch) {
            if (str2.contains(String.valueOf(i))) {
                counter = counter + 1;
            }
        }
        result = counter + ch.length;
        System.out.println(result);
    }
}