package StructuralPattern.CompositePattern;

/**
 * 控件抽象类
 * Created by R on 2016/8/17.
 */
public interface AbstractView {

    void addView(AbstractView view);

    void removeView(AbstractView view);

    void show();

}
