package StructuralPattern.AdapterPattern.ClassAdapter;

/**
 * 现有的类
 * 代码库中已经有了这样一个工具类
 * 实现蓝牙的基本操作
 *
 * Created by R on 2016/8/17.
 */
public class Adaptee {

    public void openBle(){
        System.out.println("打开蓝牙");
    }

    public void closeBle(){
        System.out.println("关闭蓝牙");
    }
    
}
