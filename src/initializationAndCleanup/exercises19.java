package initializationAndCleanup;

import static net.mindview.util.Print.*;

public class exercises19 {
    static void showStrings(String... args) {
        for(String s : args)
            System.out.print(s + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        showStrings("one", "TWO", "three", "four");
        showStrings(new String[]{"1", "2", "3", "4"});
        //Print("nihao");
        print("nihao");
    }
}
