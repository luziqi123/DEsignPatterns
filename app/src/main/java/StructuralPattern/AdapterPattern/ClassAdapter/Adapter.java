package StructuralPattern.AdapterPattern.ClassAdapter;

/**
 * 适配器
 * 继承了基础库，同时实现了期望接口
 * 使得对外提供的接口使符合现在需求的
 * Created by R on 2016/8/17.
 */
public class Adapter extends Adaptee implements Target{

    @Override
    public void openDevice() {
        openBle();
    }

    @Override
    public void closeDevice() {
        closeBle();
    }
}
