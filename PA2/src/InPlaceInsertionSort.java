
/**
 * Nov 2020
 * CSC 311 Data Structures PA2
 * This class is an implementation of the in place insertion sort
 *
 * @author Your Name
 *
 * @param <K> - the type of element being sorted
 */
public class InPlaceInsertionSort<K extends Comparable<K>> implements Sorter<K> {

	/**
	 * sort - Perform an in-place insertion sort
	 * @param array - Array to sort
	 */
	
	public void sort(K[] array) {
		// Loop through array
		for (int i = 1; i < array.length; i++) {
			int j = i;
			// while current < previous
			while (j > 0 && array[j].compareTo(array[j - 1]) < 0) {
				// swap current and previous
				K temp = array[j - 1];
				array[j - 1] = array[j];
				array[j] = temp;
				// Update current
				j = j-1;
			}
		}
	}

}