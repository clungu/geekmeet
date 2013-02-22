package com.synpic.geekmeet.sample.app;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.synpic.geekmeet.core.Service;
import com.synpic.geekmeet.core.webServer.WebApi;
import com.synpic.geekmeet.core.webServer.WebParams;
import com.synpic.geekmeet.core.webServer.WebServer;

/**
 * @author <a href="mailto:lungu.cristian@gmail.com">Cristian Lungu</a>
 */
class MyApplication implements Service {
    private final WebServer webServer;
    private final WebApi webApi;
    private final Provider<WebParams.Builder> webParamsProvider;

    @Inject
    private MyApplication(WebServer webServer, WebApi webApi, Provider<WebParams.Builder> webParamsProvider) {
        this.webServer = webServer;
        this.webApi = webApi;
        this.webParamsProvider = webParamsProvider;
    }


    public void start() throws Exception {
        webServer.start();
    }

    public void stop() {
        webServer.stop();
    }

    public void buy(String object) {
        System.out.println("Buying " + object);
        webServer.post(
                webApi.getBuyPage(),
                webParamsProvider.get()
                        .setParam("obj", object)
                        .build()
        );
    }

    public void sell(String object) {
        System.out.println("Selling " + object);
        webServer.post(
                webApi.getSellPage(),
                webParamsProvider.get()
                        .setParam("obj", object)
                        .build()
        );
    }
}

