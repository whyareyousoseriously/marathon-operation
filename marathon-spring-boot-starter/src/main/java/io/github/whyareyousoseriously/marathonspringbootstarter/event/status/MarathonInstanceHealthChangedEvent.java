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
public class MarathonInstanceHealthChangedEvent {
    private static final Logger logger = LoggerFactory.getLogger(MarathonInstanceHealthChangedEvent.class);
    public static final String INSTANCE_HEALTH_CHANGED_EVENT = "instance_health_changed_event";

    /**
     * {
     *   "instanceId": "my-app.instance-c7c311a4-b669-11e6-a48f-0ea4f4b1778c",
     *   "runSpecVersion": "2014-03-01T23:29:30.158Z",
     *   "healthy": true,
     *   "runSpecId": "/app-id",
     *   "timestamp": "2014-03-01T23:29:30.158Z",
     *   "eventType": "instance_health_changed_event"
     * }
     *
     */
    public String eventType;
    public String instanceId;
    public String runSpecVersion;
    public boolean healthy;
    public String runSpecId;
    public Date timestamp;

    public static MarathonInstanceHealthChangedEvent build(String json) {
        logger.debug("Create event from " + json);
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").create();
        return gson.fromJson(json, MarathonInstanceHealthChangedEvent.class);
    }

    @Override
    public String toString() {
        return ModelUtils.toString(this);
    }
}
