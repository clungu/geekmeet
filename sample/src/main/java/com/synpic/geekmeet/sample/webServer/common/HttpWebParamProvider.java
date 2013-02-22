package com.synpic.geekmeet.sample.webServer.common;

import com.synpic.geekmeet.core.webServer.WebParams;

import javax.inject.Provider;

/**
 * @author <a href="mailto:lungu.cristian@gmail.com">Cristian Lungu</a>
 */
public class HttpWebParamProvider implements Provider<WebParams.Builder> {
    public WebParams.Builder get() {
        return new HttpParams.BuilderImpl();
    }
}
