package io.github.whyareyousoseriously.marathonspringbootstarter.marathon.pojo.v2app;

import java.util.ArrayList;
import java.util.List;

public class Docker {

    private Boolean forcePullImage;
    private String image;
    private List<Object> parameters = new ArrayList<Object>();
    private Boolean privileged;

    public Boolean getForcePullImage() {
        return forcePullImage;
    }

    public void setForcePullImage(Boolean forcePullImage) {
        this.forcePullImage = forcePullImage;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<Object> getParameters() {
        return parameters;
    }

    public void setParameters(List<Object> parameters) {
        this.parameters = parameters;
    }

    public Boolean getPrivileged() {
        return privileged;
    }

    public void setPrivileged(Boolean privileged) {
        this.privileged = privileged;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Docker.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("forcePullImage");
        sb.append('=');
        sb.append(((this.forcePullImage == null)?"<null>":this.forcePullImage));
        sb.append(',');
        sb.append("image");
        sb.append('=');
        sb.append(((this.image == null)?"<null>":this.image));
        sb.append(',');
        sb.append("parameters");
        sb.append('=');
        sb.append(((this.parameters == null)?"<null>":this.parameters));
        sb.append(',');
        sb.append("privileged");
        sb.append('=');
        sb.append(((this.privileged == null)?"<null>":this.privileged));
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
        result = ((result* 31)+((this.privileged == null)? 0 :this.privileged.hashCode()));
        result = ((result* 31)+((this.image == null)? 0 :this.image.hashCode()));
        result = ((result* 31)+((this.parameters == null)? 0 :this.parameters.hashCode()));
        result = ((result* 31)+((this.forcePullImage == null)? 0 :this.forcePullImage.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Docker) == false) {
            return false;
        }
        Docker rhs = ((Docker) other);
        return (((((this.privileged == rhs.privileged)||((this.privileged!= null)&&this.privileged.equals(rhs.privileged)))&&((this.image == rhs.image)||((this.image!= null)&&this.image.equals(rhs.image))))&&((this.parameters == rhs.parameters)||((this.parameters!= null)&&this.parameters.equals(rhs.parameters))))&&((this.forcePullImage == rhs.forcePullImage)||((this.forcePullImage!= null)&&this.forcePullImage.equals(rhs.forcePullImage))));
    }

}
