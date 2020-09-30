import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] a = {5, 10, 3, 15, 22};
        System.out.println(Arrays.toString(add(a, 67, 1)));

        System.out.println(Arrays.toString(reverseArray(a)));

        int[] b = {15, 22};
        System.out.println(Arrays.toString(concatenate(a, b)));
    }

    static int[] add(int[] a, int item, int index) {
        int[] newArray = new int[a.length + 1];
        for (int i = a.length; i > index; i--) {
            newArray[i] = a[i - 1];
        }
        newArray[index] = item;
        return newArray;
    }

    static int[] reverseArray(int[] a) {
        int aSize = a.length;
        int[] newArray = new int[aSize];
        for (int i = 0; i < aSize; i++) {
            newArray[i] = a[aSize - 1 - i];
        }
        return newArray;
    }

    static int[] concatenate(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[a.length + i] = b[i];
        }
        return c;
    }
}