package com.charles.platform.async.callback;

import com.charles.platform.async.worker.WorkResult;

/**
 * @author zhengyangxin
 * @date 2024/2/17
 */
@FunctionalInterface
public interface ICallback<T, V> {

    /**
     * 任务开始的监听
     */
    default void begin() {

    }

    /**
     * 耗时操作执行完毕后，就给value注入值
     */
    void result(boolean success, T param, WorkResult<V> workResult);
}
