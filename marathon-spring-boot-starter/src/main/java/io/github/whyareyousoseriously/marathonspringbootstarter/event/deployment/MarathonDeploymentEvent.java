package io.github.whyareyousoseriously.marathonspringbootstarter.event.deployment;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import mesosphere.client.common.ModelUtils;
import mesosphere.marathon.client.model.v2.App;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class MarathonDeploymentEvent {
    private static final Logger logger = LoggerFactory.getLogger(MarathonDeploymentEvent.class);

    public static final String DEPLOYMENT_INFO = "deployment_info";
    public static final String DEPLOYMENT_STEP_SUCCESS = "deployment_step_success";
    public static final String DEPLOYMENT_STEP_FAILURE = "deployment_step_failure";


    public static class Action {
        public String type;
        public String app;
    }

    public static class CurrentStep {
        public List<Action> actions;
    }

    public static class Step {
        public String action;
        public String app;
    }

    public class MarathonDeploymentPlan {

        @SerializedName("apps")
        public List<App> apps;

        public List<String> dependencies;
        public List<String> groups;
        public String id;
        public String version;

    }

    public static class Plan {
        public String id;
        public MarathonDeploymentPlan original;
        public MarathonDeploymentPlan target;
        public List<Step> steps;
        public String version;
    }

    public String eventType;
    public String timestamp;

    public Plan plan;

    public CurrentStep currentStep;

    public static MarathonDeploymentEvent build(String json) {
        logger.debug("Create event from " + json);
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").create();
        return gson.fromJson(json, MarathonDeploymentEvent.class);
    }

    @Override
    public String toString() {
        return ModelUtils.toString(this);
    }
}
