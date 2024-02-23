package com.charles.platform.async.callback;

import com.charles.platform.async.wrapper.WorkerWrapper;

import java.util.Map;

/**
 * @author zhengyangxin
 * @date 2024/2/17
 */
@FunctionalInterface
public interface IWorker<T, V> {
    /**
     * 在这里做耗时操作，如rpc请求、IO等
     *
     * @param object      object
     * @param allWrappers 任务包装
     */
    V action(T object, Map<String, WorkerWrapper> allWrappers);

    /**
     * 超时、异常时，返回的默认值
     *
     * @return 默认值
     */
    default V defaultValue() {
        return null;
    }
}
