# Java  函数式接口

- 函数式接口(Functional Interface)就是一个有且仅有一个抽象方法，但是可以有多个非抽象方法的接口。

- 函数式接口可以被隐式转换为 lambda 表达式。

- 函数式接口可以对现有的函数友好地支持 lambda。

JDK 1.8 之前已有的函数式接口:

- java.lang.Runnable
- java.util.concurrent.Callable
- java.security.PrivilegedAction
- java.util.Comparator
- java.io.FileFilter
- java.nio.file.PathMatcher
- java.lang.reflect.InvocationHandler
- java.beans.PropertyChangeListener
- java.awt.event.ActionListener
- javax.swing.event.ChangeListener

JDK 1.8 新增加的函数接口：

- java.util.function



## (补充)Java之多线程之Callable与Future

从 Java 5 开始出现了 java.util.concurrent 包，该包在多线程环境中应用广泛。

### 一、 java.util.concurrent.Callable

![1582444172245](https://ae01.alicdn.com/kf/U2cdda50f6e1343ae858346a513764b2eA.png)

Callable 接口 与 Runnable 接口类似，不同的是它们的唯一的 run 方法：

1、Callable 有返回值，Runnable 没有。

Callable 的 run() 方法使用了 泛型类，可以返回任意类型的值。

2、Callable 抛出异常 ，Runnable 没有抛出。

同时 java.util.concurrent.Executors 提供了许多方法，可以操控 Callable 在线程池中运行。

### 二、java.util.concurrent.Future

Executors 执行 Callable 时会返回一个 Future 对象。使用 Future 我们可以得知 Callable 的运行状态，
以及获取 Callable 执行完后的返回值。

Future 的方法介绍：

    - get() ：阻塞式，用于获取 Callable/Runnable 执行完后的返回值。
              带时间参数的get()重载方法用于最多等待的时间后，如仍未返回则线程将继续执行。
    
    - cancel() ：撤销正在执行 Callable 的 Task。
    
    - isDone()：是否执行完毕。
    
    - isCancelled()：任务是否已经被取消。

### 三、使用实例

    100个任务各耗时 1 秒，用 10 个线程并行执行。