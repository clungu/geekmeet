package com.synpic.geekmeet.sample.app;

import com.google.inject.AbstractModule;
import com.synpic.geekmeet.core.Service;
import com.synpic.geekmeet.core.webServer.WebServer;

/**
 * @author <a href="mailto:lungu.cristian@gmail.com">Cristian Lungu</a>
 */
public class WebServerModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Service.class).to(WebServer.class);
    }
}
