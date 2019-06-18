package io.github.whyareyousoseriously.marathonspringbootstarter.event.healthcheck;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import mesosphere.client.common.ModelUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

public class MarathonHealthcheckEvent {
    private static final Logger logger = LoggerFactory.getLogger(MarathonHealthcheckEvent.class);

    @Expose(serialize = false, deserialize = false)
    public static final String ADD_HEALTH_CHECK_EVENT = "add_health_check_event";

    @Expose(serialize = false, deserialize = false)
    public static final String REMOVE_HEALTH_CHECK_EVENT = "remove_health_check_event";

    @Expose(serialize = false, deserialize = false)
    public static final String FAILED_HEALTH_CHECK_EVENT = "failed_health_check_event";

    @Expose(serialize = false, deserialize = false)
    public static final String HEALTH_STATUS_CHANGED_EVENT = "health_status_changed_event";

    @Expose(serialize = false, deserialize = false)
    public static final String UNHEALTHY_TASK_KILL_EVENT = "unhealthy_task_kill_event";


    public static class HealthcheckOption {
        public String protocol;
        public String path;
        public int portIndex;
        public int gracePeriodSeconds;
        public int intervalSeconds;
        public int timeoutSeconds;
        public int maxConsecutiveFailures;
    }

    /***
     * {
     "eventType": "add_health_check_event",
     "timestamp": "2014-03-01T23:29:30.158Z",
     "appId": "/my-app",
     "healthCheck": {
     "  protocol": "HTTP",
     "  path": "/health",
     "  portIndex": 0,
     "  gracePeriodSeconds": 5,
     "  intervalSeconds": 10,
     "  timeoutSeconds": 10,
     "  maxConsecutiveFailures": 3
     }
     }
     */
    public String eventType;
    public String appId;
    public Date timestamp;
    public String taskId;
    public String instanceId;
    public boolean alive;

    @SerializedName("healthCheck")
    public HealthcheckOption option = new HealthcheckOption();

    public static MarathonHealthcheckEvent build(String json) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").serializeNulls().create();
        logger.debug("Create event from: " + json);
        return gson.fromJson(json, MarathonHealthcheckEvent.class);
    }

    @Override
    public String toString() {
        return ModelUtils.toString(this);
    }
}
