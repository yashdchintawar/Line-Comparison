import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");

        Scanner in = new Scanner(System.in);

        System.out.println("Line 01 :- enter X1 and Y1 value");
        int x1 = in.nextInt();
        int y1 = in.nextInt();

        System.out.println("Line 01 :- enter X2 and Y2 value");
        int x2 = in.nextInt();
        int y2 = in.nextInt();

        double line1 = Math.sqrt( (x2 - x1) ^ 2 + (y2 - y1) ^ 2 );
    }
}
