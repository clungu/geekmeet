package com.synpic.geekmeet.sample.api;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.name.Named;
import com.synpic.geekmeet.core.webServer.WebAddress;
import com.synpic.geekmeet.core.webServer.WebApi;

/**
 * @author <a href="mailto:lungu.cristian@gmail.com">Cristian Lungu</a>
 */
public class SiteApi implements WebApi {
    private final Provider<WebAddress.Builder> webAddressProvider;
    private final String sellPage;
    private final String site;
    private final String buyPage;

    @Inject
    SiteApi(
            Provider<WebAddress.Builder> webAddressProvider,
            @Named("site") String site,
            @Named("sellPage") String sellPage,
            @Named("buyPage") String buyPage

    ) {
        this.webAddressProvider = webAddressProvider;
        this.site = site;
        this.sellPage = sellPage;
        this.buyPage = buyPage;
    }

    public WebAddress getSellPage() {
        return webAddressProvider.get()
                .setSite(site)
                .setLocation(sellPage)
                .build();
    }

    public WebAddress getBuyPage() {
        return webAddressProvider.get()
                .setSite(site)
                .setLocation(buyPage)
                .build();
    }
}
