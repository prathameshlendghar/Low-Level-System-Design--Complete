package TextEditorCommands.Invoker;

import TextEditorCommands.Commands.ICommand;

public interface IInvoker {
    public void setCommand(String key, ICommand command);
    public void editCommand(String key, ICommand command);
    public void removeCommand(String key);
    public void executeCommand(String key);

    public void undo();
}
