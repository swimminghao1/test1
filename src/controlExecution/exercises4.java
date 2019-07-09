package controlExecution;

public class exercises4 {
    static Boolean isPrime(int n){
        if (n <2) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2==0){
            return false;
        }

        for (int i=3;i*i<=n;i+=2){
            if (n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
      /*  for(int i = 1; i < 1000; i++ ) {
            int factors = 0;
            for(int j = 1; j < (i + 2)/2; j++ ) {
                if((i % j) == 0) factors++;
            }
            if(factors < 2) System.out.println(i + " is prime");
        }*/

      for (int i=0;i<1000;i++){
          if (isPrime(i)){
              System.out.println(i);
          }
      }
    }
}
