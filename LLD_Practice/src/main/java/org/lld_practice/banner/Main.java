package org.lld_practice.banner;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Date fromDate = new Date();

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fromDate);
        calendar.add(Calendar.DAY_OF_YEAR, 7);

        Date toDate = calendar.getTime();

        Advertise adv1 = new Advertise("GFG", fromDate, toDate, "This is advertisement for GFG");
        Advertise adv2 = new Advertise("Tata", fromDate, toDate, "This is advertisement for TATA");
        Advertise adv3 = new Advertise("LNT", fromDate, toDate, "This is advertisement for LNT");

        AdvertisementManager manager = new BannerManager();

        Banner banner = new Banner(manager);

        manager.addAdvertise(adv1);
        manager.addAdvertise(adv2);
        manager.addAdvertise(adv3);

        banner.displayCurrentAd();
        banner.displayNextAd();
        banner.displayPreviousAd();
    }
}
