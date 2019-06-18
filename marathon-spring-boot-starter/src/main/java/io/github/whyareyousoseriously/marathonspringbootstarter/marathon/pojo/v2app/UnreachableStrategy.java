package io.github.whyareyousoseriously.marathonspringbootstarter.marathon.pojo.v2app;

public class UnreachableStrategy {

    private Integer inactiveAfterSeconds;
    private Integer expungeAfterSeconds;

    public Integer getInactiveAfterSeconds() {
        return inactiveAfterSeconds;
    }

    public void setInactiveAfterSeconds(Integer inactiveAfterSeconds) {
        this.inactiveAfterSeconds = inactiveAfterSeconds;
    }

    public Integer getExpungeAfterSeconds() {
        return expungeAfterSeconds;
    }

    public void setExpungeAfterSeconds(Integer expungeAfterSeconds) {
        this.expungeAfterSeconds = expungeAfterSeconds;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(UnreachableStrategy.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("inactiveAfterSeconds");
        sb.append('=');
        sb.append(((this.inactiveAfterSeconds == null)?"<null>":this.inactiveAfterSeconds));
        sb.append(',');
        sb.append("expungeAfterSeconds");
        sb.append('=');
        sb.append(((this.expungeAfterSeconds == null)?"<null>":this.expungeAfterSeconds));
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
        result = ((result* 31)+((this.inactiveAfterSeconds == null)? 0 :this.inactiveAfterSeconds.hashCode()));
        result = ((result* 31)+((this.expungeAfterSeconds == null)? 0 :this.expungeAfterSeconds.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UnreachableStrategy) == false) {
            return false;
        }
        UnreachableStrategy rhs = ((UnreachableStrategy) other);
        return (((this.inactiveAfterSeconds == rhs.inactiveAfterSeconds)||((this.inactiveAfterSeconds!= null)&&this.inactiveAfterSeconds.equals(rhs.inactiveAfterSeconds)))&&((this.expungeAfterSeconds == rhs.expungeAfterSeconds)||((this.expungeAfterSeconds!= null)&&this.expungeAfterSeconds.equals(rhs.expungeAfterSeconds))));
    }

}
