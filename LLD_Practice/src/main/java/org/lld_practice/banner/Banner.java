package org.lld_practice.banner;

public class Banner {
    private AdvertisementManager advertisementManager;

    public Banner(AdvertisementManager advertisementManager) {
        this.advertisementManager = advertisementManager;
    }

    public void displayCurrentAd() {
        Advertise currentAd = advertisementManager.getCurrent();

        if (currentAd != null) {
            System.out.println(currentAd);
        } else {
            System.out.println("No advertisement to display.");
        }
    }

    public void displayNextAd() {
        Advertise nextAd = advertisementManager.getNext();
        if (nextAd != null) {
            System.out.println(nextAd);
        } else {
            System.out.println("No more advertisements.");
        }
    }

    public void displayPreviousAd() {
        Advertise previousAd = advertisementManager.getPrevious();
        if (previousAd != null) {
            System.out.println(previousAd);
        } else {
            System.out.println("No previous advertisements.");
        }
    }

}
