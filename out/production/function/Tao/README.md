<<<<<<< HEAD
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
=======
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
>>>>>>> cb3bf96f2624d601a71f7311f854705a7e3a0999
  如➎所示。记住一点很重要，Lambda 表达式都可以扩写为原始的“匿名类”形式。所以当你觉得这个 Lambda 表达式很复杂不容易理解的时候，不妨把它扩写为“匿名类”形式来看。