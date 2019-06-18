package io.github.whyareyousoseriously.marathonspringbootstarter.marathon.pojo;




import io.github.whyareyousoseriously.marathonspringbootstarter.marathon.pojo.v2task.Task;

import java.util.ArrayList;
import java.util.List;

public class V2Task {

    private List<Task> tasks = new ArrayList<Task>();

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(V2Task.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tasks");
        sb.append('=');
        sb.append(((this.tasks == null)?"<null>":this.tasks));
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
        result = ((result* 31)+((this.tasks == null)? 0 :this.tasks.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof V2Task) == false) {
            return false;
        }
        V2Task rhs = ((V2Task) other);
        return ((this.tasks == rhs.tasks)||((this.tasks!= null)&&this.tasks.equals(rhs.tasks)));
    }

}
