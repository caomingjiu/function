#函数式编程
##函数式编程介绍
* 我们最常用的面向对象编程（Java）属于命令式编程（Imperative Programming）这种编程范式。常见的编程范式还有逻辑式编程（Logic Programming），函数式编程（Functional Programming）。
* 函数式编程作为一种编程范式，在科学领域，是一种编写计算机程序数据结构和元素的方式，它把计算过程当做是数学函数的求值，而避免更改状态和可变数据。
* 函数式编程并非近几年的新技术或新思维，距离它诞生已有大概50多年的时间了。它一直不是主流的编程思维，但在众多的所谓顶级编程高手的科学工作者间，函数式编程是十分盛行的。
* 什么是函数式编程？简单的回答：一切都是数学函数。函数式编程语言里也可以有对象，但通常这些对象都是恒定不变的 —— 要么是函数参数，要什么是函数返回值。函数式编程语言里没有 for/next 循环，因为这些逻辑意味着有状态的改变。相替代的是，这种循环逻辑在函数式编程语言里是通过递归、把函数当成参数传递的方式实现的。
##JDK8之前已经有的函数式接口
* ava.lang.Runnable
* ava.util.concurrent.Callable
* ava.security.PrivilegedAction 
* ava.util.Comparator
* ava.io.FileFilter
* ava.nio.ﬁle.PathMatcher
* ava.lang.reﬂect.InvocationHandler
* ava.beans.PropertyChangeListener
* ava.awt.event.ActionListener
* avax.swing.event.ChangeListener
##JDK1.8新增加的函数式接口
* java.util.function
#Lambda 表达式
* Java 中 Lambda 表达式一共有五种基本形式，具体如下：
   * 1 
``` Runnable noArguments = () -> System.out.println("Hello World"); ``` <br>
➊中所示的 Lambda 表达式不包含参数,使用空括号 () 表示没有参数。该 Lambda 表达式 实现了 Runnable 接口,该接口也只有一个 run 方法,没有参数,且返回类型为 void。
   * 2
   ``` ActionListener oneArgument = event -> System.out.println("button clicked"); ``` <br>
   ➋中所示的 Lambda 表达式包含且只包含一个参数,可省略参数的括号,这和例 2-2 中的 形式一样。Lambda 表达式的主体不仅可以是一个表达式,而且也可以是一段代码块,使用大括号 ({})将代码块括起来
   * 3 ``` 
         Runnable multiStatement = () -> {
                  System.out.print("Hello");
                  System.out.println(" World");
              }; 
         ```  <br>
         如➌所示。该代码块和普通方法遵循的规则别无二致,可以用返 回或抛出异常来退出。只有一行代码的 Lambda 表达式也可使用大括号,用以明确 Lambda表达式从何处开始、到哪里结束。Lambda 表达式也可以表示包含多个参数的方法
   * 4
  ```BinaryOperator<Long> add = (x, y) -> x + y;``` <br>
  如➍所示。这时就有必要思考怎样去阅 读该 Lambda 表达式。这行代码并不是将两个数字相加,而是创建了一个函数,用来计算 两个数字相加的结果。变量 add 的类型是 BinaryOperator,它不是两个数字的和, 而是将两个数字相加的那行代码。到目前为止,所有 Lambda 表达式中的参数类型都是由编译器推断得出的。这当然不错, 但有时最好也可以显式声明参数类型,此时就需要使用小括号将参数括起来,多个参数的 情况也是如此。
  * 5
  ```BinaryOperator<Long> addExplicit = (Long x, Long y) -> x + y;```<br>
  如➎所示。记住一点很重要，Lambda 表达式都可以扩写为原始的“匿名类”形式。所以当你觉得这个 Lambda 表达式很复杂不容易理解的时候，不妨把它扩写为“匿名类”形式来看。
##小组合作作业分工
    管江宇：1.说明分工的MEADME.md文件
           2.思维导图
---
    陶永新&曾传志：从文档里提供的JDK8之前就存在的函数式接口中选做
---
    曹暝桕&侯粤嘉：从Stream/Function/Optional/Consumer中选做
---
    全体：从Stream/Function/Optional/Consumer中选做
