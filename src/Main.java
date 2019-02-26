import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello. Say something!");
       // int a = 5, b = 10;
        //int sum = a + b;
       // System.out.println("suma numerelor " + a + " si " + b + " este " + sum);
        Scanner scaner=new Scanner(System.in);
        //String ceamcitit = scaner.nextLine();
        //System.out.println("Am citit : " + ceamcitit);

        //citim actiuni 0-exit 1-suma 2-diferenta
        //ctrl shift / comenteaza mai multe
        System.out.println("citim actiuni 0-exit 1-suma 2-diferenta");
        int x=scaner.nextInt();
        if(x==0)
        {
            System.out.println("Am citit exit");
        }
        else
        {
            if(x==1) {
                int a = scaner.nextInt();
                int b = scaner.nextInt();
                int sum = a + b;
                System.out.println("suma numerelor " + a + " si " + b + " este " + sum);
            }
            else
            {
                if(x==2)
                {
                    int a = scaner.nextInt();
                    int b = scaner.nextInt();
                    int dif= a - b;
                    System.out.println("diferenta numerelor " + a + " si " + b + " este " + dif);
                }
                else
                    System.out.println("Am citit altceva" );

            }

        }



    }
}
