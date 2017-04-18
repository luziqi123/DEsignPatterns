package StructuralPattern.ProxyPattern.SimpleProxy;

/**
 * 真正去做事的对象类，也就是我们说的被代理的对象
 * Created by L on 2016/12/13.
 */
public class RealSubject implements Subject {
    @Override
    public void function() {
        System.out.println("真正执行的function方法");
    }
}
