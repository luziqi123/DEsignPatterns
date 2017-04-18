package StructuralPattern.FacadePattern;

/**
 * 外观模式
 * Created by R on 2016/8/21.
 */
public class Client {

    public void main(){
        AbstractFacade facade = ConfigFile.getFacade();
        facade.getTea();
    }
}
