package org.lld_practice.proxy;

import java.util.ArrayList;
import java.util.List;

public class InternetProxy implements Internet {

    private final Internet realInternet;
    private static final List<String> bannedSites;

    static {
        bannedSites = new ArrayList<>();
        bannedSites.add("abc.com");
        bannedSites.add("def.com");
        bannedSites.add("xyz.com");
        bannedSites.add("123.com");
    }

    public InternetProxy() {
        realInternet = new RealInternet();
    }

    @Override
    public void connectTo(String serverHost) throws Exception {
        if (bannedSites.contains(serverHost.toLowerCase())) {
            throw new Exception("Access Denied: Cannot connect to " + serverHost);
        }
        realInternet.connectTo(serverHost);
    }

}
