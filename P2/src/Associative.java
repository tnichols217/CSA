public class Associative {
    public final int One, Two, Three;

    public Associative (int one, int two, int three) {
        One = one;
        Two = two;
        Three = three;
    }

    public final int firstTwo() {
        return (One + Two) * Three;
    }
    
    public final int secondTwo() {
        return One + (Two * Three);
    }
}
