package com.config.rhwayfun.springboot.rocketmq.mq;

import io.github.rhwayfun.springboot.rocketmq.starter.constants.RocketMqTopic;

/**
 * @author rhwayfun
 * @since 0.0.1
 */
public class DemoRocketMqTopic implements RocketMqTopic {
    @Override
    public String getTopic() {
        return "TopicA";
    }
}
