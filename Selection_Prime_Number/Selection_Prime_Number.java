public class Selection_Prime_Number {
    public static void main(String[] args) {
        calc(2, 100);

    }

    public static void calc(int startArea, int finishArea) {

        for (int i = startArea; i <= finishArea; i++) { // перебор чисел заданного диапазона

            boolean primeNumber = true;

            for (int j = 2; j < i; j++) {               // перебор делителей с 2 до i
                if (i % j == 0) {                       // число делится на делитель без остатка
                    primeNumber = false;
                    break;
                }
            }

            if (primeNumber) {
                System.out.println(i);
            }
        }
    }
}