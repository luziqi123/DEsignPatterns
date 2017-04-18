package StructuralPattern.ProxyPattern.AccessProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import StructuralPattern.ProxyPattern.Client;

/**
 * Created by L on 2016/12/15.
 */
public class Test implements InvocationHandler {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Proxy.newProxyInstance(
                proxy.getClass().getClassLoader(),
                proxy.getClass().getInterfaces(),
                new Test());
        return null;
    }

}
