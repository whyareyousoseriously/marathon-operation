package io.github.whyareyousoseriously.marathonspringbootstarter.event.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import mesosphere.client.common.ModelUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

public class MarathonEventSubscriptionEvent {
    private static final Logger logger = LoggerFactory.getLogger(MarathonEventSubscriptionEvent.class);
    public static final String SUBSCRIBE_EVENT = "subscribe_event";
    public static final String UNSUBSCRIBE_EVENT = "unsubscribe_event";

    /***
     * {
     "eventType": "subscribe_event",
     "timestamp": "2014-03-01T23:29:30.158Z",
     "clientIp": "1.2.3.4",
     "callbackUrl": "http://subscriber.acme.org/callbacks"
     }
     */

    public String eventType;
    public Date timestamp;
    public String clientIp;
    public String callbackUrl;

    public static MarathonEventSubscriptionEvent build(String json) {
        logger.debug("Create event from " + json);
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").create();
        return gson.fromJson(json, MarathonEventSubscriptionEvent.class);
    }

    @Override
    public String toString() {
        return ModelUtils.toString(this);
    }
}
