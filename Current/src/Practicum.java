import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;

public class Practicum {
    private static final int N = 10;

    public static void main(String[] args) throws IOException {
        calculate(7, 7, 7);

    }

    public static void calculate(double a, double b, double c) {
        a = a / 7;
        b = b / 7;
        c = c / 7;
        double D = Math.pow(b, 2) - (4 * a * c);
        System.out.println("D = " + D);

        if (D > 0) {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("x1 = " + x1 + "x2 = " + x2);
        } else if (D == 0) {
            double x3 = -b / 2 * a;
            System.out.println("Дискриминант меньше нуля, уравнение не имеет действительных решений.");
        } else {
            double x3 = -b / 2 * a;
            System.out.println("Дискриминант меньше нуля, уравнение не имеет действительных решений.");
        }
    }
}