package com.synpic.geekmeet.core.webServer;

/**
 * @author <a href="mailto:lungu.cristian@gmail.com">Cristian Lungu</a>
 */
public interface WebAddress {
    String getSite();
    String getLocation();
    Builder newBuilder();

    interface Builder {
        Builder setSite(String site);
        Builder setLocation(String location);
        WebAddress build();
    }
}
