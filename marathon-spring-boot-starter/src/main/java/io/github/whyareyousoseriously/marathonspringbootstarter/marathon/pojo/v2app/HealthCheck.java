package io.github.whyareyousoseriously.marathonspringbootstarter.marathon.pojo.v2app;

public class HealthCheck {

    private Integer gracePeriodSeconds;
    private Boolean ignoreHttp1xx;
    private Integer intervalSeconds;
    private Integer maxConsecutiveFailures;
    private String path;
    private Integer portIndex;
    private String protocol;
    private String ipProtocol;
    private Integer timeoutSeconds;
    private Integer delaySeconds;

    public Integer getGracePeriodSeconds() {
        return gracePeriodSeconds;
    }

    public void setGracePeriodSeconds(Integer gracePeriodSeconds) {
        this.gracePeriodSeconds = gracePeriodSeconds;
    }

    public Boolean getIgnoreHttp1xx() {
        return ignoreHttp1xx;
    }

    public void setIgnoreHttp1xx(Boolean ignoreHttp1xx) {
        this.ignoreHttp1xx = ignoreHttp1xx;
    }

    public Integer getIntervalSeconds() {
        return intervalSeconds;
    }

    public void setIntervalSeconds(Integer intervalSeconds) {
        this.intervalSeconds = intervalSeconds;
    }

    public Integer getMaxConsecutiveFailures() {
        return maxConsecutiveFailures;
    }

    public void setMaxConsecutiveFailures(Integer maxConsecutiveFailures) {
        this.maxConsecutiveFailures = maxConsecutiveFailures;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getPortIndex() {
        return portIndex;
    }

    public void setPortIndex(Integer portIndex) {
        this.portIndex = portIndex;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getIpProtocol() {
        return ipProtocol;
    }

    public void setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
    }

    public Integer getTimeoutSeconds() {
        return timeoutSeconds;
    }

    public void setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }

    public Integer getDelaySeconds() {
        return delaySeconds;
    }

    public void setDelaySeconds(Integer delaySeconds) {
        this.delaySeconds = delaySeconds;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HealthCheck.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("gracePeriodSeconds");
        sb.append('=');
        sb.append(((this.gracePeriodSeconds == null)?"<null>":this.gracePeriodSeconds));
        sb.append(',');
        sb.append("ignoreHttp1xx");
        sb.append('=');
        sb.append(((this.ignoreHttp1xx == null)?"<null>":this.ignoreHttp1xx));
        sb.append(',');
        sb.append("intervalSeconds");
        sb.append('=');
        sb.append(((this.intervalSeconds == null)?"<null>":this.intervalSeconds));
        sb.append(',');
        sb.append("maxConsecutiveFailures");
        sb.append('=');
        sb.append(((this.maxConsecutiveFailures == null)?"<null>":this.maxConsecutiveFailures));
        sb.append(',');
        sb.append("path");
        sb.append('=');
        sb.append(((this.path == null)?"<null>":this.path));
        sb.append(',');
        sb.append("portIndex");
        sb.append('=');
        sb.append(((this.portIndex == null)?"<null>":this.portIndex));
        sb.append(',');
        sb.append("protocol");
        sb.append('=');
        sb.append(((this.protocol == null)?"<null>":this.protocol));
        sb.append(',');
        sb.append("ipProtocol");
        sb.append('=');
        sb.append(((this.ipProtocol == null)?"<null>":this.ipProtocol));
        sb.append(',');
        sb.append("timeoutSeconds");
        sb.append('=');
        sb.append(((this.timeoutSeconds == null)?"<null>":this.timeoutSeconds));
        sb.append(',');
        sb.append("delaySeconds");
        sb.append('=');
        sb.append(((this.delaySeconds == null)?"<null>":this.delaySeconds));
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
        result = ((result* 31)+((this.delaySeconds == null)? 0 :this.delaySeconds.hashCode()));
        result = ((result* 31)+((this.path == null)? 0 :this.path.hashCode()));
        result = ((result* 31)+((this.portIndex == null)? 0 :this.portIndex.hashCode()));
        result = ((result* 31)+((this.protocol == null)? 0 :this.protocol.hashCode()));
        result = ((result* 31)+((this.timeoutSeconds == null)? 0 :this.timeoutSeconds.hashCode()));
        result = ((result* 31)+((this.ignoreHttp1xx == null)? 0 :this.ignoreHttp1xx.hashCode()));
        result = ((result* 31)+((this.gracePeriodSeconds == null)? 0 :this.gracePeriodSeconds.hashCode()));
        result = ((result* 31)+((this.ipProtocol == null)? 0 :this.ipProtocol.hashCode()));
        result = ((result* 31)+((this.maxConsecutiveFailures == null)? 0 :this.maxConsecutiveFailures.hashCode()));
        result = ((result* 31)+((this.intervalSeconds == null)? 0 :this.intervalSeconds.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HealthCheck) == false) {
            return false;
        }
        HealthCheck rhs = ((HealthCheck) other);
        return (((((((((((this.delaySeconds == rhs.delaySeconds)||((this.delaySeconds!= null)&&this.delaySeconds.equals(rhs.delaySeconds)))&&((this.path == rhs.path)||((this.path!= null)&&this.path.equals(rhs.path))))&&((this.portIndex == rhs.portIndex)||((this.portIndex!= null)&&this.portIndex.equals(rhs.portIndex))))&&((this.protocol == rhs.protocol)||((this.protocol!= null)&&this.protocol.equals(rhs.protocol))))&&((this.timeoutSeconds == rhs.timeoutSeconds)||((this.timeoutSeconds!= null)&&this.timeoutSeconds.equals(rhs.timeoutSeconds))))&&((this.ignoreHttp1xx == rhs.ignoreHttp1xx)||((this.ignoreHttp1xx!= null)&&this.ignoreHttp1xx.equals(rhs.ignoreHttp1xx))))&&((this.gracePeriodSeconds == rhs.gracePeriodSeconds)||((this.gracePeriodSeconds!= null)&&this.gracePeriodSeconds.equals(rhs.gracePeriodSeconds))))&&((this.ipProtocol == rhs.ipProtocol)||((this.ipProtocol!= null)&&this.ipProtocol.equals(rhs.ipProtocol))))&&((this.maxConsecutiveFailures == rhs.maxConsecutiveFailures)||((this.maxConsecutiveFailures!= null)&&this.maxConsecutiveFailures.equals(rhs.maxConsecutiveFailures))))&&((this.intervalSeconds == rhs.intervalSeconds)||((this.intervalSeconds!= null)&&this.intervalSeconds.equals(rhs.intervalSeconds))));
    }

}
