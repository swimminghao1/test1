package errorHandlingWithException;

public class exercises2 {

    private static Integer i=null;

    public static void main(String[] args) {
        //System.out.printf(i.toString());
        try{
            System.out.println(i.toString());
        }catch (NullPointerException e){
            System.out.printf("Caught NullPointerException!");
            e.printStackTrace();
        }

        try{
            i=10;
            System.out.println(i.toString());
        }catch (NullPointerException e){
            System.out.printf("Caught NullPointerException!");
            e.printStackTrace();
        }finally {
            System.out.println("Got it!");
        }
    }
}
