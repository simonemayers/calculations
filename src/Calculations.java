import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n1 = n.nextInt();
        System.out.println("Enter another number: ");
        int n2 = n.nextInt();
        System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
        System.out.println(n1 + " - " + n2 + " = " + (n1-n2));
        System.out.println(n1 + " * " + n2 + " = " + (n1*n2));
        System.out.println(n1 + " / " + n2 + " = " + ((double)n1/(double)n2));
        System.out.println(n1 + " % " + n2 + " = " + (n1%n2));
    }
}
