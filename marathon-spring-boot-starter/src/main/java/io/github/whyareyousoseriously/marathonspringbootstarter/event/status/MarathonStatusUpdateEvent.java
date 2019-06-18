package io.github.whyareyousoseriously.marathonspringbootstarter.event.status;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import mesosphere.client.common.ModelUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.List;

public class MarathonStatusUpdateEvent {
    private static final Logger logger = LoggerFactory.getLogger(MarathonStatusUpdateEvent.class);
    public static final String STATUS_UPDATE_EVENT = "status_update_event";

    /***
     * {
     "eventType": "status_update_event",
     "timestamp": "2014-03-01T23:29:30.158Z",
     "slaveId": "20140909-054127-177048842-5050-1494-0",
     "taskId": "my-app_0-1396592784349",
     "taskStatus": "TASK_RUNNING",
     "appId": "/my-app",
     "host": "slave-1234.acme.org",
     "ports": [31372],
     "version": "2014-04-04T06:26:23.051Z"
     }
     */

    public String eventType;
    public Date timestamp;
    public String slaveId;
    public String taskId;
    public String taskStatus;
    public String appId;
    public String host;
    public List<Integer> ports;
    public String version;

    public static MarathonStatusUpdateEvent build(String json) {
        logger.debug("Create event from " + json);
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").create();
        return gson.fromJson(json, MarathonStatusUpdateEvent.class);
    }

    @Override
    public String toString() {
        return ModelUtils.toString(this);
    }
}
