package io.github.whyareyousoseriously.marathonspringbootstarter.marathon.pojo;

import io.github.whyareyousoseriously.marathonspringbootstarter.marathon.pojo.v2queue.Queue;

import java.util.ArrayList;
import java.util.List;

public class V2Queue {

    private List<Queue> queue = new ArrayList<Queue>();

    public List<Queue> getQueue() {
        return queue;
    }

    public void setQueue(List<Queue> queue) {
        this.queue = queue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(V2Queue.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("queue");
        sb.append('=');
        sb.append(((this.queue == null)?"<null>":this.queue));
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
        result = ((result* 31)+((this.queue == null)? 0 :this.queue.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof V2Queue) == false) {
            return false;
        }
        V2Queue rhs = ((V2Queue) other);
        return ((this.queue == rhs.queue)||((this.queue!= null)&&this.queue.equals(rhs.queue)));
    }

}
