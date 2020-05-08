package io.github.whyareyousoseriously.marathonspringbootstarter.marathon.pojo.v2queue;

import io.github.whyareyousoseriously.marathonspringbootstarter.marathon.pojo.v2app.App;

public class Queue {

    private App app;
    private Integer count;
    private Delay delay;

    public App getApp() {
        return app;
    }

    public void setApp(App app) {
        this.app = app;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Delay getDelay() {
        return delay;
    }

    public void setDelay(Delay delay) {
        this.delay = delay;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Queue.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("app");
        sb.append('=');
        sb.append(((this.app == null)?"<null>":this.app));
        sb.append(',');
        sb.append("count");
        sb.append('=');
        sb.append(((this.count == null)?"<null>":this.count));
        sb.append(',');
        sb.append("delay");
        sb.append('=');
        sb.append(((this.delay == null)?"<null>":this.delay));
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
        result = ((result* 31)+((this.count == null)? 0 :this.count.hashCode()));
        result = ((result* 31)+((this.delay == null)? 0 :this.delay.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Queue) == false) {
            return false;
        }
        Queue rhs = ((Queue) other);
        return ((((this.app == rhs.app)||((this.app!= null)&&this.app.equals(rhs.app)))&&((this.count == rhs.count)||((this.count!= null)&&this.count.equals(rhs.count))))&&((this.delay == rhs.delay)||((this.delay!= null)&&this.delay.equals(rhs.delay))));
    }

}
