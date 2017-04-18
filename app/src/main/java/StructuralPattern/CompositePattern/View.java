package StructuralPattern.CompositePattern;

/**
 * 子控件的父类
 * Created by R on 2016/8/18.
 */
public abstract class View implements AbstractView{

    String id;

    public View(String id){
        this.id = id;
    }

    @Override
    public void addView(AbstractView view) {
        System.out.println("该控件不支持此方法");
    }

    @Override
    public void removeView(AbstractView view) {
        System.out.println("该控件不支持此方法");
    }

}
