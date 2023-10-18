package com.charles.platform.async.executor;

import com.charles.platform.async.wrapper.WorkerWrapper;

import java.util.concurrent.ExecutionException;

/**
 * @author zhengyangxin
 * @date 2023/10/18
 */

public class Async {
    /**
     * 同步阻塞,直到所有都完成,或失败
     */
    public static boolean beginWork(long timeout, WorkerWrapper... workerWrapper) throws ExecutionException, InterruptedException {
        return beginWork(timeout, COMMON_POOL, workerWrapper);
    }
}
