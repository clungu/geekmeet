package com.synpic.geekmeet.demo.webServer.impl.nodejs;

import com.google.inject.Provider;
import com.synpic.geekmeet.core.webServer.WebAddress;

/**
 * @author <a href="mailto:lungu.cristian@gmail.com">Cristian Lungu</a>
 */
public class NodeJsAddressProvider implements Provider<WebAddress.Builder> {
    public WebAddress.Builder get() {
        return new NodeAddress.BuilderImpl();
    }
}
