package StructuralPattern.CompositePattern;

/**
 * Created by R on 2016/8/17.
 */
public class Client {

    public void main(){
        AbstractView view1 , view2 , view3, view4 , view5 , view6 , viewGroupRoot, viewGroup2, viewGroup3;

        viewGroupRoot = new LinearLayout("根布局");
        viewGroup2 = new RelativeLayout("容器1");
        viewGroup3 = new LinearLayout("容器2");

        view1 = new TextView("文本1");
        view2 = new TextView("文本2");
        view3 = new TextView("文本3");
        view4 = new ImageView("图片1");
        view5 = new ImageView("图片2");
        view6 = new ImageView("图片3");

        viewGroupRoot.addView(view1);
        viewGroupRoot.addView(viewGroup2);
        viewGroupRoot.addView(viewGroup3);

        viewGroup2.addView(view2);
        viewGroup2.addView(view3);

        viewGroup3.addView(view4);
        viewGroup3.addView(view5);
        viewGroup3.addView(view6);

        viewGroup3.removeView(view6);

        viewGroupRoot.show();
    }
}
