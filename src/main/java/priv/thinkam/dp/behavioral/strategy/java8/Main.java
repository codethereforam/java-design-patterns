package priv.thinkam.dp.behavioral.strategy.java8;

import java.util.Arrays;

/**
 * Created by thinkam on 1/29/18.
 */
public class Main {

	public static void main(String[] args) {
		int[] arr1 = {1, 3, 6, 5, 2, 4, 7};
		System.out.println("before sort: " + Arrays.toString(arr1));
		System.out.println("after sort: " + Arrays.toString(SortStrategyEnum.SELECT.sort(arr1)));

		System.out.println("====");

		int[] arr2 = {1, 3, 6, 5, 2, 4, 7};
		System.out.println("before sort: " + Arrays.toString(arr2));
		System.out.println("after sort: " + Arrays.toString(SortStrategyEnum.BUBBLE.sort(arr2)));
	}

}
