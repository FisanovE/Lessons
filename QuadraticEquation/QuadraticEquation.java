

public class QuadraticEquation {
    public static void main(String[] args) {
// На любом языке программирования написать алгоритм, который для любых вещественных a, b и с решает уравнение:
// а*x^2+b*x+c = 7
        double a = 1;
        double b = 1;
        double c = 1;
        double e = 7;
        double x;
        double x1;
        double x2;

        if (e != 0) c -= e;

        if (a != 0 && b == 0 && c == 0 ) {
            System.out.println("Корень уравнения x= 0");
        }

        if (a == 0 && b == 0 && c == e ) {
            System.out.println("Корень уравнения x= 0");
        }

        if (a != 0 && b != 0 && c == 0 ) {
            x2 = -b / a;
            System.out.println("Корни уравнения x1= 0" + " x2= " + x2);
        }

        if (a != 0 && b == 0 && c != 0 ) {
            x1 = Math.sqrt(-c / a);
            x2 = - Math.sqrt(-c / a);
            System.out.println("Корни уравнения x1= " + x1 + " x2= " + x2);
        }

        if (c == e ) {
            x = (e - c) / b;
            System.out.println("Корень уравнения x= " + x);
        }

        if (a == 0 ) {
            x = (e - c) / b;
            System.out.println("Корень уравнения x= " + x);
        }

        double D = Math.pow(b, 2) - 4 * a * c;
        System.out.println("D= " + D);

        if (D > 0) {
            x1 = (-b + Math.sqrt(D)) / (2 * a);
            x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Корни уравнения x1= " + x1 + " x2= " + x2);
        } else if (D == 0) {
            x = -b / (2 * a);
            System.out.println("Корень уравнения x= " + x);
        } else {
            System.out.println("Действительных корней нет");
        }


    }
}
