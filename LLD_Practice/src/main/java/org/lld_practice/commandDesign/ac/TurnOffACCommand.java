package org.lld_practice.commandDesign.ac;

import org.lld_practice.commandDesign.ac.AirConditioner;
import org.lld_practice.commandDesign.ac.Command;

public class TurnOffACCommand implements Command {

    AirConditioner ac;

    public TurnOffACCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOffAC();
    }

    @Override
    public void undo() {
        ac.turnOnAC();
    }
}
