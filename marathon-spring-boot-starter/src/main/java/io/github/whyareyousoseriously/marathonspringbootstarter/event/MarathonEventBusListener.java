package io.github.whyareyousoseriously.marathonspringbootstarter.event;

import com.launchdarkly.eventsource.EventHandler;
import com.launchdarkly.eventsource.EventSource;
import okhttp3.Headers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.URI;


public class MarathonEventBusListener {
    private static final Logger logger = LoggerFactory.getLogger(MarathonEventBusListener.class);
    private volatile EventSource es;
    private URI marathonURI;

    public MarathonEventBusListener(String marathonEndpoint, EventHandler eh) {
        marathonURI = URI.create(marathonEndpoint + "/v2/events");

        Headers headers = new Headers.Builder()
                .add("User-Agent", "JavaClient/MarathonEventBusListener")
                .build();

        EventSource.Builder builder = new EventSource.Builder(eh, marathonURI)
                .headers(headers)
                .reconnectTimeMs(3000);

//        if (config.proxy != null) {
//            builder.proxy(config.proxy);
//            if (config.proxyAuthenticator != null) {
//                builder.proxyAuthenticator(config.proxyAuthenticator);
//            }
//        }

        es = builder.build();
        logger.debug("MarathonEventBusListener created.");
    }
    public MarathonEventBusListener(String marathonEndpoint, String cookie,EventHandler eh) {
        marathonURI = URI.create(marathonEndpoint + "/v2/events");

        Headers headers = new Headers.Builder()
                .add("User-Agent", "JavaClient/MarathonEventBusListener")
                .add("Cookie",cookie)
                .build();

        EventSource.Builder builder = new EventSource.Builder(eh, marathonURI)
                .headers(headers)
                .reconnectTimeMs(3000);

//        if (config.proxy != null) {
//            builder.proxy(config.proxy);
//            if (config.proxyAuthenticator != null) {
//                builder.proxyAuthenticator(config.proxyAuthenticator);
//            }
//        }

        es = builder.build();
        logger.debug("MarathonEventBusListener created.");
    }

    public void start() {
        es.start();
        logger.info("Marathon EventBus Listener Started with Marathon at " + marathonURI.getHost());
    }

    public void close() throws IOException {
        es.close();
        logger.info("Marathon EventBus Listener closed.");
    }

}
