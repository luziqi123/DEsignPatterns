#创建型模式之 桥接模式

##前言
设想如果要绘制矩形、圆形、椭圆、正方形，我们至少需要4个形状类，这时如果绘制的图形需要具有不同的颜色，如红色、绿色、蓝色等，此时至少有如下两种设计方案：

- 第一种设计方案是为每一种形状都提供一套各种颜色的版本。
- 第二种设计方案是根据实际需要对形状和颜色进行组合

对于有两个变化维度（即两个变化的原因）的系统，采用方案二来进行设计系统中类的个数更少，且系统扩展更为方便。设计方案二即是桥接模式的应用。桥接模式将继承关系转换为关联关系，从而降低了类与类之间的耦合，减少了代码编写量。


##模式定义

桥接模式(Bridge Pattern)：将抽象部分与它的实现部分分离，使它们都可以独立地变化。它是一种对象结构型模式，又称为柄体(Handle and Body)模式或接口(Interface)模式。

##模式结构
桥接模式包含如下角色：

- **Abstraction**：抽象类
- **RefinedAbstraction**：扩充抽象类
- **Implementor**：实现类接口
- **ConcreteImplementor**：具体实现类

##UML类图
![摘自别的地方](http://img.blog.csdn.net/20160816015523583)

##适用场景

- **在以下情况下可以使用桥接模式：**

如果一个系统需要在构件的抽象化角色和具体化角色之间增加更多的灵活性，避免在两个层次之间建立静态的继承联系，通过桥接模式可以使它们在抽象层建立一个关联关系。
抽象化角色和实现化角色可以以继承的方式独立扩展而互不影响，在程序运行时可以动态将一个抽象化子类的对象和一个实现化子类的对象进行组合，即系统需要对抽象化角色和实现化角色进行动态耦合。
一个类存在两个独立变化的维度，且这两个维度都需要进行扩展。
虽然在系统中使用继承是没有问题的，但是由于抽象化角色和具体化角色需要独立变化，设计要求需要独立管理这两者。
对于那些不希望使用继承或因为多层次继承导致系统类的个数急剧增加的系统，桥接模式尤为适用。

- **看看大神怎么用**

一个Java桌面软件总是带有所在操作系统的视感(LookAndFeel)，如果一个Java软件是在Unix系统上开发的，那么开发人员看到的是Motif用户界面的视感；在Windows上面使用这个系统的用户看到的是Windows用户界面的视感；而一个在Macintosh上面使用的用户看到的则是Macintosh用户界面的视感，Java语言是通过所谓的Peer架构做到这一点的。Java为AWT中的每一个GUI构件都提供了一个Peer构件，在AWT中的Peer架构就使用了桥接模式

- **个人理解**

桥接模式解决了两个元素变化的问题，可以动态的为元素1设置不同的元素2，例如夜间模式，变化的维度就是时间和主题，白天可以设置为白色主题，夜间设置为黑色主题，并且再多变化也可以轻松扩展。

##高清有码

*否一可三坡：为了更容易理解，类名我用了桥接模式中的角色名，而方法名则是例子中的名字，如果看管您不喜欢，我在这给您磕头赔不是了……*

> 我们对妹子的抗性简直为0，反正我是这样，不知道要不要加们。没有了妹子如同患了色盲症一般，世界都没有了色彩。
> 不管高矮俊丑，妹子具都有makeYouHappy的功效，这样就抽象出一个妹子类了。好吧……丑去掉。
> 而makeYouHappy的技能简直五花八门，这样可以定义出一个实现类接口，而她们个个身怀绝技都有自己的skill技能。

**Abstraction抽象类接口**

```
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
```

**RefinedAbstractionA 、B抽象实现类A和B**

```
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
```

```
/**
 * 抽象类实现类
 * Created by R on 2016/8/16.
 */
public class RefinedAbstractionB extends Abstraction{

    public RefinedAbstractionB(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void makeYouHappy() {
        System.out.println("B类型的妹子");
        mImp.skill();
    }
    
}

```

**Implementor实现类接口**

```
/**
 * 实现类接口
 * Created by R on 2016/8/16.
 */
public interface Implementor {

    void skill();
}
```

**ConcreteImplementorA、B具体实现 A 和 B**

```
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
```

```
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
```

**Client使用者**

```
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
```


**输出：**
A类型的妹子
陪你撸啊撸
B类型的妹子
陪你滚呀滚

##总结

> 理解桥接模式，重点需要理解如何将抽象化(Abstraction)与实现化(Implementation)脱耦，使得二者可以独立地变化。别名"柄体模式(Head and Body)"更能形象的表达他的模式结构，他由一个抽象类Head和一个实现接口Body。抽象话把不同的实体当做同样的实体对待；实现化针对抽象化给出的具体实现。他们之间是可逆的。
> 简而言之：同一个世界，不同的梦想！

##感谢

[车和引擎的例子](http://blog.csdn.net/shaopeng5211/article/details/8827507)

[所有文章全部参考了这个网站](http://design-patterns.readthedocs.io/zh_CN/latest/structural_patterns/bridge.html#id5)