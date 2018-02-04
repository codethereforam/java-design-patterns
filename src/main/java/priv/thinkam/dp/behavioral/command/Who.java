package priv.thinkam.dp.behavioral.command;

/**
 * @author thinkam
 * @date 2018/02/04
 */
public class Who extends Command {
	public Who(Shell shell) {
		super(shell);
	}

	@Override
	public void execute() {
		shell.who();
	}
}
