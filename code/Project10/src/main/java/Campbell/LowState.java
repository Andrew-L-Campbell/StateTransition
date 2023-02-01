package Campbell;

public class LowState implements State{

    @Override
    public void pull(FanPullChain state) {
        state.setState(new MediumState());
        System.out.println("Medium Speed");
    }
}
