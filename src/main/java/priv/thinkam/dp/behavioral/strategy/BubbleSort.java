package priv.thinkam.dp.behavioral.strategy;

/**
 * Created by thinkam on 1/29/18.
 */
public class BubbleSort extends BaseSortStrategy {
	@Override
	public void sort(int[] array) {
		for (int i = array.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (array[j] > array[j + 1]) {
					swap(array, j, j + 1);
				}
			}
		}
	}
}
