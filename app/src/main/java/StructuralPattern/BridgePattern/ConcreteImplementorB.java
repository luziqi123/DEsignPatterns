package StructuralPattern.BridgePattern;

/**
 * 具体实现
 * Created by R on 2016/8/16.
 */
public class ConcreteImplementorB implements Implementor{

    @Override
    public void skill() {
        System.out.println("陪你滚呀滚~");
    }
}
