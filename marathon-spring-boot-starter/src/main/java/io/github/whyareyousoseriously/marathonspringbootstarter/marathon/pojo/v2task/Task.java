package io.github.whyareyousoseriously.marathonspringbootstarter.marathon.pojo.v2task;

import java.util.ArrayList;
import java.util.List;

public class Task {

    private String appId;
    private List<HealthCheckResult> healthCheckResults = new ArrayList<HealthCheckResult>();
    private String host;
    private String id;
    private List<IpAddress> ipAddresses = new ArrayList<IpAddress>();
    private List<Integer> ports = new ArrayList<Integer>();
    private List<Integer> servicePorts = new ArrayList<Integer>();
    private String slaveId;
    private String state;
    private String stagedAt;
    private String startedAt;
    private String version;
    private List<Object> localVolumes = new ArrayList<Object>();

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public List<HealthCheckResult> getHealthCheckResults() {
        return healthCheckResults;
    }

    public void setHealthCheckResults(List<HealthCheckResult> healthCheckResults) {
        this.healthCheckResults = healthCheckResults;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<IpAddress> getIpAddresses() {
        return ipAddresses;
    }

    public void setIpAddresses(List<IpAddress> ipAddresses) {
        this.ipAddresses = ipAddresses;
    }

    public List<Integer> getPorts() {
        return ports;
    }

    public void setPorts(List<Integer> ports) {
        this.ports = ports;
    }

    public List<Integer> getServicePorts() {
        return servicePorts;
    }

    public void setServicePorts(List<Integer> servicePorts) {
        this.servicePorts = servicePorts;
    }

    public String getSlaveId() {
        return slaveId;
    }

    public void setSlaveId(String slaveId) {
        this.slaveId = slaveId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStagedAt() {
        return stagedAt;
    }

    public void setStagedAt(String stagedAt) {
        this.stagedAt = stagedAt;
    }

    public String getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(String startedAt) {
        this.startedAt = startedAt;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public List<Object> getLocalVolumes() {
        return localVolumes;
    }

    public void setLocalVolumes(List<Object> localVolumes) {
        this.localVolumes = localVolumes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Task.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("appId");
        sb.append('=');
        sb.append(((this.appId == null)?"<null>":this.appId));
        sb.append(',');
        sb.append("healthCheckResults");
        sb.append('=');
        sb.append(((this.healthCheckResults == null)?"<null>":this.healthCheckResults));
        sb.append(',');
        sb.append("host");
        sb.append('=');
        sb.append(((this.host == null)?"<null>":this.host));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("ipAddresses");
        sb.append('=');
        sb.append(((this.ipAddresses == null)?"<null>":this.ipAddresses));
        sb.append(',');
        sb.append("ports");
        sb.append('=');
        sb.append(((this.ports == null)?"<null>":this.ports));
        sb.append(',');
        sb.append("servicePorts");
        sb.append('=');
        sb.append(((this.servicePorts == null)?"<null>":this.servicePorts));
        sb.append(',');
        sb.append("slaveId");
        sb.append('=');
        sb.append(((this.slaveId == null)?"<null>":this.slaveId));
        sb.append(',');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null)?"<null>":this.state));
        sb.append(',');
        sb.append("stagedAt");
        sb.append('=');
        sb.append(((this.stagedAt == null)?"<null>":this.stagedAt));
        sb.append(',');
        sb.append("startedAt");
        sb.append('=');
        sb.append(((this.startedAt == null)?"<null>":this.startedAt));
        sb.append(',');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null)?"<null>":this.version));
        sb.append(',');
        sb.append("localVolumes");
        sb.append('=');
        sb.append(((this.localVolumes == null)?"<null>":this.localVolumes));
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
        result = ((result* 31)+((this.stagedAt == null)? 0 :this.stagedAt.hashCode()));
        result = ((result* 31)+((this.startedAt == null)? 0 :this.startedAt.hashCode()));
        result = ((result* 31)+((this.ports == null)? 0 :this.ports.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.slaveId == null)? 0 :this.slaveId.hashCode()));
        result = ((result* 31)+((this.appId == null)? 0 :this.appId.hashCode()));
        result = ((result* 31)+((this.localVolumes == null)? 0 :this.localVolumes.hashCode()));
        result = ((result* 31)+((this.host == null)? 0 :this.host.hashCode()));
        result = ((result* 31)+((this.ipAddresses == null)? 0 :this.ipAddresses.hashCode()));
        result = ((result* 31)+((this.healthCheckResults == null)? 0 :this.healthCheckResults.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.state == null)? 0 :this.state.hashCode()));
        result = ((result* 31)+((this.servicePorts == null)? 0 :this.servicePorts.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Task) == false) {
            return false;
        }
        Task rhs = ((Task) other);
        return ((((((((((((((this.stagedAt == rhs.stagedAt)||((this.stagedAt!= null)&&this.stagedAt.equals(rhs.stagedAt)))&&((this.startedAt == rhs.startedAt)||((this.startedAt!= null)&&this.startedAt.equals(rhs.startedAt))))&&((this.ports == rhs.ports)||((this.ports!= null)&&this.ports.equals(rhs.ports))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.slaveId == rhs.slaveId)||((this.slaveId!= null)&&this.slaveId.equals(rhs.slaveId))))&&((this.appId == rhs.appId)||((this.appId!= null)&&this.appId.equals(rhs.appId))))&&((this.localVolumes == rhs.localVolumes)||((this.localVolumes!= null)&&this.localVolumes.equals(rhs.localVolumes))))&&((this.host == rhs.host)||((this.host!= null)&&this.host.equals(rhs.host))))&&((this.ipAddresses == rhs.ipAddresses)||((this.ipAddresses!= null)&&this.ipAddresses.equals(rhs.ipAddresses))))&&((this.healthCheckResults == rhs.healthCheckResults)||((this.healthCheckResults!= null)&&this.healthCheckResults.equals(rhs.healthCheckResults))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.state == rhs.state)||((this.state!= null)&&this.state.equals(rhs.state))))&&((this.servicePorts == rhs.servicePorts)||((this.servicePorts!= null)&&this.servicePorts.equals(rhs.servicePorts))));
    }

}
