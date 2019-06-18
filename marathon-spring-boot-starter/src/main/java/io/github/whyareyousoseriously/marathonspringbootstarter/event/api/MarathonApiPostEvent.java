package io.github.whyareyousoseriously.marathonspringbootstarter.event.api;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import mesosphere.client.common.ModelUtils;
import mesosphere.marathon.client.model.v2.App;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MarathonApiPostEvent {
    private static final Logger logger = LoggerFactory.getLogger(MarathonApiPostEvent.class);

    @Expose(serialize = false, deserialize = false)
    public static final String API_POST_EVENT = "api_post_event";

    public String eventType;
    public String timestamp;
    public String clientIp;
    public String uri;

    @SerializedName("appDefinition")
    public App appDefinition = new App();

    public static MarathonApiPostEvent build(String json) {
        logger.debug("Create event from " + json);
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").serializeNulls().create();
        return gson.fromJson(json, MarathonApiPostEvent.class);
    }

    @Override
    public String toString() {
        return ModelUtils.toString(this);
    }
}
