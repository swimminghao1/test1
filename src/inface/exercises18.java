package inface;
import sun.text.normalizer.UnicodeMatcher;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.*;
interface Cycle { void drive();}

interface CycleFactory{Cycle getCycle();}

class Unicycle implements Cycle{

    @Override
    public void drive() {
        print("Unicycle drive");
    }
}

class UnicycleFactory implements CycleFactory{

    @Override
    public Cycle getCycle() {
        return new Unicycle();
    }
}

public class exercises18 {

    public static void driveCycle(CycleFactory cf){
        Cycle cycle = cf.getCycle();
        cycle.drive();
    }
    public static void main(String[] args) {

        driveCycle(new UnicycleFactory());
    }
}
