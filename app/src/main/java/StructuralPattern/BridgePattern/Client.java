package StructuralPattern.BridgePattern;

/**
 * 使用者
 * Created by R on 2016/8/16.
 */
public class Client {

    public void main(){
        Implementor impA = new ConcreteImplementorA();
        Implementor impB = new ConcreteImplementorB();

        Abstraction absA = new RefinedAbstractionA(impA);
        Abstraction absB = new RefinedAbstractionA(impB);

        absA.makeYouHappy();
        absB.makeYouHappy();
    }
}
