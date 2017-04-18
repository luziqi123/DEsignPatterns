package StructuralPattern.CompositePattern;

/**
 * Created by R on 2016/8/18.
 */
public class TextView extends View{

    public TextView(String id) {
        super(id);
    }

    @Override
    public void show() {
        System.out.println("文字控件：" + id + " 显示");
    }
}
