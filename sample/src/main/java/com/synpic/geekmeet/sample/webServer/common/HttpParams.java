package com.synpic.geekmeet.sample.webServer.common;

import com.google.common.base.Joiner;
import com.google.inject.Inject;
import com.synpic.geekmeet.core.webServer.WebParams;

import java.util.Map;

/**
 * @author <a href="mailto:lungu.cristian@gmail.com">Cristian Lungu</a>
 */
public class HttpParams implements WebParams {
    private final Map<String,String> data;

    @Inject
    HttpParams(Map<String, String> data) {
        this.data = data;
    }

    public Map<String, String> getParams() {
        return data;
    }

    public String getValue(String key) {
        return data.get(key) == null ? "" : data.get(key);
    }

    @Override
    public String toString() {
        return "[" + Joiner.on("&").withKeyValueSeparator("=").join(data) + "]";
    }

    public Builder newBuilder() {
        return new BuilderImpl();
    }

    public static class BuilderImpl implements Builder{
        @Inject Map<String, String> builderData;

        public Builder setParam(String key, String value) {
            builderData.put(key, value);
            return this;
        }

        public WebParams build() {
            return new HttpParams(builderData);
        }
    }
}
