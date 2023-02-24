import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class SummTwoNumber
{
    public static void main(String[] args) throws IOException
    {
        FileReader source = new FileReader("e:/input.txt");
        Scanner sc = new Scanner(source);
        String str = sc.nextLine();
        source.close();
        String [] array = str.split(" ");


        int summ = 0;

        for (String s : array) {
            summ = summ + parseInt(s);
        }

        String result = Integer.toString(summ);

        FileWriter done = new FileWriter("e:/output.txt");
        done.write(result);
        done.close();
    }
}