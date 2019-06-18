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
public class MarathonInstanceChangedEvent {

    private static final Logger logger = LoggerFactory.getLogger(MarathonInstanceChangedEvent.class);
    public static final String INSTANCE_CHANGED_EVENT = "instance_changed_event";
    /**
     * {
     *  "instanceId": "my-app.instance-c7c311a4-b669-11e6-a48f-0ea4f4b1778c",
     *  "condition": "Running",
     *  "runSpecId": "/app-id",
     *  "agentId": "20140909-054127-177048842-5050-1494-0",
     *  "host": "slave-1234.acme.org",
     *  "runSpecVersion": "2014-03-01T23:29:30.158Z",
     *  "timestamp": "2014-03-01T23:29:30.158Z",
     *  "eventType": "instance_changed_event"
     * }
     */
    public String instanceId;
    public String condition;
    public String runSpecId;
    public String agentId;
    public String host;
    public String runSpecVersion;
    public Date timestamp;
    public String eventType;
    public static MarathonInstanceChangedEvent build(String json) {
        logger.debug("Create event from " + json);
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").create();
        return gson.fromJson(json, MarathonInstanceChangedEvent.class);
    }

    @Override
    public String toString() {
        return ModelUtils.toString(this);
    }
}
