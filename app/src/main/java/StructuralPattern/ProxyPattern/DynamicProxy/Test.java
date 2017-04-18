package StructuralPattern.ProxyPattern.DynamicProxy;

import android.util.Log;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by L on 2017/1/1.
 */
public class Test {

    /**
     * 还记得前面那个超级简陋的代理模式么？他就相当于Subject
     * 在静态代理中，代理类和被代理类都要实现它
     * 以实现在任何被代理类可以出现的地方代理类都能代替他出现
     */
    interface UserSubject {
        void setName(String name , int age);
    }

    /**
     * 他就是被代理类了，真正干活的那个
     * 实现了UserSubject类
     */
    class User implements UserSubject {
        @Override
        public void setName(String name , int age) {
            System.out.println(name + "--" + age);
        }
    }

    /**
     * 回想一下静态代理的简单结构
     * 上面已经有了Subject和RealSubject
     * 如果是静态代理，我们要做的就是再写一个Proxy代理类来实现Subject
     * 在这个Proxy里面持有一个RealSubject实例
     * 在用户调用相应方法的时候我们去调用这个实例的对应方法
     * 并在这个方法之前或之后做一些我们想要干预的事。
     *
     * 那么动态代理到了这一步是怎么做的？
     * 如静态代理几乎一样，但他并没有实现Subject接口，而是实现InvocationHandler接口
     * 同时重写他的invoke()方法
     * 因为不管你调用代理类的任何方法，都会转发由invoke方法来执行
     * 因此你不用在每个对应方法中去调用被代理类的方法
     * invoke方法的介绍我们已经说过了
     */
    class DynamicProxy implements InvocationHandler{
        private Object user;
        public DynamicProxy(Object user){
            this.user = user;
        }
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            // TODO 在这里做你想干预的操作
            Object invoke = method.invoke(user, args);
            // TODO 当然在这里也可以
            return invoke;
        }
    }

    /**
     * 这就是完整的动态模式的代码实现了
     * 下面我们让他真正的工作起来
     */
    public void main(){
        // 首先我们创建这个被代理对象
        UserSubject user = new User();
        // 回顾静态代理模式，这里要做的就是创建一个代理实例了：Proxy proxy = new Proxy(subject);
        // 而在动态代理中，我们通过Java提供的Proxy的newProxyInstance来获取这个代理
        // 对于参数，我们前面已经有过说明
        UserSubject o = (UserSubject) Proxy.newProxyInstance(
                user.getClass().getClassLoader(),
                user.getClass().getInterfaces(),
                new DynamicProxy(user)
        );
        // 执行后输出 "小明--27"
        o.setName("小明" , 27);

        // 你可能会疑惑，这和我直接调用user.setName()有什么不同？
        // user和o不就是同一个对象么？
        // 通过 Proxy.newProxyInstance 创建的代理对象是在jvm运行时动态生成的一个对象
        // 它并不是我们的InvocationHandler类型，也不是我们定义的那组接口的类型
        // 而是在运行是动态生成的一个对象
        // 命名方式都是这样的形式，以$开头，proxy为中，最后一个数字表示对象的标号。
        // 说白了，Proxy.newProxyInstance方法为我们动态的创建了一个代理对象实例。

        // 输出：.Test$User--------------.$Proxy0 ，看到了？o的名字是$Proxy()
        // 输出：false
        // 所以他们不是同一个对象，我理解 o 可以看成是user的代理类的实例
        Log.i("Test" , user.getClass().getName() + "--------------" + o.getClass().getName());
        Log.i("Test" , (user == o) + "");
    }
}
