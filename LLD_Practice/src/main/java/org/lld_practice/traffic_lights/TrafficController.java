package org.lld_practice.traffic_lights;

public class TrafficController {
    private final TrafficLight northLight;
    private final TrafficLight southLight;
    private final TrafficLight eastLight;
    private final TrafficLight westLight;
    private final PedestrianLight northSouthPedestrianLight;
    private final PedestrianLight eastWestPedestrianLight;
    private final Sensor northSensor;
    private final Sensor southSensor;
    private final Sensor eastSensor;
    private final Sensor westSensor;

    public TrafficController() {
        northLight = new TrafficLight();
        southLight = new TrafficLight();
        eastLight = new TrafficLight();
        westLight = new TrafficLight();
        northSouthPedestrianLight = new PedestrianLight();
        eastWestPedestrianLight = new PedestrianLight();
        northSensor = new Sensor();
        southSensor = new Sensor();
        eastSensor = new Sensor();
        westSensor = new Sensor();
    }

    public void controlTraffic() {
        int northTraffic = northSensor.getTrafficCount();
        int southTraffic = southSensor.getTrafficCount();
        int eastTraffic = eastSensor.getTrafficCount();
        int westTraffic = westSensor.getTrafficCount();

        // Adjust green light duration based on traffic volume
        int DEFAULT_GREEN_DURATION = 30;

        int RUSH_HOUR_GREEN_DURATION = 60;

        int northSouthGreenDuration = (northTraffic > eastTraffic || southTraffic > westTraffic)
                ? RUSH_HOUR_GREEN_DURATION : DEFAULT_GREEN_DURATION;

        int eastWestGreenDuration = (eastTraffic > northTraffic || westTraffic > southTraffic)
                ? RUSH_HOUR_GREEN_DURATION : DEFAULT_GREEN_DURATION;

        // North-South green phase
        northLight.setState(SignalState.GREEN);
        southLight.setState(SignalState.GREEN);
        eastLight.setState(SignalState.RED);
        westLight.setState(SignalState.RED);

        northSouthPedestrianLight.setState(PedistrianState.WAIT);
        eastWestPedestrianLight.setState(PedistrianState.WAIT);

        System.out.println("Traffic managed for north-south green");
        waitFor(northSouthGreenDuration);

        // Yellow phase before switching
        northLight.setState(SignalState.YELLOW);
        southLight.setState(SignalState.YELLOW);

        waitFor(5);  // Yellow light for 5 seconds

        // East-West green phase
        northLight.setState(SignalState.RED);
        southLight.setState(SignalState.RED);
        eastLight.setState(SignalState.GREEN);
        westLight.setState(SignalState.GREEN);

        System.out.println("Traffic managed for east-west green");
        waitFor(eastWestGreenDuration);

        // Yellow phase before switching
        eastLight.setState(SignalState.YELLOW);
        westLight.setState(SignalState.YELLOW);

        waitFor(5); // Yellow light for 5 secs

        // Pedestrian crossing phase
        northLight.setState(SignalState.RED);
        southLight.setState(SignalState.RED);
        eastLight.setState(SignalState.RED);
        westLight.setState(SignalState.RED);

        //North-South Pedestrian will walk
        northSouthPedestrianLight.setState(PedistrianState.WALK);
        waitFor(10);

        // Reset north south pedestrian light to stop
        northSouthPedestrianLight.setState(PedistrianState.WAIT);

        // East-West Pedestrian will walk
        eastWestPedestrianLight.setState(PedistrianState.WALK);
        waitFor(10);

        // Reset east west pedestian light to stop
        eastWestPedestrianLight.setState(PedistrianState.WAIT);
    }

    private void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
