import java.io.IOException;

public class Matrix {
    public static void main(String[] args) throws IOException {
//        1. Дан массив NxN. Напишите программу на Java которая находит минимальный элемент диагонали на картинке,
//        без учёта элемента пересечения диагоналей.
        calculateTaskOne();

//        Создать алгоритм заполнения матрицы согласно схемам
        calculateTaskTwo();
    }

    public static void calculateTaskOne() {
        int[][] array = {
                {1, 2, 3, 4, 5},
                {5, 7, 9, 2, 1},
                {0, 9, 1, 8, 7},
                {6, 3, 6, 6, 6},
                {99, 100, -2, 3, 1}
        };


        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i][i] + " ");
        }

        System.out.print("\n");

        int n = array.length;
        int min = array[0][n - 1];
        for (int i = 0; i < n; i++) {
            if (n % 2 == 1 && i != n / 2 && array[i][n - i - 1] < min) {
                min = array[i][n - i - 1];
            }
        }

        System.out.print("\n");
        System.out.print(min);
    }


    public static void calculateTaskTwo() {


        int n = 8;
        int k = (n - 2) / 2;
        int m = k;
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i > n / 2 - 2 && j > n / 2 - 2 && i < n / 2 + 1 && j < n / 2 + 1) {
                    array[i][j] = 0;
                } else {
                    for (int l = 0; l < k; l++) {
                        if (i == 0 + m || i == n - 1 - m || j == 0 + m || j == n - 1 - m) {
                            array[i][j] = k + m;
                        }
                    }
                }
            }
        }

       /* for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    array[i][j] = 2; // Заполнение внешнего квадрата значением 2
                } else {
                    if (i == 1 || i == 4 || j == 1 || j == 4) {
                        array[i][j] = 1; // Заполнение внутреннего квадрата значением 1
                    } else {
                        array[i][j] = 0; // Установка центрального элемента в значение 0
                    }
                }
            }
        }*/

        // Вывод матрицы на экран
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
