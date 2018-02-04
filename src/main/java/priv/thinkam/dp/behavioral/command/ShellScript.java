package priv.thinkam.dp.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author thinkam
 * @date 2018/02/04
 */
public class ShellScript {
	private List<Command> commands = new ArrayList<>();

	public void addCommand(Command command) {
		commands.add(command);
	}

	public void executeAll() {
		commands.forEach(Command::execute);
	}
}
