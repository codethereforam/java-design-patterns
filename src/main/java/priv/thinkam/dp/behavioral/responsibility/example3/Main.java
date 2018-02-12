package priv.thinkam.dp.behavioral.responsibility.example3;

/**
 * @author thinkam
 * @date 2018/02/12
 */
public class Main {

	public static void main(String[] args) {
		Logger logger = new StdoutLogger(Level.DEBUG)
				.setNext(
						new EmailLogger(Level.NOTICE).setNext(new ErrorLogger(Level.ERROR))
				);
		logger.log("something received", Level.DEBUG);
		System.out.println("--------");
		logger.log("something finished", Level.NOTICE);
		System.out.println("--------");
		logger.log("something went wrong", Level.ERROR);
	}

}
