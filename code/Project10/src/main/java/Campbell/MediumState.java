package Campbell;

public class MediumState implements State{

    @Override
    public void pull(FanPullChain state) {
        state.setState(new HighState());
        System.out.println("High Speed");
    }
}