###思维导图
![图片](https://uploader.shimo.im/f/kS2XwlBmkUMdqiap.jpg!thumbnail)

---
###代码及手抄图
    陶永新：
![图片](https://uploader.shimo.im/f/t0orbo95g2gBbuS1.png!thumbnail)
![图片](https://uploader.shimo.im/f/ZQKgsHw0p04geozu.png!thumbnail)
![图片](https://uploader.shimo.im/f/rYjJaVv4CV4Tv7eQ.png!thumbnail)
---
![图片](https://uploader.shimo.im/f/Y4BKdXMU37QI2hVH.png!thumbnail)
![图片](https://uploader.shimo.im/f/MSukNr9a13MILORf.png!thumbnail)
![图片](https://uploader.shimo.im/f/LriwTvAyXYc1Oa8N.png!thumbnail)
---
![图片](https://uploader.shimo.im/f/70sCgcfKc1AzgfFp.png!thumbnail)
![图片](https://uploader.shimo.im/f/cwHphzWUzV0VEaVH.png!thumbnail)
---
    曾传志：
![图片](https://uploader.shimo.im/f/GoNkXmx7kJgR4JBi.png!thumbnail)
![图片](https://uploader.shimo.im/f/ICHy7DNnRaIxol0C.png!thumbnail)
---
    曹瞑桕：
![图片](https://uploader.shimo.im/f/eE04xguhkWc8lh3E.png!thumbnail)
![图片](https://uploader.shimo.im/f/ULOppnyRWBEKDA8W.png!thumbnail)
![图片](https://uploader.shimo.im/f/8JhSc47uGREDbDA1.png!thumbnail)
---
![图片](https://uploader.shimo.im/f/Ppr74oaVTDMzUkdg.png!thumbnail)
![图片](https://uploader.shimo.im/f/bGvmjSHKe4MTP0oD.png!thumbnail)
---
    全体练习：
![图片](https://uploader.shimo.im/f/fv7iX1en7bwFw2nm.png!thumbnail)
![图片](https://uploader.shimo.im/f/uu4HVxh1tKIHV6WV.png!thumbnail)
![图片](https://uploader.shimo.im/f/bF7iVMaUGiUxtMht.png!thumbnail)

---
**手抄图**
![图片](https://uploader.shimo.im/f/tHIA8pTQGLYXPHym.jpg!thumbnail)
![图片](https://uploader.shimo.im/f/IgPhpYckgJIhcqlr.jpg!thumbnail)
![图片](https://uploader.shimo.im/f/PxRL9mVql2kjhHKk.jpg!thumbnail)
![图片](https://uploader.shimo.im/f/Kt8F9DU8Idwtvl5U.jpg!thumbnail)
![图片](https://uploader.shimo.im/f/VKziLMkzbqUmTi0x.jpg!thumbnail)



### (补充)Java之多线程之Callable与Future

从 Java 5 开始出现了 java.util.concurrent 包，该包在多线程环境中应用广泛。

#### 一、 java.util.concurrent.Callable

![1582444172245](https://ae01.alicdn.com/kf/U2cdda50f6e1343ae858346a513764b2eA.png)

Callable 接口 与 Runnable 接口类似，不同的是它们的唯一的 run 方法：

1、Callable 有返回值，Runnable 没有。

Callable 的 run() 方法使用了 泛型类，可以返回任意类型的值。

2、Callable 抛出异常 ，Runnable 没有抛出。

同时 java.util.concurrent.Executors 提供了许多方法，可以操控 Callable 在线程池中运行。

#### 二、java.util.concurrent.Future

Executors 执行 Callable 时会返回一个 Future 对象。使用 Future 我们可以得知 Callable 的运行状态，
以及获取 Callable 执行完后的返回值。

Future 的方法介绍：

    - get() ：阻塞式，用于获取 Callable/Runnable 执行完后的返回值。
              带时间参数的get()重载方法用于最多等待的时间后，如仍未返回则线程将继续执行。
    
    - cancel() ：撤销正在执行 Callable 的 Task。
    
    - isDone()：是否执行完毕。
    
    - isCancelled()：任务是否已经被取消。

#### 三、使用实例(见zeng.callable包)

    100个任务各耗时 1 秒，用 10 个线程并行执行。
