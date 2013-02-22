package com.synpic.geekmeet.sample.webServer.impl.apache;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.synpic.geekmeet.core.webServer.WebAddress;
import com.synpic.geekmeet.core.webServer.WebPage;
import com.synpic.geekmeet.core.webServer.WebParams;
import com.synpic.geekmeet.core.webServer.WebServer;

/**
 * @author <a href="mailto:lungu.cristian@gmail.com">Cristian Lungu</a>
 */
@Singleton
public class ApacheWebServer implements WebServer {
    @Inject WebPage reply;

    public WebPage get(WebAddress url) {
        System.out.println("Getting page from " + url.getLocation());
        return reply;
    }

    public WebPage post(WebAddress url, WebParams webParams) {
        System.out.println("Posting message to "+ url.getSite() + url.getLocation() + " with params " + webParams.toString());
        return reply;
    }

    public void start() throws Exception {
        System.out.println("WebServer starting!");
    }

    public void stop() {
        System.out.println("WebServer stopping!");
    }
}
