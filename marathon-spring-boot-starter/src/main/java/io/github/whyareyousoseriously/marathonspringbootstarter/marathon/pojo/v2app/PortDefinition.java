package io.github.whyareyousoseriously.marathonspringbootstarter.marathon.pojo.v2app;

public class PortDefinition {

    private Integer port;
    private String protocol;

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PortDefinition.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("port");
        sb.append('=');
        sb.append(((this.port == null)?"<null>":this.port));
        sb.append(',');
        sb.append("protocol");
        sb.append('=');
        sb.append(((this.protocol == null)?"<null>":this.protocol));
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
        result = ((result* 31)+((this.port == null)? 0 :this.port.hashCode()));
        result = ((result* 31)+((this.protocol == null)? 0 :this.protocol.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PortDefinition) == false) {
            return false;
        }
        PortDefinition rhs = ((PortDefinition) other);
        return (((this.port == rhs.port)||((this.port!= null)&&this.port.equals(rhs.port)))&&((this.protocol == rhs.protocol)||((this.protocol!= null)&&this.protocol.equals(rhs.protocol))));
    }

}
