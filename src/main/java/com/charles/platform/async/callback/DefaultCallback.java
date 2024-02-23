package com.charles.platform.async.callback;

import com.charles.platform.async.worker.WorkResult;

/**
 * @author zhengyangxin
 * @date 2024/2/23
 */
public class DefaultCallback<T, V> implements ICallback<T, V> {
    @Override
    public void begin() {

    }

    @Override
    public void result(boolean success, T param, WorkResult<V> workResult) {

    }

}
