package org.lld_practice.traffic_lights;

public class TrafficLight {
    private SignalState state;
    public TrafficLight() {
        this.state = SignalState.RED;
    }
    public void setState(SignalState state) {
        this.state = state;
    }
    public SignalState getState() {
        return state;
    }
}
