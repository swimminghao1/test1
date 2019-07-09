package controlExecution;

public class exercises5 {
    static void BinaryPrint(int n){
        if (n==0){
            System.out.println(0);}
        else {
            int a = Integer.numberOfLeadingZeros(n);
            n<<=a;
            for (int i=0;i<32-a;i++){
                int b=(Integer.numberOfLeadingZeros(n)==0)?1:0;
                System.out.println(b);
                n<<=1;
            }
        }
    }

    public static void main(String[] args) {
        int h = 0x10000000;
        System.out.println(Integer.toBinaryString(h));
        System.out.println(h);
    }
}
