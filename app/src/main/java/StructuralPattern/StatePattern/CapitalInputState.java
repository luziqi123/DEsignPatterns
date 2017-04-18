package StructuralPattern.StatePattern;

/**
 * 大写状态
 * Created by YY on 2016/11/16.
 */

public class CapitalInputState implements InputState{

    SouGou mSouGou;

    public CapitalInputState(SouGou sougou){
        mSouGou = sougou;
    }

    @Override
    public void downShift() {
        /**
         *  之前是不做任何操作
         */
        mSouGou.setState(mSouGou.getLetterInputState());
    }

    @Override
    public void downLock() {
        //mSouGou.setState(mSouGou.getLetterInputState());
        /**
         * 这里注释掉之前的代码 改为下面这行
         */
        mSouGou.setState(mSouGou.getLastState());
    }

    @Override
    public void print() {
        System.out.println("大写英文状态");
    }
}
