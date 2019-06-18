package io.github.whyareyousoseriously.marathonspringbootstarter.event.status;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import mesosphere.client.common.ModelUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * @author chenzhen
 * Created by chenzhen on 2019/5/13.
 */
public class MarathonAppTerminatedEvent {
    private static final Logger logger = LoggerFactory.getLogger(MarathonAppTerminatedEvent.class);
    public static final String APP_TERMINATED_EVENT = "app_terminated_event";
    /**
     * {
     *   "eventType": "app_terminated_event",
     *   "timestamp": "2014-03-01T23:29:30.158Z",
     *   "appId": "/my-app"
     * }
     */
    public String eventType;
    public Date timestamp;
    public String appId;

    public static MarathonAppTerminatedEvent build(String json) {
        logger.debug("Create event from " + json);
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").create();
        return gson.fromJson(json, MarathonAppTerminatedEvent.class);
    }

    @Override
    public String toString() {
        return ModelUtils.toString(this);
    }

}
