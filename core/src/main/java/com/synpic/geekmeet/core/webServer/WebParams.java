package com.synpic.geekmeet.core.webServer;

import java.util.Map;

/**
 * @author <a href="mailto:lungu.cristian@gmail.com">Cristian Lungu</a>
 */
public interface WebParams {
    Map<String, String> getParams();
    String getValue(String key);
    Builder newBuilder();

    interface Builder {
        Builder setParam(String key, String value);
        WebParams build();
    }
}
