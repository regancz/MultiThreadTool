package com.charles.platform.async.callback;

import com.charles.platform.async.wrapper.WorkerWrapper;

import java.util.List;

/**
 * @author zhengyangxin
 * @date 2024/2/23
 */
public interface IGroupCallback {
    /**
     * 成功后，可以从wrapper里去getWorkResult
     */
    void success(List<WorkerWrapper> workerWrappers);
    /**
     * 失败了，也可以从wrapper里去getWorkResult
     */
    void failure(List<WorkerWrapper> workerWrappers, Exception e);
}
