package TextEditorCommands.Commands;

public interface ICommand {
    public void execute();
    public void undo();
}
