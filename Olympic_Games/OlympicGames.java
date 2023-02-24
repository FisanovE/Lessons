//import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


//import java.util.Scanner;

//import static java.lang.Integer.parseInt;import static jdk.internal.agent.Agent.parseString;

public class OlympicGames {
    public static void main(String[] args) throws IOException {
        /*FileReader sourse = new FileReader ("e:/input.txt");  Всё не нужно! Условие задачи надо читать внимательнее!!!
        Scanner readSourse = new Scanner(sourse);
        String str = readSourse.nextLine();
        String[] Array = str.split("\\n");
        String[] Array2 = Array [1].split(" ");
        int numberTask = parseInt (Array [0]);
        ...

        String str2 = parseString();
        ... */

        FileWriter fin = new FileWriter("e:/output.txt");
        fin.write("1");
        fin.close();

    }

}