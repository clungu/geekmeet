package com.synpic.geekmeet.sample.webServer.impl.nodejs;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.synpic.geekmeet.core.webServer.WebAddress;
import com.synpic.geekmeet.core.webServer.WebPage;
import com.synpic.geekmeet.core.webServer.WebParams;
import com.synpic.geekmeet.core.webServer.WebServer;

/**
 * @author <a href="mailto:lungu.cristian@gmail.com">Cristian Lungu</a>
 */
public class NodeJsWebServer implements WebServer {

    private final Provider<WebPage> webPageProvider;

    @Inject
    NodeJsWebServer(Provider<WebPage> webPageProvider) {
        this.webPageProvider = webPageProvider;
    }

    public WebPage get(WebAddress url) {
        return webPageProvider.get();
    }

    public WebPage post(WebAddress url, WebParams webParams) {
        System.out.println("[Node] POST " + url.getSite() + url.getLocation() + " with params " + webParams.toString());
        return webPageProvider.get();
    }

    public void start() throws Exception {
        System.out.println("[Node] Started");
    }

    public void stop() {
        System.out.println("[Node] Stopped");
    }
}
