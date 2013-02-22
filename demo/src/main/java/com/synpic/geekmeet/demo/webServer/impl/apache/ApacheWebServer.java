package com.synpic.geekmeet.demo.webServer.impl.apache;

import com.synpic.geekmeet.core.webServer.WebAddress;
import com.synpic.geekmeet.core.webServer.WebPage;
import com.synpic.geekmeet.core.webServer.WebParams;
import com.synpic.geekmeet.core.webServer.WebServer;

/**
 * @author <a href="mailto:lungu.cristian@gmail.com">Cristian Lungu</a>
 */
public class ApacheWebServer implements WebServer {

    @Override
    public WebPage get(WebAddress url) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public WebPage post(
            WebAddress url, WebParams webParams
    ) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void start() throws Exception {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void stop() {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
