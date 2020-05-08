package io.github.whyareyousoseriously.marathonspringbootstarter.marathon;


import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.google.common.collect.Maps;
import io.github.whyareyousoseriously.marathonspringbootstarter.marathon.pojo.*;
import io.github.whyareyousoseriously.marathonspringbootstarter.marathon.pojo.v2Deployment.Deployment;

import java.util.List;
import java.util.Map;

/**
 * @author chenzhen
 * Created by chenzhen on 2019/5/21.
 */
public class Marathon {

    public static V2Queue getQueue(String ip,Integer port){
        String s = HttpUtil.sendGet("http://" + ip + ":" + port + "/v2/queue", Maps.newHashMap());
        return JSONObject.parseObject(s, V2Queue.class);
    }


    public static List<Deployment> getDeployments(String ip, Integer port){
        String s = HttpUtil.sendGet("http://" + ip + ":" + port + "/v2/deployments", Maps.newHashMap());
        return JSONObject.parseObject(s, new TypeReference<List<Deployment>>(){});
    }

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
