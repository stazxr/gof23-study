package com.github.stazxr.gof23.abstractfactory.old.impl;

import com.github.stazxr.gof23.abstractfactory.RedisUtils;
import com.github.stazxr.gof23.abstractfactory.matter.EGM;
import com.github.stazxr.gof23.abstractfactory.matter.IIR;
import com.github.stazxr.gof23.abstractfactory.old.CacheService;

import java.util.concurrent.TimeUnit;

public class CacheServiceImpl implements CacheService {
    /**
     * 默认Redis
     */
    private RedisUtils redisUtils = new RedisUtils();

    /**
     * 集群1
     */
    private EGM egm = new EGM();

    /**
     * 集群2
     */
    private IIR iir = new IIR();

    public String get(String key, int redisType) {
        if (1 == redisType) {
            return egm.gain(key);
        } else if (2 == redisType) {
            return iir.get(key);
        } else {
            return redisUtils.get(key);
        }
    }

    public void set(String key, String value, int redisType) {
        if (1 == redisType) {
            egm.set(key, value);
        } else if (2 == redisType) {
            iir.set(key, value);
        } else {
            redisUtils.set(key, value);
        }
    }

    public void set(String key, String value, long timeout, TimeUnit timeUnit, int redisType) {
        if (1 == redisType) {
            egm.setEx(key, value, timeout, timeUnit);
        } else if (2 == redisType) {
            iir.setExpire(key, value, timeout, timeUnit);
        } else {
            redisUtils.set(key, value, timeout, timeUnit);
        }
    }

    public void del(String key, int redisType) {
        if (1 == redisType) {
            egm.delete(key);
        } else if (2 == redisType) {
            iir.del(key);
        } else {
            redisUtils.del(key);
        }
    }
}
