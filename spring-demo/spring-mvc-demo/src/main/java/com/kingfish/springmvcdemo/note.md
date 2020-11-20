# 1. Synchronized 和 loca 区别
 
 -  s 是 java关键字，lock是接口，实现类有 ReentrantLock 
 -  s 非公平锁， ReentrantLock 可选
 - s 不需要手动释放，R 需要
 - s 可以修饰方法和代码块， r 只能修饰代码块
 - s 底层是通过java字节码加monitorenter、monitorexit 实现，R 底层通过 AQS
 
 #  2. AQS  AbstractQueueSynchronized
 
 
