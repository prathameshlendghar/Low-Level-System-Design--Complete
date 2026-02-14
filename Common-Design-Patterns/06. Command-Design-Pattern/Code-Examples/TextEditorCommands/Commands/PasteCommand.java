package TextEditorCommands.Commands;

import TextEditorCommands.Receivers.TextFileOperatorReceiver;

public class PasteCommand implements ICommand{
    TextFileOperatorReceiver operatorReceiver;

    public PasteCommand(){
        this.operatorReceiver = new TextFileOperatorReceiver();
    }

    @Override
    public void execute() {
        System.out.println("Paste Command Initiated");
        operatorReceiver.paste();
    }

    public void undo(){
        System.out.println("Undo for paste initiated");
        operatorReceiver.cut();
    }
}
