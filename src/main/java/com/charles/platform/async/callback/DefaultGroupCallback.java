package com.charles.platform.async.callback;

import com.charles.platform.async.wrapper.WorkerWrapper;

import java.util.List;

/**
 * @author zhengyangxin
 * @date 2024/2/23
 */
public class DefaultGroupCallback implements IGroupCallback {
    @Override
    public void success(List<WorkerWrapper> workerWrappers) {

    }

    @Override
    public void failure(List<WorkerWrapper> workerWrappers, Exception e) {

    }
}
