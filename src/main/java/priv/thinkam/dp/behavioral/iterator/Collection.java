package priv.thinkam.dp.behavioral.iterator;

/**
 * @author thinkam
 * @date 2018/02/10
 */
public interface Collection<T> extends Iterable {
	boolean add(T t);

	int size();
}
