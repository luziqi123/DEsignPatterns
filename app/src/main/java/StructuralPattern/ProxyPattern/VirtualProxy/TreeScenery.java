package StructuralPattern.ProxyPattern.VirtualProxy;

/**
 * 树的真是对象
 * Created by L on 2016/12/14.
 */
public class TreeScenery implements Scenery{

    /**
     * 这棵树的坐标
     */
    private int x , y;

    public TreeScenery(int x , int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int getX() {
        return this.x;
    }

    @Override
    public int getY() {
        return this.y;
    }

    @Override
    public int getSize() {
        return 120;
    }

    @Override
    public void rendering() {
        System.out.println("渲染阴影");
        System.out.println("锯齿优化");
        System.out.println("绘制颜色");
    }
}
