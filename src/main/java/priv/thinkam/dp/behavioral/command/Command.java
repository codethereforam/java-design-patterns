package priv.thinkam.dp.behavioral.command;

/**
 * @author thinkam
 * @date 2018/02/04
 */
public abstract class Command {
	protected Shell shell;

	protected Command(Shell shell) {
		this.shell = shell;
	}

	abstract void execute();
}
