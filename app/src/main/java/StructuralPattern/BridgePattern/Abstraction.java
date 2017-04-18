package StructuralPattern.BridgePattern;

/**
 * 抽象类接口
 * Created by R on 2016/8/16.
 */
public abstract class Abstraction {

    protected Implementor mImp;

    public Abstraction(Implementor implementor){
        this.mImp = implementor;
    }

    public abstract void makeYouHappy();

}
