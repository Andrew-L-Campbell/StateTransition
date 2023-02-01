package Campbell;

public class FanPullChain {
    State lowState;
    State mediumState;
    State highState;
    State offState;

    State currentState = offState;

    public FanPullChain() {
        currentState = new OffState();
    }
    public void pull(){
        currentState.pull(this);
    }
    public void setState(State state){
        currentState = state;
    }
}
