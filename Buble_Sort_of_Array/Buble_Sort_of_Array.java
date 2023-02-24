import java.util.Arrays;

public class Buble_Sort_of_Array {
    public static void main(String[] args) {
        double[] array = new double[6];
        double buffer = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }

        String str = Arrays.toString(array);
        System.out.println(str);

        double[] array2 = array;

        for (int k = 0; k < array2.length - 1; k++) { // this is me variant
            for (int i = 0; i < array2.length - 1; i++) {
                if (array2[i] > array2[i + 1]) {
                    buffer = array2[i];
                    array2[i] = array2[i + 1];
                    array2[i + 1] = buffer;
                    //String str2 = Arrays.toString(array);
                    //System.out.println("str2: " + str2);
                }
            }
        }
        String str2 = Arrays.toString(array2);
        System.out.println("str2: " + str2);

        double[] array3 = array;

        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3.length - i - 1; j++) {
                if (array3[j] > array3[j + 1]) {
                    double temp = array3[j];
                    array3[j] = array3[j + 1];
                    array3[j + 1] = temp;
                }
            }
        }
        String str3 = Arrays.toString(array3);
        System.out.println("str3: " + str3);

    }
}