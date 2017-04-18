package StructuralPattern.CompositePattern;

/**
 * Created by R on 2016/8/18.
 */
public class LinearLayout extends ViewGroup{

    public LinearLayout(String id) {
        super(id);
    }

    @Override
    public void show() {
        System.out.println("线性布局容器：" + id + " 显示");
        for (AbstractView mChild : mChilds) {
            mChild.show();
        }
    }
}
