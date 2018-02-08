package priv.thinkam.dp.creational.singleton.method4a;

import java.io.*;

/**
 * @author thinkam
 * @date 2018/02/08
 */
public class Main {
	public static void main(String[] args) {
		Singleton instance1 = Singleton.getInstance();

		/*
		 * 序列化攻击
		 * 如果没有readResolve()，则攻击成功，结果打印false
		 */
		ObjectInputStream ois = null;
		try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
			 ObjectOutputStream oos = new ObjectOutputStream(baos)
		) {
			oos.writeObject(instance1);
			byte[] bytes = baos.toByteArray();
			ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
			ois = new ObjectInputStream(bais);
			Singleton instance2 = (Singleton) ois.readObject();

			System.out.println(instance1 == instance2);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(ois != null) {
				try {
					ois.close();
					ois = null;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
