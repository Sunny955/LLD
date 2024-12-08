package org.lld_practice.banner;

import java.util.LinkedList;

public class BannerManager implements AdvertisementManager {

    private int current;
    private final LinkedList<Advertise> list;

    public BannerManager() {
        this.current = -1;
        this.list = new LinkedList<>();
    }

    @Override
    public void addAdvertise(Advertise advertise) {
        list.add(advertise);
        if (current < 0) {
            current++;
        }
    }

    @Override
    public Advertise getCurrent() {
        if (current >= 0 && current < list.size()) {
            return list.get(current);
        }
        return null;
    }

    @Override
    public Advertise getPrevious() {
        if (current > 0) {
            current--;
            return list.get(current);
        }
        return null;

    }

    @Override
    public Advertise getNext() {
        if (current < list.size() - 1) {
            current++;
            return list.get(current);
        }
        return null;
    }

}
