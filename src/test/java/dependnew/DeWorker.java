package dependnew;

import com.charles.platform.async.callback.ICallback;
import com.charles.platform.async.callback.IWorker;
import com.charles.platform.async.worker.WorkResult;
import com.charles.platform.async.wrapper.WorkerWrapper;

import java.util.Map;

/**
 * @author zhengyangxin
 * @date 2024/2/17
 */
public class DeWorker implements IWorker<String, User>, ICallback<String, User> {

    @Override
    public User action(String object, Map<String, WorkerWrapper> allWrappers) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new User("user0");
    }


    @Override
    public User defaultValue() {
        return new User("default User");
    }

    @Override
    public void begin() {
        //System.out.println(Thread.currentThread().getName() + "- start --" + System.currentTimeMillis());
    }

    @Override
    public void result(boolean success, String param, WorkResult<User> workResult) {
        System.out.println("worker0 的结果是：" + workResult.getResult());
    }

}
