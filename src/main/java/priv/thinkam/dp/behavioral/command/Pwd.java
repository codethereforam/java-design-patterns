package priv.thinkam.dp.behavioral.command;

/**
 * @author thinkam
 * @date 2018/02/04
 */
public class Pwd extends Command {
	public Pwd(Shell shell) {
		super(shell);
	}

	@Override
	public void execute() {
		shell.pwd();
	}
}
