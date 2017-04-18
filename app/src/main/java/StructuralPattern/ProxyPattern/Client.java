package StructuralPattern.ProxyPattern;


import StructuralPattern.ProxyPattern.SimpleProxy.Proxy;
import StructuralPattern.ProxyPattern.SimpleProxy.RealSubject;
import StructuralPattern.ProxyPattern.SimpleProxy.Subject;
import StructuralPattern.ProxyPattern.VirtualProxy.Scenery;
import StructuralPattern.ProxyPattern.VirtualProxy.TreeProxy;

/**
 * 用户
 * Created by L on 2016/12/13.
 */
public class Client {

    private static int visibility = 300;

    private static int coordinateX = 0;
    private static int coordinateY = 0;

    public static void main(){
        Scenery scenery = new TreeProxy(100 , 100);
        if (Math.abs(coordinateX - scenery.getX()) < visibility && Math.abs(coordinateY - scenery.getY()) < visibility){
            // 如果X和Y坐标都小于可视距离，那么我们开始渲染这棵树
            scenery.rendering();
        }
    }
}
