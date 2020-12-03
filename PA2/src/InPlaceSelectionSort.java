
/**
 * Nov 2020
 * CSC 311 Data Structures PA2
 *
 * This class is an implementation of the in place selection sort
 *
 * @author Your Name
 *
 * @param <K> - the type of element being sorted
 */
public class InPlaceSelectionSort<K extends Comparable<K>> implements Sorter<K> {

	/**
	 * sort - Perform an in-place selection sort
	 * @param array - Array to sort
	 */
	
	public void sort(K[] array) {
		// Loop over array
		for (int i = 0; i < array.length - 1; i++) {

			// loop over unsorted array
			int minIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				// log smallest value
				if (array[minIndex].compareTo(array[j]) > 0) {
					minIndex = j;
				}
				// swap min with beginning of unsorted array
				if (minIndex != i){
					K temp = array[minIndex];
					array[minIndex] = array[i];
					array[i] = temp;
				}
			}
		}
	}

}