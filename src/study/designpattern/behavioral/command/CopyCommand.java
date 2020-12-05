package study.designpattern.behavioral.command;

public class CopyCommand extends Command {

    // Конкретная команда
    public CopyCommand(Editor editor) {
        super(editor);
    }

    // Команда копирования не записывается в историю, так как
    // она не меняет состояние редактора.
    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}
