package priv.thinkam.dp.structural.composite;

/**
 * @author thinkam
 * @date 2018/02/15
 */
public class Main {

	public static void main(String[] args) {
		Point pointA = new Point();
		Point pointB = new Point();
		Line lineA = new Line();
		Line lineB = new Line();

		Picture pictureA = new Picture();
		pictureA.add(pointA);
		pictureA.add(lineA);
		System.out.println("===== pictureA ====");
		pictureA.draw();

		Picture pictureB = new Picture();
		pictureB.add(pointB);
		pictureB.add(lineB);
		System.out.println("===== pictureB ====");
		pictureB.draw();

		Picture pictureC = new Picture();
		pictureC.add(pictureA);
		pictureC.add(pictureB);
		System.out.println("===== pictureC ====");
		pictureC.draw();
	}

}
