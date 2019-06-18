package io.github.whyareyousoseriously.marathonspringbootstarter.marathon.pojo.v2app;

public class Env {

    private String jvmOpts;
    private String libprocessPort;
    private String renderUrl;
    private String javaOpts;

    public String getJvmOpts() {
        return jvmOpts;
    }

    public void setJvmOpts(String jvmOpts) {
        this.jvmOpts = jvmOpts;
    }

    public String getLibprocessPort() {
        return libprocessPort;
    }

    public void setLibprocessPort(String libprocessPort) {
        this.libprocessPort = libprocessPort;
    }

    public String getRenderUrl() {
        return renderUrl;
    }

    public void setRenderUrl(String renderUrl) {
        this.renderUrl = renderUrl;
    }

    public String getJavaOpts() {
        return javaOpts;
    }

    public void setJavaOpts(String javaOpts) {
        this.javaOpts = javaOpts;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Env.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("jvmOpts");
        sb.append('=');
        sb.append(((this.jvmOpts == null)?"<null>":this.jvmOpts));
        sb.append(',');
        sb.append("libprocessPort");
        sb.append('=');
        sb.append(((this.libprocessPort == null)?"<null>":this.libprocessPort));
        sb.append(',');
        sb.append("renderUrl");
        sb.append('=');
        sb.append(((this.renderUrl == null)?"<null>":this.renderUrl));
        sb.append(',');
        sb.append("javaOpts");
        sb.append('=');
        sb.append(((this.javaOpts == null)?"<null>":this.javaOpts));
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
        result = ((result* 31)+((this.libprocessPort == null)? 0 :this.libprocessPort.hashCode()));
        result = ((result* 31)+((this.javaOpts == null)? 0 :this.javaOpts.hashCode()));
        result = ((result* 31)+((this.jvmOpts == null)? 0 :this.jvmOpts.hashCode()));
        result = ((result* 31)+((this.renderUrl == null)? 0 :this.renderUrl.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Env) == false) {
            return false;
        }
        Env rhs = ((Env) other);
        return (((((this.libprocessPort == rhs.libprocessPort)||((this.libprocessPort!= null)&&this.libprocessPort.equals(rhs.libprocessPort)))&&((this.javaOpts == rhs.javaOpts)||((this.javaOpts!= null)&&this.javaOpts.equals(rhs.javaOpts))))&&((this.jvmOpts == rhs.jvmOpts)||((this.jvmOpts!= null)&&this.jvmOpts.equals(rhs.jvmOpts))))&&((this.renderUrl == rhs.renderUrl)||((this.renderUrl!= null)&&this.renderUrl.equals(rhs.renderUrl))));
    }

}
