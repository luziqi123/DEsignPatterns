package StructuralPattern.CompositePattern;

/**
 * Created by R on 2016/8/18.
 */
public class RelativeLayout extends ViewGroup{

    public RelativeLayout(String id) {
        super(id);
    }

    @Override
    public void show() {
        System.out.println("相对布局容器：" + id + " 显示");
        for (AbstractView mChild : mChilds) {
            mChild.show();
        }
    }
}
