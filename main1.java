import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner SC = new Scanner (System.in);
        int NUMBER = (int)(Math.random()*100);
        int num ;

        do {

            System.out.println("guess the number : ");
            num = SC.nextInt();

            if (num == NUMBER)  {
                System.out.println("wooohooo you guessed it correct ");
                break;

            }
            else if (num<NUMBER) {
                System.out.println("your number is too small : ");
            }

            else  {
                System.out.println("your number is too big :  ");
            }
        } while (num>=0);

        System.out.print("my number was :  ");
        System.out.println(NUMBER);
    }
}