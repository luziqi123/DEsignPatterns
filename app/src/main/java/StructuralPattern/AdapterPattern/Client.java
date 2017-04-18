package StructuralPattern.AdapterPattern;

import StructuralPattern.AdapterPattern.ClassAdapter.Adapter;
import StructuralPattern.AdapterPattern.ClassAdapter.Target;

/**
 * Created by R on 2016/8/16.
 */
public class Client {

    public void main(){
        Target target = new Adapter();
        target.openDevice();
        target.closeDevice();
    }
}
