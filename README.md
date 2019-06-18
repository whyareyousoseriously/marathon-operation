# marathon-operation

## Introduction
获取marathon的apps和tasks信息,监听marathon的eventbus变动

## Documentation
- [中文文档](http://wwww.xuewuzhijing9981.top/marathon-spring-boot-starter)

## Features
- 1、获取marathon的apps信息和tasks信息。
- 2、监听marathon上所有app和task的变动信息。

## Getting started
maven
```
<dependency>
  <groupId>io.github.whyareyousoseriously</groupId>
  <artifactId>marathon-spring-boot-starter</artifactId>
  <version>0.0.1-RELEASE</version>
</dependency>
```
### 获取apps和tasks的示例如下
- 1、方法一
```
  V2App v2App = Marathon.getApps("localhost", 2222);
  V2Task v2Task = Marathon.getTasks("localhost", 2222);
```
- 2、方法二
此方法适用于获取apps和tasks需要认证的情况，可以将认证信息放在header中
```
  Map<String,String> header = Maps.newHashMap();
  V2App v2App = Marathon.getApps("http://localhost:2222/v2/apps", header);
  V2Task v2Task = Marathon.getTasks("http://localhost:2222/v2/tasks", header);
```
### 监听marathon的变动示例如下
- 1、定义marathonEventHandler
```
import com.launchdarkly.eventsource.EventHandler;
import com.launchdarkly.eventsource.MessageEvent;
import io.github.whyareyousoseriously.marathonspringbootstarter.event.api.MarathonApiPostEvent;
import io.github.whyareyousoseriously.marathonspringbootstarter.event.deployment.MarathonDeploymentResultEvent;
import io.github.whyareyousoseriously.marathonspringbootstarter.event.healthcheck.MarathonHealthcheckEvent;
import io.github.whyareyousoseriously.marathonspringbootstarter.event.status.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author chenzhen
 * Created by chenzhen on 2019/6/18.
 */
public class MarathonEventHandler implements EventHandler {

    private static final Logger log = LoggerFactory.getLogger(MarathonEventHandler.class);

    @Override
    public void onOpen() throws Exception {
        log.info("stream opened");
    }

    @Override
    public void onClosed() throws Exception {
        log.info("stream closed");
    }

    @Override
    public void onMessage(String event, MessageEvent messageEvent) throws Exception {
        switch (event) {
            case MarathonHealthcheckEvent.FAILED_HEALTH_CHECK_EVENT:
                //此处书写逻辑
                log.info("health check event received. {}",messageEvent.getData());
                break;
            case MarathonHealthcheckEvent.HEALTH_STATUS_CHANGED_EVENT:
                //此处书写逻辑
                log.info("health status changed event received. {}",messageEvent.getData());
                break;
            case MarathonHealthcheckEvent.UNHEALTHY_TASK_KILL_EVENT:
                //此处书写逻辑
                log.info("task kill messageEvent received.{}",messageEvent.getData());
                break;
            case MarathonDeploymentResultEvent.DEPLOYMENT_SUCCESS: {
                //此处书写逻辑
                log.info("deployment success messageEvent received.{}",messageEvent.getData());
                break;
            }
            case MarathonDeploymentResultEvent.DEPLOYMENT_FAILED: {
                //此处书写逻辑
                log.info("deployment failed messageEvent received.{}",messageEvent.getData());
                break;
            }
            case MarathonAppTerminatedEvent
                    .APP_TERMINATED_EVENT:{
                //此处书写逻辑
                log.info("app terminated messageEvent received.{}",messageEvent.getData());
                break;
            }
            case MarathonInstanceChangedEvent
                    .INSTANCE_CHANGED_EVENT:{
                //此处书写逻辑
                log.info("instance changed messageEvent received.{}",messageEvent.getData());
                break;
            }
            case MarathonInstanceHealthChangedEvent
                    .INSTANCE_HEALTH_CHANGED_EVENT:{
                //此处书写逻辑
                log.info("instance health changed messageEvent received.{}",messageEvent.getData());
                break;
            }
            case MarathonUnknownInstanceTerminatedEvent
                    .UNKNOWN_INSTANCE_TERMINATED_EVENT:{
                //此处书写逻辑
                log.info("unknown instance terminated messageEvent received.{}",messageEvent.getData());
                break;
            }
            case MarathonStatusUpdateEvent
                    .STATUS_UPDATE_EVENT:{
                //此处书写逻辑
                log.info("status update messageEvent received.{}",messageEvent.getData());
                break;
            }
            case MarathonApiPostEvent
                    .API_POST_EVENT:{
                //此处书写逻辑
                log.info("api_post_event received.{}",messageEvent.getData());
                break;
            }
            default:
                //此处书写逻辑
                log.warn("messageEvent found in stream: " + messageEvent.getData());
                break;
        }
    }

    @Override
    public void onComment(String comment) throws Exception {
        log.debug("received a marathon event");
    }

    @Override
    public void onError(Throwable t) {
        log.error("Encountered EventSource error: " + t.getMessage());
        log.debug("", t);
    }
}
```
- 2、开始监听
```
  MarathonEventBusListener marathonEventBusListener = new MarathonEventBusListener("http://localhost:2222",new MarathonEventHandler());
  marathonEventBusListener.start();
```
