package io.github.whyareyousoseriously.marathonspringbootstarter.marathon.pojo.v2task;

public class HealthCheckResult {

    private Boolean alive;
    private Integer consecutiveFailures;
    private String firstSuccess;
    private String instanceId;
    private String lastSuccess;

    public Boolean getAlive() {
        return alive;
    }

    public void setAlive(Boolean alive) {
        this.alive = alive;
    }

    public Integer getConsecutiveFailures() {
        return consecutiveFailures;
    }

    public void setConsecutiveFailures(Integer consecutiveFailures) {
        this.consecutiveFailures = consecutiveFailures;
    }

    public String getFirstSuccess() {
        return firstSuccess;
    }

    public void setFirstSuccess(String firstSuccess) {
        this.firstSuccess = firstSuccess;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getLastSuccess() {
        return lastSuccess;
    }

    public void setLastSuccess(String lastSuccess) {
        this.lastSuccess = lastSuccess;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HealthCheckResult.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("alive");
        sb.append('=');
        sb.append(((this.alive == null)?"<null>":this.alive));
        sb.append(',');
        sb.append("consecutiveFailures");
        sb.append('=');
        sb.append(((this.consecutiveFailures == null)?"<null>":this.consecutiveFailures));
        sb.append(',');
        sb.append("firstSuccess");
        sb.append('=');
        sb.append(((this.firstSuccess == null)?"<null>":this.firstSuccess));
        sb.append(',');
        sb.append("instanceId");
        sb.append('=');
        sb.append(((this.instanceId == null)?"<null>":this.instanceId));
        sb.append(',');
        sb.append("lastSuccess");
        sb.append('=');
        sb.append(((this.lastSuccess == null)?"<null>":this.lastSuccess));
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
        result = ((result* 31)+((this.consecutiveFailures == null)? 0 :this.consecutiveFailures.hashCode()));
        result = ((result* 31)+((this.instanceId == null)? 0 :this.instanceId.hashCode()));
        result = ((result* 31)+((this.alive == null)? 0 :this.alive.hashCode()));
        result = ((result* 31)+((this.firstSuccess == null)? 0 :this.firstSuccess.hashCode()));
        result = ((result* 31)+((this.lastSuccess == null)? 0 :this.lastSuccess.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HealthCheckResult) == false) {
            return false;
        }
        HealthCheckResult rhs = ((HealthCheckResult) other);
        return ((((((this.consecutiveFailures == rhs.consecutiveFailures)||((this.consecutiveFailures!= null)&&this.consecutiveFailures.equals(rhs.consecutiveFailures)))&&((this.instanceId == rhs.instanceId)||((this.instanceId!= null)&&this.instanceId.equals(rhs.instanceId))))&&((this.alive == rhs.alive)||((this.alive!= null)&&this.alive.equals(rhs.alive))))&&((this.firstSuccess == rhs.firstSuccess)||((this.firstSuccess!= null)&&this.firstSuccess.equals(rhs.firstSuccess))))&&((this.lastSuccess == rhs.lastSuccess)||((this.lastSuccess!= null)&&this.lastSuccess.equals(rhs.lastSuccess))));
    }

}
