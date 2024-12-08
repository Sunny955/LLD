package org.lld_practice.commandDesign.ac;

public class AirConditioner {
    boolean isOn;
    int temperature;

    public void turnOnAC() {
        isOn = true;
        System.out.println("AC is On!");
    }

    public void turnOffAC() {
        isOn = false;
        System.out.println("AC is off!");
    }

    public void setTemperature(int temp) {
        this.temperature = temp;
        System.out.println("Temperature is changed to: "+temp);
    }
}
