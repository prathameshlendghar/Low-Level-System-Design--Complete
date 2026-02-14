package TextEditorCommands;

import TextEditorCommands.Commands.*;
import TextEditorCommands.Invoker.IInvoker;
import TextEditorCommands.Invoker.ShortCutCommandInvoker;
import TextEditorCommands.Receivers.TextFileOperatorReceiver;

public class Client {
    public static void main(String[] args) {
        TextFileOperatorReceiver receiver = new TextFileOperatorReceiver();

        ICommand copyCommand = new CopyCommand();
        ICommand cutCommand = new CutCommand();
        ICommand pasteCommand = new PasteCommand();
        ICommand saveCommand = new SaveCommand();

        IInvoker invoker = new ShortCutCommandInvoker();

        invoker.setCommand("ctrl+c", copyCommand);
        invoker.setCommand("ctrl+x", cutCommand);
        invoker.setCommand("ctrl+v", pasteCommand);
        invoker.setCommand("ctrl+s", saveCommand);
        invoker.setCommand("ctrl+z", null);
        // Same for the update case also

        invoker.executeCommand("ctrl+x");
        invoker.executeCommand("ctrl+c");
        invoker.executeCommand("ctrl+s");
        invoker.executeCommand("ctrl+z");
        invoker.executeCommand("ctrl+z");
        invoker.executeCommand("ctrl+z");

        System.out.println();

        invoker.removeCommand("ctrl+c");
        invoker.executeCommand("ctrl+c");
        invoker.executeCommand("ctrl+x");
    }
}
