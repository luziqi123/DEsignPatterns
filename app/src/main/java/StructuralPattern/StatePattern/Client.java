package StructuralPattern.StatePattern;

/**
 * 模拟用户按下按键时候的操作
 * Created by L on 2016/11/17.
 */
public class Client {


    public void main(){

        SouGou souGou = new SouGou();
        souGou.print();

        souGou.downLock();
        souGou.print();

        souGou.downLock();
        souGou.print();

        souGou.downShift();
        souGou.print();

        souGou.downLock();
        souGou.print();

        souGou.downLock();
        souGou.print();

        souGou.downLock();
        souGou.print();

        souGou.downShift();
        souGou.print();
    }

}
