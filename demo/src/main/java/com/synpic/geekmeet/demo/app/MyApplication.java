package com.synpic.geekmeet.demo.app;

import com.synpic.geekmeet.core.Service;
import com.synpic.geekmeet.core.webServer.WebApi;
import com.synpic.geekmeet.core.webServer.WebServer;

/**
 * @author <a href="mailto:lungu.cristian@gmail.com">Cristian Lungu</a>
 */
class MyApplication implements Service {
    private final WebServer webServer = null;
    private final WebApi webApi = null;

    private MyApplication() {
    }


    public void start() throws Exception {
        webServer.start();
    }

    public void stop() {
        webServer.stop();
    }

    public void buy(String object) {
        System.out.println("Buying " + object);
        //TODO: post to web server buy object
    }

    public void sell(String object) {
        System.out.println("Selling " + object);
        //TODO: post to webserver sell object
    }
}

