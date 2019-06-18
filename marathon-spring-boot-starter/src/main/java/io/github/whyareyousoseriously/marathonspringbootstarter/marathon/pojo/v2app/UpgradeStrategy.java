package io.github.whyareyousoseriously.marathonspringbootstarter.marathon.pojo.v2app;

public class UpgradeStrategy {

    private Integer maximumOverCapacity;
    private Integer minimumHealthCapacity;

    public Integer getMaximumOverCapacity() {
        return maximumOverCapacity;
    }

    public void setMaximumOverCapacity(Integer maximumOverCapacity) {
        this.maximumOverCapacity = maximumOverCapacity;
    }

    public Integer getMinimumHealthCapacity() {
        return minimumHealthCapacity;
    }

    public void setMinimumHealthCapacity(Integer minimumHealthCapacity) {
        this.minimumHealthCapacity = minimumHealthCapacity;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(UpgradeStrategy.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("maximumOverCapacity");
        sb.append('=');
        sb.append(((this.maximumOverCapacity == null)?"<null>":this.maximumOverCapacity));
        sb.append(',');
        sb.append("minimumHealthCapacity");
        sb.append('=');
        sb.append(((this.minimumHealthCapacity == null)?"<null>":this.minimumHealthCapacity));
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
        result = ((result* 31)+((this.minimumHealthCapacity == null)? 0 :this.minimumHealthCapacity.hashCode()));
        result = ((result* 31)+((this.maximumOverCapacity == null)? 0 :this.maximumOverCapacity.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UpgradeStrategy) == false) {
            return false;
        }
        UpgradeStrategy rhs = ((UpgradeStrategy) other);
        return (((this.minimumHealthCapacity == rhs.minimumHealthCapacity)||((this.minimumHealthCapacity!= null)&&this.minimumHealthCapacity.equals(rhs.minimumHealthCapacity)))&&((this.maximumOverCapacity == rhs.maximumOverCapacity)||((this.maximumOverCapacity!= null)&&this.maximumOverCapacity.equals(rhs.maximumOverCapacity))));
    }

}
