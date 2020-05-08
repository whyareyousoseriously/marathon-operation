package io.github.whyareyousoseriously.marathonspringbootstarter.marathon.pojo.v2Deployment;


import java.util.ArrayList;
import java.util.List;

/**
 * @author chenzhen
 * Created by chenzhen on 2020/5/8.
 */
public class Deployment {
    private String id;
    private String version;
    private List<String> affectedApps = new ArrayList<String>();
    private List<Step> steps = new ArrayList<Step>();
    private List<CurrentAction> currentActions = new ArrayList<CurrentAction>();
    private Integer currentStep;
    private Integer totalSteps;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public List<String> getAffectedApps() {
        return affectedApps;
    }

    public void setAffectedApps(List<String> affectedApps) {
        this.affectedApps = affectedApps;
    }

    public List<Step> getSteps() {
        return steps;
    }

    public void setSteps(List<Step> steps) {
        this.steps = steps;
    }

    public List<CurrentAction> getCurrentActions() {
        return currentActions;
    }

    public void setCurrentActions(List<CurrentAction> currentActions) {
        this.currentActions = currentActions;
    }

    public Integer getCurrentStep() {
        return currentStep;
    }

    public void setCurrentStep(Integer currentStep) {
        this.currentStep = currentStep;
    }

    public Integer getTotalSteps() {
        return totalSteps;
    }

    public void setTotalSteps(Integer totalSteps) {
        this.totalSteps = totalSteps;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Deployment.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null)?"<null>":this.version));
        sb.append(',');
        sb.append("affectedApps");
        sb.append('=');
        sb.append(((this.affectedApps == null)?"<null>":this.affectedApps));
        sb.append(',');
        sb.append("steps");
        sb.append('=');
        sb.append(((this.steps == null)?"<null>":this.steps));
        sb.append(',');
        sb.append("currentActions");
        sb.append('=');
        sb.append(((this.currentActions == null)?"<null>":this.currentActions));
        sb.append(',');
        sb.append("currentStep");
        sb.append('=');
        sb.append(((this.currentStep == null)?"<null>":this.currentStep));
        sb.append(',');
        sb.append("totalSteps");
        sb.append('=');
        sb.append(((this.totalSteps == null)?"<null>":this.totalSteps));
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
        result = ((result* 31)+((this.currentStep == null)? 0 :this.currentStep.hashCode()));
        result = ((result* 31)+((this.affectedApps == null)? 0 :this.affectedApps.hashCode()));
        result = ((result* 31)+((this.currentActions == null)? 0 :this.currentActions.hashCode()));
        result = ((result* 31)+((this.totalSteps == null)? 0 :this.totalSteps.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.steps == null)? 0 :this.steps.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Deployment) == false) {
            return false;
        }
        Deployment rhs = ((Deployment) other);
        return ((((((((this.currentStep == rhs.currentStep)||((this.currentStep!= null)&&this.currentStep.equals(rhs.currentStep)))&&((this.affectedApps == rhs.affectedApps)||((this.affectedApps!= null)&&this.affectedApps.equals(rhs.affectedApps))))&&((this.currentActions == rhs.currentActions)||((this.currentActions!= null)&&this.currentActions.equals(rhs.currentActions))))&&((this.totalSteps == rhs.totalSteps)||((this.totalSteps!= null)&&this.totalSteps.equals(rhs.totalSteps))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.steps == rhs.steps)||((this.steps!= null)&&this.steps.equals(rhs.steps))));
    }
}
