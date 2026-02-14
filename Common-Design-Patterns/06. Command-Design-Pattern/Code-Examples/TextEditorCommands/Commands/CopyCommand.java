package TextEditorCommands.Commands;

import TextEditorCommands.Receivers.TextFileOperatorReceiver;

public class CopyCommand implements ICommand{

    private TextFileOperatorReceiver operatorReceiver;

    public CopyCommand(){
        this.operatorReceiver = new TextFileOperatorReceiver();
    }

    @Override
    public void execute(){
        System.out.println("Copy command initiated");
        operatorReceiver.copy();
    }

    @Override
    public void undo() {
        System.out.println("No undo of copy on the file");
    }
}
