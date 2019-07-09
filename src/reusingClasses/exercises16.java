package reusingClasses;

import static net.mindview.util.Print.*;
class Amphibian{
    static void grow(Amphibian a){
        print("Amphibian grow");
    }
}
public class exercises16 extends Amphibian{
    public static void main(String[] args) {
        exercises16 ex = new exercises16();

        Amphibian.grow(ex);
    }
}
