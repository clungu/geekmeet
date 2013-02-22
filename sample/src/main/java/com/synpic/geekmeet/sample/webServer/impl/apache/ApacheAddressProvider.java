package com.synpic.geekmeet.sample.webServer.impl.apache;

import com.google.inject.Provider;
import com.synpic.geekmeet.core.webServer.WebAddress;

/**
 * @author <a href="mailto:lungu.cristian@gmail.com">Cristian Lungu</a>
 */
public class ApacheAddressProvider implements Provider<WebAddress.Builder> {
    public ApacheAddress.Builder get() {
        return new ApacheAddress.BuilderImpl();
    }
}
