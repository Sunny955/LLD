package org.lld_practice.commandDesign.ac;

import org.lld_practice.commandDesign.ac.AirConditioner;
import org.lld_practice.commandDesign.ac.Command;

public class TurnOnACCommand implements Command {

    AirConditioner ac;

    TurnOnACCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOnAC();
    }

    @Override
    public void undo() {
        ac.turnOffAC();
    }
}
