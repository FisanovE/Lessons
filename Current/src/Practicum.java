import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Practicum {

    public static void main(String[] args) throws IOException {
//        Проверка задачи 5
        /*BasketService basketService = new BasketService();
        basketService.addProduct("Potato", 7);
        System.out.println(basketService.getProducts());
        basketService.updateProductQuantity("Potato", 15);
        System.out.println(basketService.getProductsQuantity("Potato"));
        basketService.clear();
        basketService.getProducts();*/

        int arr[] = {5, 2, 4, 6, 1, 3, 2, 6};
        int r = arr.length - 1;

// в условии p = 1, под 1 понимается первый элемент массива, в java это элемент с индексом 0

        int p = 0;
        sort(arr, p, r);
        System.out.println(Arrays.toString(arr));


    }

    public static void sort(int[] array, int startArrayOne, int endArrayTwo) {
        if (startArrayOne >= endArrayTwo) return;

        int endArrayOne = (startArrayOne + endArrayTwo) / 2;
        sort(array, startArrayOne, endArrayOne);
        sort(array, endArrayOne + 1, endArrayTwo);
        merge(array, startArrayOne, endArrayOne, endArrayTwo);
    }

    public static void merge(int[] array, int startArrayOne, int endArrayOne, int endArrayTwo) {

        int n1 = endArrayOne - startArrayOne + 1;
        int n2 = endArrayTwo - endArrayOne;
        int[] L = new int[n1 + 1];
        int[] R = new int[n2 + 1];
        L[n1] = 10000;
        R[n2] = 10000;
        System.arraycopy(array, startArrayOne, L, 0, n1);
        for (int j = 0; j < n2; j++) {
            R[j] = array[endArrayOne + j + 1];
        }
        int x = 0, y = 0;
        for (int k = startArrayOne; k <= endArrayTwo; k++) {
            if (L[x] <= R[y]) {
                array[k] = L[x];
                x++;
            } else {
                array[k] = R[y];
                y++;
            }
        }
    }

    public static void calculateTaskFour() {
        /*int[][] array = {
                ```
                {1, 1, 1, 1},
                {1, 0, 0, 1},
                {1, 0, 0, 1},
                {1, 1, 1, 1},

                {2, 2, 2, 2, 2, 2},
                {2, 1, 1, 1, 1, 2},
                {2, 1, 0, 0, 1, 2},
                {2, 1, 0, 0, 1, 2},
                {2, 1, 1, 1, 1, 2},
                {2, 2, 2, 2, 2, 2}

                {3, 3, 3, 3, 3, 3, 3, 3},
                {3, 2, 2, 2, 2, 2, 2, 3},
                {3, 2, 1, 1, 1, 1, 2, 3},
                {3, 2, 1, 0, 0, 1, 2, 3},
                {3, 2, 1, 0, 0, 1, 2, 3},
                {3, 2, 1, 1, 1, 1, 2, 3},
                {3, 2, 2, 2, 2, 2, 2, 3},
                {3, 3, 3, 3, 3, 3, 3, 3}
                ```
        };


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }

        System.out.println(Arrays.toString(f(array)));*/

        /*int n = 8;
        int k = (n - 2) / 2;
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    array[i][j] = k;
                } else if (i == 1 || i == n - 2 || j == 1 || j == n - 2) {
                    array[i][j] = k - 1;
                } else if (i == 2 || i == n - 3 || j == 2 || j == n - 3) {
                    array[i][j] = k - 2;
                } else {
                    array[i][j] = k - 3;
                }
            }
        }*/

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


    public static void calculateTaskOne() {
        List<Map<String, String>> listOfEmployees = getMaps();

        List<String> namesFromAge = listOfEmployees.stream()
                .filter(r -> Integer.parseInt(r.get("Возраст")) < 30)
                .map(r -> r.get("Имя")).collect(Collectors.toList());
        System.out.println("имена всех сотрудников, младше 30:");
        System.out.println(namesFromAge);

        List<String> namesFromCurrency = listOfEmployees.stream()
                .filter(r -> r.get("Зарплата").contains("руб"))
                .map(r -> r.get("Имя")).collect(Collectors.toList());
        System.out.println("имена всех сотрудников, получающих зарплату в рублях:");
        System.out.println(namesFromCurrency);

        Double averageAge = listOfEmployees.stream()
                .map(r -> r.get("Возраст"))
                .mapToDouble(Double::parseDouble)
                .average()
                .orElse(0);
        System.out.println("средний возраст всех сотрудников:");
        System.out.println(averageAge);
    }

    private static List<Map<String, String>> getMaps() {
        List<Map<String, String>> listOfEmployees = new ArrayList<>();

        Map<String, String> rows = new HashMap<>();
        rows.put("Имя", "Кирилл");
        rows.put("Возраст", "26");
        rows.put("Должность", "Middle java dev");
        rows.put("Зарплата", "150000 руб");
        listOfEmployees.add(rows);

        Map<String, String> rows2 = new HashMap<>();
        rows2.put("Имя", "Виталий");
        rows2.put("Возраст", "28");
        rows2.put("Должность", "Senior java automation QA");
        rows2.put("Зарплата", "2000$");
        listOfEmployees.add(rows2);

        Map<String, String> rows3 = new HashMap<>();
        rows3.put("Имя", "Александр");
        rows3.put("Возраст", "31");
        rows3.put("Должность", "junior functional tester");
        rows3.put("Зарплата", "50000 руб");
        listOfEmployees.add(rows3);

        Map<String, String> rows4 = new HashMap<>();
        rows4.put("Имя", "Дементий");
        rows4.put("Возраст", "35");
        rows4.put("Должность", "dev-ops");
        rows4.put("Зарплата", "1500$");
        listOfEmployees.add(rows4);
        return listOfEmployees;
    }

    public static void calculateTaskThree() {
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
/*
// если размерность матрицы нечетная, вычитаем серединный элемент один раз, чтобы избежать двойного подсчета
        if (n % 2 == 1) {
             sum -= matrix[n / 2][n / 2];
        }

// для главной диагонали
        int min = array[0][0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i][i]) {
                min = array[i][i];
            }
        }
        System.out.println(min);

// для побочной диагонали
        int min1 = array[0][0];
        for (int i = 0; i < array.length; i++) {
            if (min1 > array[array.length - 1 - i][i]) {
                min1 = array[array.length - 1 - i][i];
            }
        }
        System.out.println(min1);*/
    }

}