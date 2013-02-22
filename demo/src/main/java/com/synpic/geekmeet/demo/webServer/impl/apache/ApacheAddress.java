package com.synpic.geekmeet.demo.webServer.impl.apache;

import com.synpic.geekmeet.core.webServer.WebAddress;

/**
 * @author <a href="mailto:lungu.cristian@gmail.com">Cristian Lungu</a>
 */
public class ApacheAddress implements WebAddress {
    private final String location;
    private final String site;

    ApacheAddress(String location, String site) {
        this.location = location;
        this.site = site;
    }

    public String get() {
        return "Apache address here!";
    }

    public String getSite() {
        return site;
    }

    public String getLocation() {
        return location;
    }

    public Builder newBuilder() {
        return new BuilderImpl();
    }

    public static class BuilderImpl implements Builder {
        String location;
        String site;

        public Builder setSite(String site) {
            this.site = site;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = location;
            return this;
        }

        public WebAddress build() {
            return new ApacheAddress(location, site);
        }
    }
}
