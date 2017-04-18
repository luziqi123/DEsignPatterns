package StructuralPattern.CompositePattern;

import java.util.LinkedList;

/**
 * 容器控件的父类
 * Created by R on 2016/8/18.
 */
public abstract class ViewGroup implements AbstractView{

    String id;

    public ViewGroup(String id){
        this.id = id;
    }

    protected LinkedList<AbstractView> mChilds = new LinkedList<>();

    @Override
    public void addView(AbstractView view) {
        mChilds.add(view);
    }

    @Override
    public void removeView(AbstractView view) {
        mChilds.remove(view);
    }

}
