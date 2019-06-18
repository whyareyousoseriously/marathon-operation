package io.github.whyareyousoseriously.marathonspringbootstarter.marathon.pojo;


import io.github.whyareyousoseriously.marathonspringbootstarter.marathon.pojo.v2app.App;

import java.util.ArrayList;
import java.util.List;

public class V2App {

    private List<App> apps = new ArrayList<App>();

    public List<App> getApps() {
        return apps;
    }

    public void setApps(List<App> apps) {
        this.apps = apps;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(V2App.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("apps");
        sb.append('=');
        sb.append(((this.apps == null)?"<null>":this.apps));
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
        result = ((result* 31)+((this.apps == null)? 0 :this.apps.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof V2App) == false) {
            return false;
        }
        V2App rhs = ((V2App) other);
        return ((this.apps == rhs.apps)||((this.apps!= null)&&this.apps.equals(rhs.apps)));
    }

}
