[TOC]

#2.创建型模式之 桥接模式

##爱看不看
设想如果要绘制矩形、圆形、椭圆、正方形，我们至少需要4个形状类，这时如果绘制的图形需要具有不同的颜色，如红色、绿色、蓝色等，此时至少有如下两种设计方案：

- 第一种设计方案是为每一种形状都提供一套各种颜色的版本。
- 第二种设计方案是根据实际需要对形状和颜色进行组合

对于有两个变化维度（即两个变化的原因）的系统，采用方案二来进行设计系统中类的个数更少，且系统扩展更为方便。设计方案二即是桥接模式的应用。桥接模式将继承关系转换为关联关系，从而降低了类与类之间的耦合，减少了代码编写量。

##模式定义
桥接模式(Bridge Pattern)：将抽象部分与它的实现部分分离，使它们都可以独立地变化。它是一种对象结构型模式，又称为柄体(Handle and Body)模式或接口(Interface)模式。

##模式结构
桥接模式包含如下角色：

- Abstraction：抽象类
- RefinedAbstraction：扩充抽象类
- Implementor：实现类接口
- ConcreteImplementor：具体实现类

##清明上河图
![](http://i.imgur.com/Rzk6sJr.png)

##高清有码

    ``
/**
 * 实现类接口
 * Created by R on 2016/8/16.
 */
public interface Implementor {

    void giveYourPower();
}
    ``


**Client**

    /**
     * 使用者
     * Created by R on 2016/8/16.
     */
    public class Client {
    
		    public void main(){
		    new RefinedAbstractionA(new ConcreteImplementorA()).makeYouHappy();
		    new RefinedAbstractionB(new ConcreteImplementorB()).makeYouHappy();
    	}
    }

****

##总结

> 理解桥接模式，重点需要理解如何将抽象化(Abstraction)与实现化(Implementation)脱耦，使得二者可以独立地变化。别名"柄体模式(Head and Body)"更能形象的表达他的模式结构，他由一个抽象类Head和一个实现接口Body。抽象话把不同的实体当做同样的实体对待；实现化针对抽象化给出的具体实现。他们之间是可逆的。
