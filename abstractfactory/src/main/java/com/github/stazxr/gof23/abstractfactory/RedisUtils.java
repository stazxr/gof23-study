package com.github.stazxr.gof23.abstractfactory;

import lombok.extern.slf4j.Slf4j;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/**
 * 模拟单机服务 RedisUtils
 *
 * 综上可以看到，我们⽬前的系统中已经在⼤量的使⽤redis服务，但是因为系统不能满⾜业务的快速发
 * 展，因此需要迁移到集群服务中。⽽这时有两套集群服务需要兼容使⽤，⼜要满⾜所有的业务系统改造
 * 的同时不影响线上使⽤
 */
@Slf4j
public class RedisUtils {
    private Map<String, String> dataMap = new ConcurrentHashMap<>();

    public String get(String key) {
        log.info("Redis获取数据 key：{}", key);
        return dataMap.get(key);
    }

    public void set(String key, String value) {
        log.info("Redis写入数据 key：{} val：{}", key, value);
        dataMap.put(key, value);
    }

    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        log.info("Redis写入数据 key：{} val：{} timeout：{} timeUnit：{}", key, value, timeout, timeUnit.toString());
        dataMap.put(key, value);
    }

    public void del(String key) {
        log.info("Redis删除数据 key：{}", key);
        dataMap.remove(key);
    }
}
