package inface;

interface CanDo {
    void doIt();
}

interface CanDo1 extends CanDo{
    void doIt1();
}

interface CanDo2 extends CanDo{
    void doIt2();
}

interface  CanDo3 extends CanDo1,CanDo2{
    void doIt3();
}

class Doer implements CanDo3{

    @Override
    public void doIt() {

    }

    @Override
    public void doIt1() {

    }

    @Override
    public void doIt2() {

    }

    @Override
    public void doIt3() {

    }
}
public class exercise13 {
    public static void main(String[] args) {
        Doer d= new Doer();
        ((CanDo3)d).doIt3();
        ((CanDo2)d).doIt2();
        ((CanDo1)d).doIt1();

    }
}
