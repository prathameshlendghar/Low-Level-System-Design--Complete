package TextEditorCommands.Invoker;

import TextEditorCommands.Commands.ICommand;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ShortCutCommandInvoker implements IInvoker{
    Map<String, ICommand> shortcutCommandMap;
    Stack<ICommand> history;

    public ShortCutCommandInvoker(){
        shortcutCommandMap = new HashMap<>();
        history = new Stack<>();
    }

    public void setCommand(String key, ICommand command){
        shortcutCommandMap.put(key, command);
        System.out.println("Command shortcut added successfully");
    }

    public void editCommand(String key, ICommand command){
        if(shortcutCommandMap.containsKey(key)){
            System.out.println("Editing the command Shortcut");
        }else{
            System.out.println("Command shortcut added successfully");
        }
        shortcutCommandMap.put(key, command);
    }

    public void removeCommand(String key){
        if(shortcutCommandMap.containsKey(key)){
            shortcutCommandMap.remove(key);
            System.out.println("Command mapping has been removed");
        }else{
            System.out.println("No mapping for this key found");
        }
    }

    public void executeCommand(String key){

        if(shortcutCommandMap.containsKey(key)){
            if(shortcutCommandMap.get(key) == null){
                undo();
                return;
            }
            System.out.println("Command execution started");
            shortcutCommandMap.get(key).execute();
            history.push(shortcutCommandMap.get(key));
        }
        else{
            System.out.println("Command is not set, Sorry!");
        }
    }

    public void undo(){
        if(history.isEmpty()){
            System.out.println("No History to undo");
            return;
        }
        history.peek().undo();
        history.pop();
    }
}
