package StructuralPattern.ProxyPattern.SimpleProxy;

/**
 * 代理对象，他持有一个被代理对象的实例，然后去调用与他对应的方法
 * Created by L on 2016/12/13.
 */
public class Proxy implements Subject {

    Subject mSubject;

    public Proxy(Subject subject){
        mSubject = subject;
    }

    @Override
    public void function() {
        // TODO 真正调用之前要做的的事情
        mSubject.function();
    }
}
