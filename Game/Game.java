import java.io.*;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) throws IOException {
        FileReader sourse = new FileReader("e:/input.txt");
        Scanner sc = new Scanner(sourse);
        String oneNumber = sc.nextLine();
        int threeNumber = 9 - Integer.parseInt(oneNumber);
        String result = oneNumber + 9 + threeNumber;
        FileWriter finish = new FileWriter("e:/output.txt");
        finish.write(result);
        finish.close();
    }
}