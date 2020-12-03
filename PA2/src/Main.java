import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Insertion Sort Test
        InPlaceInsertionSort<Integer> insertionSort = new InPlaceInsertionSort<>();
        Integer[] a1 = new Integer[]{5, 7, 8, 4, 9, 3, 2};
        Integer[] a2 = new Integer[]{2, 3, 4, 5, 7, 8, 9};
        insertionSort.sort(a1);
         assert Arrays.equals(a1, a2) : System.out.printf("%9s %s \n%9s %s \n","Expected:", Arrays.toString(a2), "Result:", Arrays.toString(a1));

        // Selection Sort Test
        InPlaceSelectionSort<Integer> selectionSort = new InPlaceSelectionSort<>();
        a1 = new Integer[]{5, 7, 8, 4, 9, 3, 2};
        selectionSort.sort(a1);
        assert Arrays.equals(a1, a2) : System.out.printf("%9s %s \n%9s %s \n","Expected:", Arrays.toString(a2), "Result:", Arrays.toString(a1));

        a1 = new Integer[]{5, 7, 8, 4, 5, 3, 2};
        a2 = new Integer[]{2, 3, 4, 5, 5, 7, 8};
        selectionSort.sort(a1);
        assert Arrays.equals(a1, a2) : System.out.printf("%9s %s \n%9s %s \n","Expected:", Arrays.toString(a2), "Result:", Arrays.toString(a1));

        // Heap Sort Test
        InPlaceHeapSort<Integer> heapSort = new InPlaceHeapSort<>();
        a1 = new Integer[]{5, 7, 8, 4, 9, 3, 2};
        a2 = new Integer[]{2, 3, 4, 5, 7, 8, 9};
        heapSort.sort(a1);
        assert Arrays.equals(a1, a2) : System.out.printf("%9s %s \n%9s %s \n","Expected:", Arrays.toString(a2), "Result:", Arrays.toString(a1));
    }
}