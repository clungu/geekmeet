package com.synpic.geekmeet.sample.app;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Provides;
import com.google.inject.name.Names;
import com.synpic.geekmeet.core.webServer.*;
import com.synpic.geekmeet.sample.api.SiteApi;
import com.synpic.geekmeet.sample.webServer.common.HttpParams;
import com.synpic.geekmeet.sample.webServer.common.HttpWebPage;
import com.synpic.geekmeet.sample.webServer.impl.apache.ApacheAddress;
import com.synpic.geekmeet.sample.webServer.impl.apache.ApacheWebServer;
import com.synpic.geekmeet.sample.webServer.impl.nodejs.NodeAddress;
import com.synpic.geekmeet.sample.webServer.impl.nodejs.NodeJsWebServer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author <a href="mailto:lungu.cristian@gmail.com">Cristian Lungu</a>
 */
public class Bootstrap {

    public static void main(String[] args) throws Exception {
        Injector injector = Guice.createInjector(
                new ApplicationModule(),
                new ApiModule(),
                new ApacheModule()
        );

        //Build web store app
        final MyApplication application = injector.getInstance(MyApplication.class);
        application.start();

        //simulate usage
        application.buy("Pork");
        application.buy("Steak");
        application.sell("Pork");
        application.sell("Steak");

        Runtime.getRuntime().addShutdownHook(
                new Thread() {
                    @Override
                    public void run() {
                        System.out.println("Shutting down application!");
                        application.stop();
                    }
                }
        );
    }

    static class ApacheModule extends AbstractModule {
        @Override
        protected void configure() {
            bind(WebServer.class).to(ApacheWebServer.class);
            bind(WebPage.class).to(HttpWebPage.class);
            bind(WebParams.Builder.class).to(HttpParams.BuilderImpl.class);
            bind(WebAddress.Builder.class).to(ApacheAddress.BuilderImpl.class);
            bind(WebApi.class).to(SiteApi.class);
        }

        @Provides
        Map<String, String> mapProvider() {
            return new HashMap<String, String>();
        }
    }

    static class NodeJsModule extends AbstractModule {
        @Override
        protected void configure() {
            bind(WebServer.class).to(NodeJsWebServer.class);
            bind(WebPage.class).to(HttpWebPage.class);
            bind(WebParams.Builder.class).to(HttpParams.BuilderImpl.class);
            bind(WebAddress.Builder.class).to(NodeAddress.BuilderImpl.class);
            bind(WebApi.class).to(SiteApi.class);

        }

        @Provides
        Map<String, String> mapProvider() {
            return new HashMap<String, String>();
        }
    }

    static class ApiModule extends AbstractModule {
        @Override
        protected void configure() {
            bind(String.class).annotatedWith(Names.named("site")).toInstance("https://somesite.com");
            bind(String.class).annotatedWith(Names.named("sellPage")).toInstance("/sell");
            bind(String.class).annotatedWith(Names.named("buyPage")).toInstance("/buy");
        }
    }

    static class ApplicationModule extends AbstractModule {
        @Override
        protected void configure() {
        }
    }

}
