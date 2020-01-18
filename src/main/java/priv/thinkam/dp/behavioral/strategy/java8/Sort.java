package priv.thinkam.dp.behavioral.strategy.java8;

/**
 * 排序接口
 *
 * @author thinkam
 * @date 2020/1/19 0:24
 */
public interface Sort {
    /**
     * 排序方法
     *
     * @param array 排序前的数组
     * @return 排序后的数组
     */
    int[] sort(int[] array);
}
