package StructuralPattern.CompositePattern;

/**
 * Created by R on 2016/8/18.
 */
public class ImageView extends View{

    public ImageView(String id) {
        super(id);
    }

    @Override
    public void show() {
        System.out.println("图片控件：" + id + " 显示");
    }
}
