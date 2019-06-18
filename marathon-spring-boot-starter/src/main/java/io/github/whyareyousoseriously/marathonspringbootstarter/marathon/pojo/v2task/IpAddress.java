package io.github.whyareyousoseriously.marathonspringbootstarter.marathon.pojo.v2task;

public class IpAddress {

    private String ipAddress;
    private String protocol;

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
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
        sb.append(IpAddress.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ipAddress");
        sb.append('=');
        sb.append(((this.ipAddress == null)?"<null>":this.ipAddress));
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
        result = ((result* 31)+((this.ipAddress == null)? 0 :this.ipAddress.hashCode()));
        result = ((result* 31)+((this.protocol == null)? 0 :this.protocol.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IpAddress) == false) {
            return false;
        }
        IpAddress rhs = ((IpAddress) other);
        return (((this.ipAddress == rhs.ipAddress)||((this.ipAddress!= null)&&this.ipAddress.equals(rhs.ipAddress)))&&((this.protocol == rhs.protocol)||((this.protocol!= null)&&this.protocol.equals(rhs.protocol))));
    }

}
