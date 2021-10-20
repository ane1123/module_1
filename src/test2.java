import java.util.Scanner;
import java.util.Random;

public class test2 {
    public static void main(String[] args) {


        Random random = new Random();
        Scanner in = new Scanner(System.in);

        //int num = random.nextInt(5);
        //  System.out.println(num);



        System.out.println("из скольки цифр состоит число");
        int num = in.nextInt();
        if (num == 1){
            int min = 1;
            int max = 10;
            int x = (int)(Math.random()*((max-min)+1))+min;
            System.out.println(x);
        } else if (num == 2){
            int min = 10;
            int max = 99;
            int x = (int)(Math.random()*((max-min)+1))+min;
            System.out.println(x);
        } else if (num == 3) {
            int min = 100;
            int max = 999;
            int x = (int) (Math.random() * ((max - min) + 1)) + min;
            System.out.println(x);
        } else if (num == 4){
            int min = 1000;
            int max = 9999;
            int x = (int)(Math.random()*((max-min)+1))+min;
            System.out.println(x);
        } else if (num == 5) {
            int min = 10000;
            int max = 99999;
            int x = (int) (Math.random() * ((max - min) + 1)) + min;
            System.out.println(x);
        }else if (num == 6){
            int min = 100000;
            int max = 999999;
            int x = (int)(Math.random()*((max-min)+1))+min;
            System.out.println(x);
        } else if (num == 7) {
            int min = 1000000;
            int max = 9999999;
            int x = (int) (Math.random() * ((max - min) + 1)) + min;
            System.out.println(x);
        } else if (num == 8){
            int min = 10000000;
            int max = 99999999;
            int x = (int)(Math.random()*((max-min)+1))+min;
            System.out.println(x);
        } else if (num == 9) {
            int min = 100000000;
            int max = 999999999;
            int x = (int) (Math.random() * ((max - min) + 1)) + min;
            System.out.println(x);
        } else if (num == 10) {
            long min = 1000000000;
            long max = 1111111111;
            long max2 = max * 9;
            int max3 = (int) (max2);
            int x = (int) ((long) (Math.random() * ((max3 - min) + 1)) + min);
            System.out.println(x);
        }

    }
}

