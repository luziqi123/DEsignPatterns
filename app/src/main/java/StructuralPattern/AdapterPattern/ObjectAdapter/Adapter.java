package StructuralPattern.AdapterPattern.ObjectAdapter;

/**
 * 适配器
 * 持有基础库对象
 * 使得对外提供的接口使符合现在需求的
 * Created by R on 2016/8/17.
 */
public class Adapter implements Target{

    private Adaptee mAdaptee;

    public Adapter(Adaptee adaptee){
        mAdaptee = adaptee;
    }

    @Override
    public void openDevice() {
        mAdaptee.openBle();
    }

    @Override
    public void closeDevice() {
        mAdaptee.closeBle();
    }
}
