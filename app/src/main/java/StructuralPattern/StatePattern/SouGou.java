package StructuralPattern.StatePattern;

/**
 * 搜狗输入法
 * Created by YY on 2016/11/16.
 */
public class SouGou{

    private InputState mState;

    private ChinaInputState chinaInputState;
    private LetterInputState letterInputState;
    private CapitalInputState capitalInputState;

    /**
     *   这个状态用于存放之前的状态
     */
    InputState mLastState;

    public SouGou(){
        chinaInputState = new ChinaInputState(this);
        letterInputState = new LetterInputState(this);
        capitalInputState = new CapitalInputState(this);
        mState = chinaInputState;
    }

    public void downShift(){
        mState.downShift();
    }

    public void downLock(){
        mState.downLock();
    }

    public void print(){
        mState.print();
    }

    public ChinaInputState getChinaInputState() {
        return chinaInputState;
    }

    public void setChinaInputState(ChinaInputState chinaInputState) {
        this.chinaInputState = chinaInputState;
    }

    public LetterInputState getLetterInputState() {
        return letterInputState;
    }

    public void setLetterInputState(LetterInputState letterInputState) {
        this.letterInputState = letterInputState;
    }

    public CapitalInputState getCapitalInputState() {
        return capitalInputState;
    }

    public void setCapitalInputState(CapitalInputState capitalInputState) {
        this.capitalInputState = capitalInputState;
    }

    public void setState(InputState state){
        mState = state;
    }

    public InputState getState(){
        return mState;
    }

    /**
     * 这里提供了get set方法
     */

    public InputState getLastState() {
        return mLastState;
    }

    public void setLastState(InputState mLastState) {
        this.mLastState = mLastState;
    }
}
