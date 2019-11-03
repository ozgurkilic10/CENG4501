package command;

public class RemoteControl {


    Command[] onCommands = new Command[7];
    Command[] offCommands = new Command[7];

    Command undoCommand;

    public void setCommands(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void on(int index){
       onCommands[index].execute();
       undoCommand =  onCommands[index];
    }

    public void off(int index){
        offCommands[index].execute();
        undoCommand =  offCommands[index];
    }

    public void undo(){
        undoCommand.undo();
    }
}
