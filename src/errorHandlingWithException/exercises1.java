package errorHandlingWithException;

class Exception1 extends Exception{
    Exception1(String msg){
        super(msg);
        System.out.printf("Exception1(String msg");
    }
}
public class exercises1 {
    public static void f() throws Exception1 {
        System.out.println("Throwing MyException from f()");
        throw new Exception1("from f()");
    }

    public static void main(String[] args) {
        try{
            f();
        }catch (Exception1 e){
            System.out.printf("caught exception1");
            e.printStackTrace();
        }finally {
            System.out.println("to finally!");
        }
    }
}
