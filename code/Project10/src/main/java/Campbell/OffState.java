package Campbell;

public class OffState implements State{

    @Override
    public void pull(FanPullChain state) {
        state.setState(new LowState());
        System.out.println("Low Speed");
    }
}
