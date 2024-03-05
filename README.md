# MultiThreadTool

尽管CompletableFuture已提供了串并行等编排方案，但在回调和编排等场景上仍有不足，MultiThreadTool完善了多线程编排解决方案，支持任意组合线程执行顺序，全链路回调和超时控制。

## Feature

Async执行器触发WorkerWrapper包装器类执行，WorkerWrapper中包装了IWorker和ICallback，以及建立了多个Worker之间的相互依赖。

WorkerWrapper通过建造者模式构建，包括Worker，Depend，Callbank等，支持每个执行结果的回调 。

完善任务的弱依赖场景，支持并行执行时的任务跳过，支持上游任务结果作为入参。

使用ScheduledExecutor优化高并发下System.currentTimeMillis卡顿。

## Get Started

详见test包下的测试类，支持各种形式的组合、编排

