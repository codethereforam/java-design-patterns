package priv.thinkam.dp.behavioral.strategy.java8;

/**
 * 排序策略枚举
 *
 * @author thinkam
 * @date 2020/1/19 0:23
 */
public enum SortStrategyEnum {
    /**
     * 选择排序
     */
    SELECT(arr -> {
        int[] array = new int[arr.length];
        System.arraycopy(arr, 0, array, 0, arr.length);
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
        return array;
    }),
    /**
     * 冒泡排序
     */
    BUBBLE(arr -> {
        int[] array = new int[arr.length];
        System.arraycopy(arr, 0, array, 0, arr.length);
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
        return array;
    }),
    ;

    private final Sort sort;

    SortStrategyEnum(Sort sort) {
        this.sort = sort;
    }

    private static void swap(int[] array, int i, int j) {
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }

    public int[] sort(int[] array) {
        return this.sort.sort(array);
    }
}