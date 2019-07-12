package errorHandlingWithException;

class Exception4 extends Exception{
    private String msg;
    Exception4(String msg ){
        super(msg);
        System.out.printf("Exception4!");
        this.msg=msg;
    }
    protected void show(){
        System.out.println("Message from Exception4:"+ msg);
    }
}
public class exercises4 {
    public static void f() throws Exception4 {
        System.out.println("f():");
        throw new Exception4("from f()");
    }

    public static void main(String[] args) {
        try{
            f();
        }catch (Exception4 e){
            System.err.println("Caught Exception4");
            e.printStackTrace();
            e.show();
        }
    }
}
