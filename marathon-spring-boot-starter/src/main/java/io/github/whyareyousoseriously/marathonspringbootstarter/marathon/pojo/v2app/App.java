package io.github.whyareyousoseriously.marathonspringbootstarter.marathon.pojo.v2app;



import io.github.whyareyousoseriously.marathonspringbootstarter.marathon.pojo.v2task.Task;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class App {

    private String id;
    private List<String> acceptedResourceRoles = new ArrayList<String>();
    private Double backoffFactor;
    private Integer backoffSeconds;
    private String cmd;
    private List<List<String>> constraints = new ArrayList<List<String>>();
    private Container container;
    private Double cpus;
    private Integer disk;
    private String executor;
    private Integer instances;
    private JSONObject labels;
    private Integer maxLaunchDelaySeconds;
    private Integer mem;
    private Integer gpus;
    private List<Network> networks = new ArrayList<Network>();
    private List<PortDefinition> portDefinitions = new ArrayList<PortDefinition>();
    private Boolean requirePorts;
    private UpgradeStrategy upgradeStrategy;
    private String version;
    private VersionInfo versionInfo;
    private String killSelection;
    private UnreachableStrategy unreachableStrategy;
    private Integer tasksStaged;
    private Integer tasksRunning;
    private Integer tasksHealthy;
    private Integer tasksUnhealthy;
    private List<Object> deployments = new ArrayList<Object>();
    private List<Task> tasks = new ArrayList<Task>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getAcceptedResourceRoles() {
        return acceptedResourceRoles;
    }

    public void setAcceptedResourceRoles(List<String> acceptedResourceRoles) {
        this.acceptedResourceRoles = acceptedResourceRoles;
    }

    public Double getBackoffFactor() {
        return backoffFactor;
    }

    public void setBackoffFactor(Double backoffFactor) {
        this.backoffFactor = backoffFactor;
    }

    public Integer getBackoffSeconds() {
        return backoffSeconds;
    }

    public void setBackoffSeconds(Integer backoffSeconds) {
        this.backoffSeconds = backoffSeconds;
    }

    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }

    public List<List<String>> getConstraints() {
        return constraints;
    }

    public void setConstraints(List<List<String>> constraints) {
        this.constraints = constraints;
    }

    public Container getContainer() {
        return container;
    }

    public void setContainer(Container container) {
        this.container = container;
    }

    public Double getCpus() {
        return cpus;
    }

    public void setCpus(Double cpus) {
        this.cpus = cpus;
    }

    public Integer getDisk() {
        return disk;
    }

    public void setDisk(Integer disk) {
        this.disk = disk;
    }

    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    public Integer getInstances() {
        return instances;
    }

    public void setInstances(Integer instances) {
        this.instances = instances;
    }

    public JSONObject getLabels() {
        return labels;
    }

    public void setLabels(JSONObject labels) {
        this.labels = labels;
    }

    public Integer getMaxLaunchDelaySeconds() {
        return maxLaunchDelaySeconds;
    }

    public void setMaxLaunchDelaySeconds(Integer maxLaunchDelaySeconds) {
        this.maxLaunchDelaySeconds = maxLaunchDelaySeconds;
    }

    public Integer getMem() {
        return mem;
    }

    public void setMem(Integer mem) {
        this.mem = mem;
    }

    public Integer getGpus() {
        return gpus;
    }

    public void setGpus(Integer gpus) {
        this.gpus = gpus;
    }

    public List<Network> getNetworks() {
        return networks;
    }

    public void setNetworks(List<Network> networks) {
        this.networks = networks;
    }

    public List<PortDefinition> getPortDefinitions() {
        return portDefinitions;
    }

    public void setPortDefinitions(List<PortDefinition> portDefinitions) {
        this.portDefinitions = portDefinitions;
    }

    public Boolean getRequirePorts() {
        return requirePorts;
    }

    public void setRequirePorts(Boolean requirePorts) {
        this.requirePorts = requirePorts;
    }

    public UpgradeStrategy getUpgradeStrategy() {
        return upgradeStrategy;
    }

    public void setUpgradeStrategy(UpgradeStrategy upgradeStrategy) {
        this.upgradeStrategy = upgradeStrategy;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public VersionInfo getVersionInfo() {
        return versionInfo;
    }

    public void setVersionInfo(VersionInfo versionInfo) {
        this.versionInfo = versionInfo;
    }

    public String getKillSelection() {
        return killSelection;
    }

    public void setKillSelection(String killSelection) {
        this.killSelection = killSelection;
    }

    public UnreachableStrategy getUnreachableStrategy() {
        return unreachableStrategy;
    }

    public void setUnreachableStrategy(UnreachableStrategy unreachableStrategy) {
        this.unreachableStrategy = unreachableStrategy;
    }

    public Integer getTasksStaged() {
        return tasksStaged;
    }

    public void setTasksStaged(Integer tasksStaged) {
        this.tasksStaged = tasksStaged;
    }

    public Integer getTasksRunning() {
        return tasksRunning;
    }

    public void setTasksRunning(Integer tasksRunning) {
        this.tasksRunning = tasksRunning;
    }

    public Integer getTasksHealthy() {
        return tasksHealthy;
    }

    public void setTasksHealthy(Integer tasksHealthy) {
        this.tasksHealthy = tasksHealthy;
    }

    public Integer getTasksUnhealthy() {
        return tasksUnhealthy;
    }

    public void setTasksUnhealthy(Integer tasksUnhealthy) {
        this.tasksUnhealthy = tasksUnhealthy;
    }

    public List<Object> getDeployments() {
        return deployments;
    }

    public void setDeployments(List<Object> deployments) {
        this.deployments = deployments;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(App.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("acceptedResourceRoles");
        sb.append('=');
        sb.append(((this.acceptedResourceRoles == null)?"<null>":this.acceptedResourceRoles));
        sb.append(',');
        sb.append("backoffFactor");
        sb.append('=');
        sb.append(((this.backoffFactor == null)?"<null>":this.backoffFactor));
        sb.append(',');
        sb.append("backoffSeconds");
        sb.append('=');
        sb.append(((this.backoffSeconds == null)?"<null>":this.backoffSeconds));
        sb.append(',');
        sb.append("cmd");
        sb.append('=');
        sb.append(((this.cmd == null)?"<null>":this.cmd));
        sb.append(',');
        sb.append("constraints");
        sb.append('=');
        sb.append(((this.constraints == null)?"<null>":this.constraints));
        sb.append(',');
        sb.append("container");
        sb.append('=');
        sb.append(((this.container == null)?"<null>":this.container));
        sb.append(',');
        sb.append("cpus");
        sb.append('=');
        sb.append(((this.cpus == null)?"<null>":this.cpus));
        sb.append(',');
        sb.append("disk");
        sb.append('=');
        sb.append(((this.disk == null)?"<null>":this.disk));
        sb.append(',');
        sb.append("executor");
        sb.append('=');
        sb.append(((this.executor == null)?"<null>":this.executor));
        sb.append(',');
        sb.append("instances");
        sb.append('=');
        sb.append(((this.instances == null)?"<null>":this.instances));
        sb.append(',');
        sb.append("labels");
        sb.append('=');
        sb.append(((this.labels == null)?"<null>":this.labels));
        sb.append(',');
        sb.append("maxLaunchDelaySeconds");
        sb.append('=');
        sb.append(((this.maxLaunchDelaySeconds == null)?"<null>":this.maxLaunchDelaySeconds));
        sb.append(',');
        sb.append("mem");
        sb.append('=');
        sb.append(((this.mem == null)?"<null>":this.mem));
        sb.append(',');
        sb.append("gpus");
        sb.append('=');
        sb.append(((this.gpus == null)?"<null>":this.gpus));
        sb.append(',');
        sb.append("networks");
        sb.append('=');
        sb.append(((this.networks == null)?"<null>":this.networks));
        sb.append(',');
        sb.append("portDefinitions");
        sb.append('=');
        sb.append(((this.portDefinitions == null)?"<null>":this.portDefinitions));
        sb.append(',');
        sb.append("requirePorts");
        sb.append('=');
        sb.append(((this.requirePorts == null)?"<null>":this.requirePorts));
        sb.append(',');
        sb.append("upgradeStrategy");
        sb.append('=');
        sb.append(((this.upgradeStrategy == null)?"<null>":this.upgradeStrategy));
        sb.append(',');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null)?"<null>":this.version));
        sb.append(',');
        sb.append("versionInfo");
        sb.append('=');
        sb.append(((this.versionInfo == null)?"<null>":this.versionInfo));
        sb.append(',');
        sb.append("killSelection");
        sb.append('=');
        sb.append(((this.killSelection == null)?"<null>":this.killSelection));
        sb.append(',');
        sb.append("unreachableStrategy");
        sb.append('=');
        sb.append(((this.unreachableStrategy == null)?"<null>":this.unreachableStrategy));
        sb.append(',');
        sb.append("tasksStaged");
        sb.append('=');
        sb.append(((this.tasksStaged == null)?"<null>":this.tasksStaged));
        sb.append(',');
        sb.append("tasksRunning");
        sb.append('=');
        sb.append(((this.tasksRunning == null)?"<null>":this.tasksRunning));
        sb.append(',');
        sb.append("tasksHealthy");
        sb.append('=');
        sb.append(((this.tasksHealthy == null)?"<null>":this.tasksHealthy));
        sb.append(',');
        sb.append("tasksUnhealthy");
        sb.append('=');
        sb.append(((this.tasksUnhealthy == null)?"<null>":this.tasksUnhealthy));
        sb.append(',');
        sb.append("deployments");
        sb.append('=');
        sb.append(((this.deployments == null)?"<null>":this.deployments));
        sb.append(',');
        sb.append("tasks");
        sb.append('=');
        sb.append(((this.tasks == null)?"<null>":this.tasks));
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
        result = ((result* 31)+((this.container == null)? 0 :this.container.hashCode()));
        result = ((result* 31)+((this.unreachableStrategy == null)? 0 :this.unreachableStrategy.hashCode()));
        result = ((result* 31)+((this.instances == null)? 0 :this.instances.hashCode()));
        result = ((result* 31)+((this.maxLaunchDelaySeconds == null)? 0 :this.maxLaunchDelaySeconds.hashCode()));
        result = ((result* 31)+((this.acceptedResourceRoles == null)? 0 :this.acceptedResourceRoles.hashCode()));
        result = ((result* 31)+((this.upgradeStrategy == null)? 0 :this.upgradeStrategy.hashCode()));
        result = ((result* 31)+((this.networks == null)? 0 :this.networks.hashCode()));
        result = ((result* 31)+((this.killSelection == null)? 0 :this.killSelection.hashCode()));
        result = ((result* 31)+((this.constraints == null)? 0 :this.constraints.hashCode()));
        result = ((result* 31)+((this.mem == null)? 0 :this.mem.hashCode()));
        result = ((result* 31)+((this.executor == null)? 0 :this.executor.hashCode()));
        result = ((result* 31)+((this.tasksUnhealthy == null)? 0 :this.tasksUnhealthy.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.tasksRunning == null)? 0 :this.tasksRunning.hashCode()));
        result = ((result* 31)+((this.tasks == null)? 0 :this.tasks.hashCode()));
        result = ((result* 31)+((this.backoffFactor == null)? 0 :this.backoffFactor.hashCode()));
        result = ((result* 31)+((this.cpus == null)? 0 :this.cpus.hashCode()));
        result = ((result* 31)+((this.tasksHealthy == null)? 0 :this.tasksHealthy.hashCode()));
        result = ((result* 31)+((this.backoffSeconds == null)? 0 :this.backoffSeconds.hashCode()));
        result = ((result* 31)+((this.versionInfo == null)? 0 :this.versionInfo.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.labels == null)? 0 :this.labels.hashCode()));
        result = ((result* 31)+((this.disk == null)? 0 :this.disk.hashCode()));
        result = ((result* 31)+((this.deployments == null)? 0 :this.deployments.hashCode()));
        result = ((result* 31)+((this.requirePorts == null)? 0 :this.requirePorts.hashCode()));
        result = ((result* 31)+((this.gpus == null)? 0 :this.gpus.hashCode()));
        result = ((result* 31)+((this.portDefinitions == null)? 0 :this.portDefinitions.hashCode()));
        result = ((result* 31)+((this.cmd == null)? 0 :this.cmd.hashCode()));
        result = ((result* 31)+((this.tasksStaged == null)? 0 :this.tasksStaged.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof App) == false) {
            return false;
        }
        App rhs = ((App) other);
        return ((((((((((((((((((((((((((((((this.container == rhs.container)||((this.container!= null)&&this.container.equals(rhs.container)))&&((this.unreachableStrategy == rhs.unreachableStrategy)||((this.unreachableStrategy!= null)&&this.unreachableStrategy.equals(rhs.unreachableStrategy))))&&((this.instances == rhs.instances)||((this.instances!= null)&&this.instances.equals(rhs.instances))))&&((this.maxLaunchDelaySeconds == rhs.maxLaunchDelaySeconds)||((this.maxLaunchDelaySeconds!= null)&&this.maxLaunchDelaySeconds.equals(rhs.maxLaunchDelaySeconds))))&&((this.acceptedResourceRoles == rhs.acceptedResourceRoles)||((this.acceptedResourceRoles!= null)&&this.acceptedResourceRoles.equals(rhs.acceptedResourceRoles))))&&((this.upgradeStrategy == rhs.upgradeStrategy)||((this.upgradeStrategy!= null)&&this.upgradeStrategy.equals(rhs.upgradeStrategy))))&&((this.networks == rhs.networks)||((this.networks!= null)&&this.networks.equals(rhs.networks))))&&((this.killSelection == rhs.killSelection)||((this.killSelection!= null)&&this.killSelection.equals(rhs.killSelection))))&&((this.constraints == rhs.constraints)||((this.constraints!= null)&&this.constraints.equals(rhs.constraints))))&&((this.mem == rhs.mem)||((this.mem!= null)&&this.mem.equals(rhs.mem))))&&((this.executor == rhs.executor)||((this.executor!= null)&&this.executor.equals(rhs.executor))))&&((this.tasksUnhealthy == rhs.tasksUnhealthy)||((this.tasksUnhealthy!= null)&&this.tasksUnhealthy.equals(rhs.tasksUnhealthy))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.tasksRunning == rhs.tasksRunning)||((this.tasksRunning!= null)&&this.tasksRunning.equals(rhs.tasksRunning))))&&((this.tasks == rhs.tasks)||((this.tasks!= null)&&this.tasks.equals(rhs.tasks))))&&((this.backoffFactor == rhs.backoffFactor)||((this.backoffFactor!= null)&&this.backoffFactor.equals(rhs.backoffFactor))))&&((this.cpus == rhs.cpus)||((this.cpus!= null)&&this.cpus.equals(rhs.cpus))))&&((this.tasksHealthy == rhs.tasksHealthy)||((this.tasksHealthy!= null)&&this.tasksHealthy.equals(rhs.tasksHealthy))))&&((this.backoffSeconds == rhs.backoffSeconds)||((this.backoffSeconds!= null)&&this.backoffSeconds.equals(rhs.backoffSeconds))))&&((this.versionInfo == rhs.versionInfo)||((this.versionInfo!= null)&&this.versionInfo.equals(rhs.versionInfo))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.labels == rhs.labels)||((this.labels!= null)&&this.labels.equals(rhs.labels))))&&((this.disk == rhs.disk)||((this.disk!= null)&&this.disk.equals(rhs.disk))))&&((this.deployments == rhs.deployments)||((this.deployments!= null)&&this.deployments.equals(rhs.deployments))))&&((this.requirePorts == rhs.requirePorts)||((this.requirePorts!= null)&&this.requirePorts.equals(rhs.requirePorts))))&&((this.gpus == rhs.gpus)||((this.gpus!= null)&&this.gpus.equals(rhs.gpus))))&&((this.portDefinitions == rhs.portDefinitions)||((this.portDefinitions!= null)&&this.portDefinitions.equals(rhs.portDefinitions))))&&((this.cmd == rhs.cmd)||((this.cmd!= null)&&this.cmd.equals(rhs.cmd))))&&((this.tasksStaged == rhs.tasksStaged)||((this.tasksStaged!= null)&&this.tasksStaged.equals(rhs.tasksStaged))));
    }

}
