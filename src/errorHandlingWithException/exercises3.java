package errorHandlingWithException;

public class exercises3 {
    private static int[] i =new int[2];

    public static void main(String[] args) {
        try {
            i[2]= 3;

        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println("caught ArrayIndexOutOfBoundsException!");
            e.printStackTrace();
        }
    }
}
