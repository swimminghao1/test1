package innerClass;

import innerClass.WithInner.Inner;

class WithInner{
    class Inner{

    }
}
public class innerClassInherit extends WithInner.Inner{
    innerClassInherit( WithInner wi){
        wi.super();
        //enclosingClassReference.super();
    }

    public static void main(String[] args) {
        WithInner wi =new WithInner();
        innerClassInherit ii =new innerClassInherit(wi);
    }
}
