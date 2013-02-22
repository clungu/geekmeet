package com.synpic.geekmeet.sample.webServer.impl.nodejs;

import com.synpic.geekmeet.core.webServer.WebAddress;
import com.synpic.geekmeet.sample.webServer.impl.apache.ApacheAddress;

/**
 * @author <a href="mailto:lungu.cristian@gmail.com">Cristian Lungu</a>
 */
public class NodeAddress implements WebAddress {
    public static final String NODE = "node.";
    private final String site;
    private final String location;

    public NodeAddress(String site, String location) {
        this.site = NODE + site;
        this.location = location;
    }

    public String getSite() {
        return site;
    }

    public String getLocation() {
        return location;
    }

    public WebAddress.Builder newBuilder() {
        return new ApacheAddress.BuilderImpl();
    }

    public static class BuilderImpl  implements Builder {
        String site;
        String location;

        public Builder setSite(String site) {
            this.site = site;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = location;
            return this;
        }

        public WebAddress build() {
            return new NodeAddress(site, location);
        }
    }
}
