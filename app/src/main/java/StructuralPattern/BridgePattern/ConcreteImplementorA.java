package StructuralPattern.BridgePattern;

/**
 * 具体实现
 * Created by R on 2016/8/16.
 */
public class ConcreteImplementorA implements Implementor{

    @Override
    public void skill() {
        System.out.println("陪你撸啊撸~");
    }
}
