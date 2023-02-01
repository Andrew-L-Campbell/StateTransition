package Campbell;

public class HighState implements State{

    @Override
    public void pull(FanPullChain state) {
        state.setState(new OffState());
        System.out.println("Fan Off");
    }
}
