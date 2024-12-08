package org.lld_practice.traffic_lights;

public class PedestrianLight {
    private PedistrianState state;
    public PedestrianLight() {
        this.state = PedistrianState.WAIT;
    }
    public void setState(PedistrianState state) {
        this.state = state;
    }
    public PedistrianState getState() {
        return state;
    }
}
