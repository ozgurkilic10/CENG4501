package command;

public class Client {

    public static void main(String... args){

/*
        SimpleRemoteControl src = new SimpleRemoteControl();
        src.setCommand(new OutdoorLightOnCommand(new OutdoorLight()));

        src.buttonwasPressed();
*/

        RemoteControl rc = new RemoteControl();

        Runnable

        OutdoorLight outdoorLight = new OutdoorLight();
        CeilingFan ceilingFan = new CeilingFan();
        rc.setCommands(0, new OutdoorLightOnCommand(outdoorLight),
                new OutdoorLightOffCommand(outdoorLight));
        rc.setCommands(1, new CeilingFanLowCommand(ceilingFan),
               new CeilingFanOffCommand(ceilingFan));

        rc.on(0);
        //rc.undo();
        rc.on(1);
        rc.undo();
        rc.off(0);
        rc.undo();
    }
}
