package StructuralPattern.FacadePattern;

/**
 * 假装他是配置文件
 * Created by R on 2016/8/21.
 */
public class ConfigFile {

    public static final Class<? extends AbstractFacade> facade = FacadeA.class;

    public static AbstractFacade getFacade() {
        try {
            return facade.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return new FacadeA();
    }
}
