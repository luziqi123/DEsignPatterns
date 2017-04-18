package StructuralPattern.BridgePattern;

/**
 * 抽象类实现类
 * Created by R on 2016/8/16.
 */
public class RefinedAbstractionA extends Abstraction{

    public RefinedAbstractionA(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void makeYouHappy() {
        System.out.println("A类型的妹子");
        mImp.skill();
    }

}
