package org.lld_practice.banner;

public interface AdvertisementManager {
    void addAdvertise(Advertise advertise);

    Advertise getCurrent();

    Advertise getPrevious();

    Advertise getNext();
}
