package io.github.whyareyousoseriously.marathonspringbootstarter.marathon.pojo.v2queue;

public class Delay {

    private Integer timeLeftSeconds;
    private Boolean overdue;

    public Integer getTimeLeftSeconds() {
        return timeLeftSeconds;
    }

    public void setTimeLeftSeconds(Integer timeLeftSeconds) {
        this.timeLeftSeconds = timeLeftSeconds;
    }

    public Boolean getOverdue() {
        return overdue;
    }

    public void setOverdue(Boolean overdue) {
        this.overdue = overdue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Delay.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("timeLeftSeconds");
        sb.append('=');
        sb.append(((this.timeLeftSeconds == null)?"<null>":this.timeLeftSeconds));
        sb.append(',');
        sb.append("overdue");
        sb.append('=');
        sb.append(((this.overdue == null)?"<null>":this.overdue));
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
        result = ((result* 31)+((this.overdue == null)? 0 :this.overdue.hashCode()));
        result = ((result* 31)+((this.timeLeftSeconds == null)? 0 :this.timeLeftSeconds.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Delay) == false) {
            return false;
        }
        Delay rhs = ((Delay) other);
        return (((this.overdue == rhs.overdue)||((this.overdue!= null)&&this.overdue.equals(rhs.overdue)))&&((this.timeLeftSeconds == rhs.timeLeftSeconds)||((this.timeLeftSeconds!= null)&&this.timeLeftSeconds.equals(rhs.timeLeftSeconds))));
    }

}
