package StructuralPattern.StatePattern;

/**
 * 中文状态
 * Created by YY on 2016/11/16.
 */

public class ChinaInputState implements InputState{

    SouGou mSouGou;

    public ChinaInputState(SouGou sougou){
        mSouGou = sougou;
    }

    @Override
    public void downShift() {
        mSouGou.setState(mSouGou.getLetterInputState());
    }

    @Override
    public void downLock() {
        mSouGou.setState(mSouGou.getCapitalInputState());
        /**
         * 在每次按Lock键的时候记录当前的状态
         */
        mSouGou.setLastState(this);
    }

    @Override
    public void print() {
        System.out.println("中文状态");
    }

}
