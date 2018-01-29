package priv.thinkam.dp.behavioral.strategy;

/**
 * Created by thinkam on 1/29/18.
 */
abstract class BaseSortStrategy {
	abstract void sort(int[] array);

	void swap(int[] array, int i, int j) {
		int t = array[i];
		array[i] = array[j];
		array[j] = t;
	}
}
