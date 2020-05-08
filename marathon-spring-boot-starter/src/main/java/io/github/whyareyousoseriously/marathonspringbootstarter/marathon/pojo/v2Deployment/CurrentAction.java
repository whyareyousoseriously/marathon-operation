package io.github.whyareyousoseriously.marathonspringbootstarter.marathon.pojo.v2Deployment;

import java.util.ArrayList;
import java.util.List;

public class CurrentAction {

    private String action;
    private String app;
    private List<Object> readinessCheckResults = new ArrayList<Object>();

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public List<Object> getReadinessCheckResults() {
        return readinessCheckResults;
    }

    public void setReadinessCheckResults(List<Object> readinessCheckResults) {
        this.readinessCheckResults = readinessCheckResults;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CurrentAction.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("action");
        sb.append('=');
        sb.append(((this.action == null)?"<null>":this.action));
        sb.append(',');
        sb.append("app");
        sb.append('=');
        sb.append(((this.app == null)?"<null>":this.app));
        sb.append(',');
        sb.append("readinessCheckResults");
        sb.append('=');
        sb.append(((this.readinessCheckResults == null)?"<null>":this.readinessCheckResults));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.app == null)? 0 :this.app.hashCode()));
        result = ((result* 31)+((this.action == null)? 0 :this.action.hashCode()));
        result = ((result* 31)+((this.readinessCheckResults == null)? 0 :this.readinessCheckResults.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CurrentAction) == false) {
            return false;
        }
        CurrentAction rhs = ((CurrentAction) other);
        return ((((this.app == rhs.app)||((this.app!= null)&&this.app.equals(rhs.app)))&&((this.action == rhs.action)||((this.action!= null)&&this.action.equals(rhs.action))))&&((this.readinessCheckResults == rhs.readinessCheckResults)||((this.readinessCheckResults!= null)&&this.readinessCheckResults.equals(rhs.readinessCheckResults))));
    }

}
