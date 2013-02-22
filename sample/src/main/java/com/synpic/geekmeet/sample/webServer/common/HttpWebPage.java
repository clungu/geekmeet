package com.synpic.geekmeet.sample.webServer.common;

import com.synpic.geekmeet.core.webServer.WebPage;

/**
 * @author <a href="mailto:lungu.cristian@gmail.com">Cristian Lungu</a>
 */
public class HttpWebPage implements WebPage {
    public String getContents() {
        return "Some web page here!";
    }
}
