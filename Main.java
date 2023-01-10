import java.util.Arrays;
import java.util.Scanner;

public class Main {
    // methods and function

    public static void sum(int a, int b) {
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        sum(3,4);
        System.out.println("Hello world!");
        System.out.println("rrr");
        // sout
        System.out.println("reconsignments");
        System.out.println("goa");
        // variable
        String name = "rishi";
        int age =36;
        System.out.println("pink.col");
        byte agee = 55;
        System.out.println(name.length());
        String friend = "nishi";
        System.out.println("class 12 A");
        System.out.println("ggg bbb");
        int[] marks = new int[3];
        System.out.println(marks[2]);
        boolean[] tandf = new boolean[4];
        tandf[0] = false;
        tandf[1]= true ;


        System.out.println(marks.length);

        // sort

        Arrays.sort(marks);
        int[] vlog = {44,55,66};

        int[][] finalmarks = {{45,33,78},{55,66,77}};
        System.out.println(finalmarks[1][1]);

        // casting

        int p = 300;
        int fg = p + (int)18.0 ;
        System.out.println(fg);

        // constants

        final float PI = 3.14F;

        System.out.println(age);
        System.out.println(agee);
        System.out.println(friend);
        System.out.println(false);
        System.out.println(vlog[1]);
        System.out.println(PI);

        System.out.println(p++);
        System.out.println(p);

        System.out.println(Math.max(8,6));
        // min
        System.out.println(Math.random());

        // input
        Scanner sc = new Scanner(System.in);
        System.out.println("input your bio :");
        int bio = sc.nextInt();
        System.out.println(bio);

        // next()   for string
        // conditional statements

        if (tandf[0])
            System.out.println("gg");
        else
            System.out.println("ff");

        System.out.println("tiring");

        // logical operators
        // && and operator
        // || or operator
        // ! negation operator

        // Sample code 1

        Scanner sc2 = new Scanner(System.in);
        // pen 10 and book = 40

        int cash = sc2.nextInt();
        if(cash<10)  {
            System.out.println("cannot buy anything ");
            System.out.println("get more cash ");
        }

        else if(cash>10 && cash<50)    {
            System.out.println("can get 1 thing ");
        }

        else {
            System.out.println("can get both");
        }

        // conditional statements - SWITCH
        int day = 2;  // 1- monday ; 2- tuesday

        switch (day) {
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tuesday");
            default -> System.out.println("wed - sun");
        }

        // loops
        for(int i =0; i<=100; i++) {
            System.out.println(i);
        }
        // while
        int i = 100;
        while (i >=1)  {
            System.out.println(i);
            i-- ;
        }
        // do while
        int k =100 ;
        do {
            System.out.println(k);
            k = k - 1;
        } while (k>=1);

        // exercise
        int number;    // default value of int == 0
        Scanner input = new Scanner (System.in);
        do {
            System.out.println("input a number ");
            number = input.nextInt();
            System.out.print("here is your number : ");
            System.out.println(number);
        } while (number >=0);

        System.out.println("THE END");

        // break and continue

        int l = 0;
        while (true) {
            if (l==3) {
                l++;
                continue;
            }
            System.out.println(l);
            l++;
            if (l>5)  {
                break;
            }
        }
        // try catch in exception handling
        int[]  student = {44,65,47,23};
        try {
            System.out.println(student[6]);
        } catch (Exception exception)  {
            // do something after catching
            System.out.println("the index out of range");
        }

        System.out.println("the student name is rishi ");
        System.out.println("end of learning of basic java ");
    }

}