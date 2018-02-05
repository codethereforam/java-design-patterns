package priv.thinkam.dp.behavioral.state;

/**
 * @author thinkam
 * @date 2018/02/05
 */
public class Main {

	public static void main(String[] args) {
		Study study = new Study(new NormalState());
		study.program();
		study.program();
		study.program();
	}

}
