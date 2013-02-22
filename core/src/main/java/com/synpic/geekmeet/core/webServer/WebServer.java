package com.synpic.geekmeet.core.webServer;

import com.synpic.geekmeet.core.Service;

/**
 * @author <a href="mailto:lungu.cristian@gmail.com">Cristian Lungu</a>
 */
public interface WebServer extends Service {
    WebPage get(WebAddress url);
    WebPage post(WebAddress url, WebParams webParams);
}