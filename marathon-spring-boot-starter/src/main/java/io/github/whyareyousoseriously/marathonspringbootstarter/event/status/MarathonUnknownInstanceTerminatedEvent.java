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
public class MarathonUnknownInstanceTerminatedEvent {

    private static final Logger logger = LoggerFactory.getLogger(MarathonUnknownInstanceTerminatedEvent.class);
    public static final String UNKNOWN_INSTANCE_TERMINATED_EVENT = "unknown_instance_terminated_event";
    /**
     * {
     *   "instanceId": "my-app.instance-c7c311a4-b669-11e6-a48f-0ea4f4b1778c",
     *   "runSpecId": "/app-id",
     *   "condition": "Running",
     *   "timestamp": "2014-03-01T23:29:30.158Z",
     *   "eventType": "unknown_instance_terminated_event"
     * }
     */
    public String eventType;
    public String instanceId;
    public String runSpecId;
    public String condition;
    public Date timestamp;
    public static MarathonUnknownInstanceTerminatedEvent build(String json) {
        logger.debug("Create event from " + json);
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").create();
        return gson.fromJson(json, MarathonUnknownInstanceTerminatedEvent.class);
    }

    @Override
    public String toString() {
        return ModelUtils.toString(this);
    }
}
