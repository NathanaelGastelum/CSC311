import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        InPlaceInsertionSort<Integer> insertionSort = new InPlaceInsertionSort<>();
        Integer[] a1 = new Integer[]{5, 7, 8, 4, 9, 3, 2};
        Integer[] a2 = new Integer[]{2, 3, 4, 5, 7, 8, 9};
        insertionSort.sort(a1);

            assert Arrays.equals(a1, a2) : System.out.printf("%9s %s \n%9s %s \n","Expected:", Arrays.toString(a2), "Result:", Arrays.toString(a1));
	

    }
}