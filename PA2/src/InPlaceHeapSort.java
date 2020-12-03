
/**
 * Nov 2020
 * CSC 311 Data Structures PA2
 *
 * This class is an implementation of the in place heap sort algorithm
 *
 * @author YOUR NAME
 *
 * @param <K> - the type of element being sorted
 */
public class InPlaceHeapSort<K extends Comparable<K>> implements Sorter<K> {

	/**
	 * sort - Perform an in-place heap sort
	 * @param array - Array to sort
	 */
	public void sort(K[] array) {

		buildMaxHeap(array);

		int n = array.length;
		for (int i = n - 1; i >= 0; i--) {
			// Swap ends of unsorted array
			K temp = array[i];
			array[i] = array[0];
			array[0] = temp;

			n = n-1;
			heapify(array, i,0);
		}
	}

	private void buildMaxHeap(K[] array) {
		int n = array.length;
		for (int i = n/2 - 1; i >= 0; i--) {
			heapify(array, n, i);
		}
	}

	private void heapify(K[] array, int size, int i) {
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		int max = i;

		// if left child is larger than root
		if (left < size && array[left].compareTo(array[max]) > 0)
			max = left;

		// if right child is larger than max
		if (right < size && array[right].compareTo(array[max]) > 0)
			max = right;

		// if max is not root
		if (max != i) {
			//swap array[i], array[max]
			K temp = array[max];
			array[max] = array[i];
			array[i] = temp;

			heapify(array, size, max);
		}
	}
}