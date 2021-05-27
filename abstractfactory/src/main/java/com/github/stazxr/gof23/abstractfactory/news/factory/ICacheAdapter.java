package com.github.stazxr.gof23.abstractfactory.news.factory;

import java.util.concurrent.TimeUnit;

/**
 * 这个类的主要作⽤是让所有集群的提供⽅，能在统⼀的⽅法名称下进⾏操作。也方便后续的拓展
 */
public interface ICacheAdapter {
    String get(String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);
}
