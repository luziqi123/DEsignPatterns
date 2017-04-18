package StructuralPattern.FacadePattern;

/**
 * 外观角色 A
 * Created by R on 2016/8/21.
 */
public class FacadeB extends AbstractFacade{

    @Override
    void getTea() {
        SubSystemA water = new SubSystemA();
        SubSystemB leaf = new SubSystemB();
        new SubSystemC().MakeTea(water , leaf);
        System.out.println("倒掉第一泡，将第二泡倒入茶杯");
    }
}
