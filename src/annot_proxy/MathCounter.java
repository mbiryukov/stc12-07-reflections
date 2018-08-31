package annot_proxy;

@Logged
public class MathCounter implements Counter {

    @Override
    public void count() {
        System.out.println("Counting...");
    }
}
