package StructuralPattern.ProxyPattern.VirtualProxy;

/**
 * 树的代理类
 * Created by L on 2016/12/14.
 */
public class TreeProxy implements Scenery{

    /**
     * 树的被代理对象
     */
    Scenery mTreeScenery;
    /**
     * 这棵树的坐标
     */
    private int x , y;

    public TreeProxy(int x , int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int getX() {
        if (mTreeScenery == null){
            return this.x;
        }else{
            return mTreeScenery.getX();
        }
    }

    @Override
    public int getY() {
        if (mTreeScenery == null){
            return this.y;
        }else{
            return mTreeScenery.getY();
        }
    }

    @Override
    public int getSize() {
        if (mTreeScenery == null){
            return 30;
        }else{
            return mTreeScenery.getSize();
        }
    }

    /**
     * 当真正需要渲染的时候才去创建这棵树
     */
    @Override
    public void rendering() {
        if (mTreeScenery == null){
            mTreeScenery = new TreeScenery(x , y);
            mTreeScenery.rendering();
        }
    }
}
