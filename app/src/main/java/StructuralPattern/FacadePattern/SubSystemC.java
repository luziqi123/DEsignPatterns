package StructuralPattern.FacadePattern;

/**
 * 子系统C
 * Created by R on 2016/8/21.
 */
public class SubSystemC {

    public void MakeTea(SubSystemA water, SubSystemB tea_leaf){
        System.out.println("将" + tea_leaf.getLeaf() + "和" + water.getWater() + "倒入紫砂壶");
    }
}
