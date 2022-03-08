import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");

        Scanner in = new Scanner(System.in);

        System.out.println("Line 01 :- enter X1 and Y1 value"); //enter value
        int line1X1 = in.nextInt();
        int line1Y1 = in.nextInt();
        System.out.println("Line 01 :- enter X2 and Y2 value");
        int line1X2 = in.nextInt();
        int line1Y2 = in.nextInt();

        int line1 =(int) Math.sqrt( (line1X2 - line1X1) ^ 2 + (line1Y2 - line1Y1) ^ 2 );
        System.out.println("Line One Length Is:- " + line1);


        System.out.println("Line 02 :- enter X1 and Y1 value"); //enter value
        int line2X1 = in.nextInt();
        int line2Y1 = in.nextInt();
        System.out.println("Line 02 :- enter X2 and Y2 value");
        int line2X2 = in.nextInt();
        int line2Y2 = in.nextInt();

        int line2 = (int)Math.sqrt( (line2X2 - line2X1) ^ 2 + (line2Y2 - line2Y1) ^ 2 );
        System.out.println("Line One Length Is:- " + line1);


        if (line1 == line2){
            System.out.println("Line 01 And Line 02 Is Equal");
        }
        else {
            System.out.println("Line 01 And Line 02 Is Not Equal");
        }
        }
    }