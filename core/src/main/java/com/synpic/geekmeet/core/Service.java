package com.synpic.geekmeet.core;

/**
 * @author <a href="mailto:lungu.cristian@gmail.com">Cristian Lungu</a>
 */
public interface Service {
    /**
     * Starts the service. This method blocks until the service has completely started.
     */
    void start() throws Exception;

    /**
     * Stops the service. This method blocks until the service has completely shut down.
     */
    void stop();
}