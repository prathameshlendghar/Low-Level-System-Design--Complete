package TextEditorCommands.Commands;

import TextEditorCommands.Receivers.TextFileOperatorReceiver;

public class CutCommand implements ICommand{
    private TextFileOperatorReceiver operatorReceiver;

    public CutCommand(){
        this.operatorReceiver = new TextFileOperatorReceiver();
    }

    @Override
    public void execute(){
        System.out.println("Cut command initiated");
        operatorReceiver.cut();
    }

    @Override
    public void undo() {
        System.out.println("Undo of cut initiated");
        operatorReceiver.paste();
    }
}
