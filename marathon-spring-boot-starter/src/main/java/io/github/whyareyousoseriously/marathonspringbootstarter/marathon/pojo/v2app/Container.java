package io.github.whyareyousoseriously.marathonspringbootstarter.marathon.pojo.v2app;

import java.util.ArrayList;
import java.util.List;

public class Container {

    private String type;
    private Docker docker;
    private List<Object> volumes = new ArrayList<Object>();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Docker getDocker() {
        return docker;
    }

    public void setDocker(Docker docker) {
        this.docker = docker;
    }

    public List<Object> getVolumes() {
        return volumes;
    }

    public void setVolumes(List<Object> volumes) {
        this.volumes = volumes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Container.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("docker");
        sb.append('=');
        sb.append(((this.docker == null)?"<null>":this.docker));
        sb.append(',');
        sb.append("volumes");
        sb.append('=');
        sb.append(((this.volumes == null)?"<null>":this.volumes));
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
        result = ((result* 31)+((this.volumes == null)? 0 :this.volumes.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.docker == null)? 0 :this.docker.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Container) == false) {
            return false;
        }
        Container rhs = ((Container) other);
        return ((((this.volumes == rhs.volumes)||((this.volumes!= null)&&this.volumes.equals(rhs.volumes)))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.docker == rhs.docker)||((this.docker!= null)&&this.docker.equals(rhs.docker))));
    }

}
