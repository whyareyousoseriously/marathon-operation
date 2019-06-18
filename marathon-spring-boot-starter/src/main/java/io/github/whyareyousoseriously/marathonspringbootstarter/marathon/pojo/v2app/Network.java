package io.github.whyareyousoseriously.marathonspringbootstarter.marathon.pojo.v2app;

public class Network {

    private String mode;

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Network.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("mode");
        sb.append('=');
        sb.append(((this.mode == null)?"<null>":this.mode));
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
        result = ((result* 31)+((this.mode == null)? 0 :this.mode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Network) == false) {
            return false;
        }
        Network rhs = ((Network) other);
        return ((this.mode == rhs.mode)||((this.mode!= null)&&this.mode.equals(rhs.mode)));
    }

}
