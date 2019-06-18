package io.github.whyareyousoseriously.marathonspringbootstarter.marathon;


import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Maps;
import io.github.whyareyousoseriously.marathonspringbootstarter.marathon.pojo.V2App;
import io.github.whyareyousoseriously.marathonspringbootstarter.marathon.pojo.V2AppTask;
import io.github.whyareyousoseriously.marathonspringbootstarter.marathon.pojo.V2Task;

import java.util.Map;

/**
 * @author chenzhen
 * Created by chenzhen on 2019/5/21.
 */
public class Marathon {


    public static V2App getApps(String ip, Integer port){
        String s = HttpUtil.sendGet("http://" + ip + ":" + port + "/v2/apps", Maps.newHashMap());
        return JSONObject.parseObject(s, V2App.class);
    }

    public static V2Task getTasks(String ip, Integer port){
        String s = HttpUtil.sendGet("http://"+ip+":"+port+"/v2/tasks",Maps.newHashMap());
        return JSONObject.parseObject(s, V2Task.class);
    }

    public static V2AppTask getV2AppTask(String ip, Integer port, String appId){
        String s = HttpUtil.sendGet("http://"+ip+":"+port+"/v2/apps"+appId,Maps.newHashMap());
        return JSONObject.parseObject(s,V2AppTask.class);
    }

    public static V2App getApps(String url, Map<String,String> headers){
        String s = HttpUtil.sendGet(url,headers);
        return JSONObject.parseObject(s,V2App.class);
    }

    public static V2Task getTasks(String url,Map<String,String> headers){
        String s = HttpUtil.sendGet(url,headers);
        return JSONObject.parseObject(s,V2Task.class);
    }

    public static V2AppTask getV2AppTask(String url,Map<String,String> headers){
        String s = HttpUtil.sendGet(url,headers);
        return JSONObject.parseObject(s,V2AppTask.class);
    }
}
