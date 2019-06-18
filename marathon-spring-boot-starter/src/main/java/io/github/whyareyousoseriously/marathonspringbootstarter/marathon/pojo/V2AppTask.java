package io.github.whyareyousoseriously.marathonspringbootstarter.marathon.pojo;


import io.github.whyareyousoseriously.marathonspringbootstarter.marathon.pojo.v2app.App;

/**
 * @author chenzhen
 * Created by chenzhen on 2019/5/22.
 */
public class V2AppTask {
    private App app;

    public App getApp() {
        return app;
    }

    public void setApp(App app) {
        this.app = app;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(V2AppTask.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("app");
        sb.append('=');
        sb.append(((this.app == null)?"<null>":this.app));
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
        result = ((result* 31)+((this.app == null)? 0 :this.app.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof V2AppTask) == false) {
            return false;
        }
        V2AppTask rhs = ((V2AppTask) other);
        return ((this.app == rhs.app)||((this.app != null)&&this.app.equals(rhs.app)));
    }
}
