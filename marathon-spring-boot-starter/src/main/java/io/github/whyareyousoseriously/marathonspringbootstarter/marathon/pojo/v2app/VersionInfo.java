package io.github.whyareyousoseriously.marathonspringbootstarter.marathon.pojo.v2app;

public class VersionInfo {

    private String lastScalingAt;
    private String lastConfigChangeAt;

    public String getLastScalingAt() {
        return lastScalingAt;
    }

    public void setLastScalingAt(String lastScalingAt) {
        this.lastScalingAt = lastScalingAt;
    }

    public String getLastConfigChangeAt() {
        return lastConfigChangeAt;
    }

    public void setLastConfigChangeAt(String lastConfigChangeAt) {
        this.lastConfigChangeAt = lastConfigChangeAt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(VersionInfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("lastScalingAt");
        sb.append('=');
        sb.append(((this.lastScalingAt == null)?"<null>":this.lastScalingAt));
        sb.append(',');
        sb.append("lastConfigChangeAt");
        sb.append('=');
        sb.append(((this.lastConfigChangeAt == null)?"<null>":this.lastConfigChangeAt));
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
        result = ((result* 31)+((this.lastScalingAt == null)? 0 :this.lastScalingAt.hashCode()));
        result = ((result* 31)+((this.lastConfigChangeAt == null)? 0 :this.lastConfigChangeAt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VersionInfo) == false) {
            return false;
        }
        VersionInfo rhs = ((VersionInfo) other);
        return (((this.lastScalingAt == rhs.lastScalingAt)||((this.lastScalingAt!= null)&&this.lastScalingAt.equals(rhs.lastScalingAt)))&&((this.lastConfigChangeAt == rhs.lastConfigChangeAt)||((this.lastConfigChangeAt!= null)&&this.lastConfigChangeAt.equals(rhs.lastConfigChangeAt))));
    }

}
