package controlExecution;

import java.util.Random;

public class exercises2 {
    public static void main(String[] args) {
        Random rand1 = new Random();
        Random rand2 = new Random();
        for (int a = 0; a < 25; a++) {
            System.out.printf(a+":");
            int i = rand1.nextInt();
            int j = rand2.nextInt();
            if (i<j) System.out.println(i+"<"+j);
            else if (i>j) System.out.println(i+">"+j);
            else System.out.println(i+"="+j);
            System.out.println("testgit");
            System.out.println("testgit");
            System.out.println("testgit");
            System.out.println("testgit");
            System.out.println("testgit");
        }

    }
}
