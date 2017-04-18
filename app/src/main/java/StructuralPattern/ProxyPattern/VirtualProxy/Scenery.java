package StructuralPattern.ProxyPattern.VirtualProxy;

/**
 * 布景接口
 * Created by L on 2016/12/14.
 */
public interface Scenery {

    /**
     * 获取X坐标
     * @return
     */
    int getX();

    /**
     * 获取Y坐标
     */
    int getY();

    /**
     * 获取布景的大小
     */
    int getSize();

    /**
     * 3D渲染
     */
    void rendering();

}
