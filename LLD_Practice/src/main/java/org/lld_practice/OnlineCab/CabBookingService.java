package org.lld_practice.OnlineCab;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class CabBookingService {
    private static CabBookingService instance;
    private List<Driver> availableDrives;
    private List<Ride> activeRides;

    private CabBookingService() {
        availableDrives = new ArrayList<>();
        activeRides = new ArrayList<>();
    }

    private static synchronized CabBookingService getInstance() {
        if (instance == null) {
            instance = new CabBookingService();
        }

        return instance;
    }

    public void addDrive(Driver d) {
        this.availableDrives.add(d);
    }

    public void addRide(Ride r) {
        this.activeRides.add(r);
    }
}
