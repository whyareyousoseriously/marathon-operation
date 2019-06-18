package io.github.whyareyousoseriously.marathonspringbootstarter.event.framework;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import mesosphere.client.common.ModelUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MarathonFrameworkMessageEvent {
    private static final Logger logger = LoggerFactory.getLogger(MarathonFrameworkMessageEvent.class);
    public static final String FRAMEWORK_MESSAGE_EVENT = "framework_message_event";

    /***
     * {
     "eventType": "framework_message_event",
     "timestamp": "2014-03-01T23:29:30.158Z",
     "slaveId": "20140909-054127-177048842-5050-1494-0",
     "executorId": "my-app.3f80d17a-37e6-11e4-b05e-56847afe9799",
     "message": "aGVsbG8gd29ybGQh"
     }
     */

    public String eventType;
    public String timestamp;
    public String slaveId;
    public String executorId;
    public String message;

    public static MarathonFrameworkMessageEvent build(String json) {
        logger.debug("Create event from " + json);
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").create();
        return gson.fromJson(json, MarathonFrameworkMessageEvent.class);
    }

    @Override
    public String toString() {
        return ModelUtils.toString(this);
    }
}
