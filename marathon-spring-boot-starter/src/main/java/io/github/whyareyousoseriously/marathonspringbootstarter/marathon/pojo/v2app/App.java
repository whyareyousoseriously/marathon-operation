package io.github.whyareyousoseriously.marathonspringbootstarter.marathon.pojo.v2app;



import io.github.whyareyousoseriously.marathonspringbootstarter.marathon.pojo.v2task.Task;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
    private JSONObject env;
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


    public JSONObject getEnv() {
        return env;
    }

    public App setEnv(JSONObject env) {
        this.env = env;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        App app = (App) o;
        return Objects.equals(id, app.id) &&
                Objects.equals(acceptedResourceRoles, app.acceptedResourceRoles) &&
                Objects.equals(backoffFactor, app.backoffFactor) &&
                Objects.equals(backoffSeconds, app.backoffSeconds) &&
                Objects.equals(cmd, app.cmd) &&
                Objects.equals(constraints, app.constraints) &&
                Objects.equals(container, app.container) &&
                Objects.equals(cpus, app.cpus) &&
                Objects.equals(disk, app.disk) &&
                Objects.equals(executor, app.executor) &&
                Objects.equals(instances, app.instances) &&
                Objects.equals(labels, app.labels) &&
                Objects.equals(env, app.env) &&
                Objects.equals(maxLaunchDelaySeconds, app.maxLaunchDelaySeconds) &&
                Objects.equals(mem, app.mem) &&
                Objects.equals(gpus, app.gpus) &&
                Objects.equals(networks, app.networks) &&
                Objects.equals(portDefinitions, app.portDefinitions) &&
                Objects.equals(requirePorts, app.requirePorts) &&
                Objects.equals(upgradeStrategy, app.upgradeStrategy) &&
                Objects.equals(version, app.version) &&
                Objects.equals(versionInfo, app.versionInfo) &&
                Objects.equals(killSelection, app.killSelection) &&
                Objects.equals(unreachableStrategy, app.unreachableStrategy) &&
                Objects.equals(tasksStaged, app.tasksStaged) &&
                Objects.equals(tasksRunning, app.tasksRunning) &&
                Objects.equals(tasksHealthy, app.tasksHealthy) &&
                Objects.equals(tasksUnhealthy, app.tasksUnhealthy) &&
                Objects.equals(deployments, app.deployments) &&
                Objects.equals(tasks, app.tasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, acceptedResourceRoles, backoffFactor, backoffSeconds, cmd, constraints, container, cpus, disk, executor, instances, labels, env, maxLaunchDelaySeconds, mem, gpus, networks, portDefinitions, requirePorts, upgradeStrategy, version, versionInfo, killSelection, unreachableStrategy, tasksStaged, tasksRunning, tasksHealthy, tasksUnhealthy, deployments, tasks);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("App{");
        sb.append("id='").append(id).append('\'');
        sb.append(", acceptedResourceRoles=").append(acceptedResourceRoles);
        sb.append(", backoffFactor=").append(backoffFactor);
        sb.append(", backoffSeconds=").append(backoffSeconds);
        sb.append(", cmd='").append(cmd).append('\'');
        sb.append(", constraints=").append(constraints);
        sb.append(", container=").append(container);
        sb.append(", cpus=").append(cpus);
        sb.append(", disk=").append(disk);
        sb.append(", executor='").append(executor).append('\'');
        sb.append(", instances=").append(instances);
        sb.append(", labels=").append(labels);
        sb.append(", env=").append(env);
        sb.append(", maxLaunchDelaySeconds=").append(maxLaunchDelaySeconds);
        sb.append(", mem=").append(mem);
        sb.append(", gpus=").append(gpus);
        sb.append(", networks=").append(networks);
        sb.append(", portDefinitions=").append(portDefinitions);
        sb.append(", requirePorts=").append(requirePorts);
        sb.append(", upgradeStrategy=").append(upgradeStrategy);
        sb.append(", version='").append(version).append('\'');
        sb.append(", versionInfo=").append(versionInfo);
        sb.append(", killSelection='").append(killSelection).append('\'');
        sb.append(", unreachableStrategy=").append(unreachableStrategy);
        sb.append(", tasksStaged=").append(tasksStaged);
        sb.append(", tasksRunning=").append(tasksRunning);
        sb.append(", tasksHealthy=").append(tasksHealthy);
        sb.append(", tasksUnhealthy=").append(tasksUnhealthy);
        sb.append(", deployments=").append(deployments);
        sb.append(", tasks=").append(tasks);
        sb.append('}');
        return sb.toString();
    }
}
