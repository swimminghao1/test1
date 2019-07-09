package inface;
interface CanDo0 {
    void doIt();
}

interface CanDoMore extends CanDo0 {
    void doMore();
}

interface CanDoFaster extends CanDo {
    void doFaster();
}

interface CanDoMost extends CanDoMore, CanDoFaster {
    void doMost();
}

class Doer1 implements CanDoMost {
    public void doIt() {}
    public void doMore() {}
    public void doFaster() {}
    public void doMost() {}
}

public class exercise13_1 {

    public static void main(String[] args) {
        Doer1 d = new Doer1();
        ((CanDoMore)d).doMore();
        ((CanDoFaster)d).doFaster();
        ((CanDo)d).doIt();
    }
}
