package priv.thinkam.dp.behavioral.iterator;

/**
 * @author thinkam
 * @date 2018/02/10
 */
public class Main {

	public static void main(String[] args) {
		Collection<Integer> collection = new ArrayList<>();
//		Collection<Integer> collection = new LinkedList<>();
		for (int i = 0; i < 5; i++) {
			collection.add(i);
		}
		Iterator iterator = collection.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}

}
