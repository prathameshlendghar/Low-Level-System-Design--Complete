package TextEditorCommands.Commands;

import TextEditorCommands.Receivers.TextFileOperatorReceiver;

public class SaveCommand implements ICommand{
    TextFileOperatorReceiver operatorReceiver;

    public SaveCommand(){
        this.operatorReceiver = new TextFileOperatorReceiver();
    }

    @Override
    public void execute() {
        System.out.println("Save command initiated");
        operatorReceiver.save();
    }

    @Override
    public void undo(){
        System.out.println("No undo command for save");
    }
}
