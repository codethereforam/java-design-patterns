package priv.thinkam.dp.behavioral.strategy;

/**
 * Created by thinkam on 1/29/18.
 */
public class SelectSort extends BaseSortStrategy {
	@Override
	public void sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int min = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[min]) {
					min = j;
				}
			}
			if (min != i) {
				swap(array, min, i);
			}
		}
	}
}
